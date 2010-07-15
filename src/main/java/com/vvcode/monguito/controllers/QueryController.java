package com.vvcode.monguito.controllers;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.CommandResult;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import java.util.List;
import java.util.Set;

public class QueryController extends ApplicationController {

    public void excecuteQuery() {

//        String query = "db.testing.find();";
//        System.out.println(query);

        try {

            Mongo mongo = new Mongo("localhost", 27017);
            mongo.dropDatabase("monguito");


//            List<String> dbs = mongo.getDatabaseNames();
//            for (String d : dbs) {
//                System.out.println(">db: " + d);
//            }
//
            DB db = mongo.getDB("monguito");
            CommandResult fields = db.command("find();");

            

            Set<String> colls = db.getCollectionNames();

            for (String c : colls) {
                System.out.println(">Collection: " + c);
            }

//            dbs = mongo.getDatabaseNames();
//            for (String d : dbs) {
//                System.out.println(">db2: " + d);
//            }



            DBCollection collection = db.getCollection("test_database");



            for (int i = 0; i < 125; i++) {
                BasicDBObject object = new BasicDBObject();
                object.put("count", i);
                object.put("database", "mongo");
                object.put("type", "database");
                collection.insert(object);
            }
//
//            int i = 0;
//            DBCursor cursor = collection.find();
//            for (DBObject obj : cursor) {
//                System.out.println(i + ": " + obj.toString());
//                i++;
//            }


        } catch (Exception e) {
            System.out.println(e.toString());
        }


    }
}
