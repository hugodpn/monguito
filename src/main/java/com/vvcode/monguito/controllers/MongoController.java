package com.vvcode.monguito.controllers;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.vvcode.monguito.entities.Connection;
import java.util.List;
import java.util.Set;

class MongoController {

    private Mongo mongo;
    private DB db;
    private DBCollection dBCollection;
    private DBCursor cursor;

    public MongoController() {
        init();
    }

    private void init() {
        try {
//            mongo = new Mongo("localhost", 27017);
            mongo = new Mongo(Connection.getInstance().getHost(), Connection.getInstance().getPort());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public List<String> getDBs() {
        return mongo.getDatabaseNames();
    }

    public Set<String> getCollections(String dbName) {
        db = mongo.getDB(dbName);
        Set<String> coll = db.getCollectionNames();
        return coll;
    }

    public DBCursor find(String collection) {
        dBCollection = db.getCollection(collection);
        cursor = dBCollection.find();
        return cursor;
    }

    public void remove(String collection) {
        dBCollection = db.getCollection(collection);
        dBCollection.drop();
    }

    public void create(String collection) {
        dBCollection = db.createCollection(collection, new BasicDBObject());
        find(collection);
    }

    public void save(DBObject object, String collection) {
        dBCollection = db.getCollection(collection);
        dBCollection.insert(object);
    }

    public void remove(DBObject object, String collection) {
        dBCollection = db.getCollection(collection);
        dBCollection.remove(object);
    }

    void createDataBase(String dbName) {

        db = mongo.getDB(dbName);
        db.getCollectionNames();

    }

    void removeDB(String dbSelected) {
        mongo.dropDatabase(dbSelected);
    }

    public void update(DBObject object) {
        dBCollection.save(object);
    }
}
