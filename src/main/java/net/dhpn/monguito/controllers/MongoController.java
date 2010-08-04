package net.dhpn.monguito.controllers;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import net.dhpn.monguito.entities.Connection;
import net.dhpn.monguito.entities.Filter;

public class MongoController {

    private Mongo mongo;
    private DB db;
    private DBCollection collection;
    private DBCursor cursor;

    public MongoController() {
    }

    public void connectToDB(Connection connection) throws UnknownHostException {
        mongo = new Mongo(connection.getHost(), connection.getPort());
    }

    public List<String> getDataBaseNames() {
        return mongo.getDatabaseNames();
    }

    public List<String> getCollectionNames(String dataBaseName) {
        db = mongo.getDB(dataBaseName);
        Set<String> tmp = db.getCollectionNames();
        List<String> lst = new ArrayList<String>(tmp);
        return lst;
    }

    public DBCursor find(String collectionName) {
        collection = db.getCollection(collectionName);
        cursor = collection.find();
        return cursor;
    }

    public DBCursor find(String collectionName, int limit, int skip, List<Filter> filters) {
        collection = db.getCollection(collectionName);
        if (filters == null) {
            cursor = collection.find().skip(skip * limit).limit(limit);
        } else {

            BasicDBObject query = new BasicDBObject();
            for (Filter f : filters) {
                query.put(f.getKey(), f.getValue());
            }

            cursor = collection.find(query);

        }
        return cursor;
    }

    public void destroyCollection(String collectionName) {
        collection = db.getCollection(collectionName);
        collection.drop();
    }

    public void createCollection(String collectionName) {
        collection = db.createCollection(collectionName, new BasicDBObject());
        find(collectionName);
    }

    public void createDataBase(String dataBaseName) {
        db = mongo.getDB(dataBaseName);
        db.getCollectionNames();
    }

    public void removeDB(String dataBaseName) {
        mongo.dropDatabase(dataBaseName);
    }

    public void saveObject(DBObject object) {
        collection.insert(object);
    }

    public void removeObject(DBObject object) {
        collection.remove(object);
    }

    public void updateObject(DBObject object) {
        collection.save(object);
    }

    public int getTotalObjects(String collectionName) {
        return find(collectionName).count();
    }
}
