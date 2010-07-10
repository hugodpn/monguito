package com.vvcode.monguito.controllers;

import com.mongodb.Mongo;
import java.util.List;

public class QueryController extends ApplicationController {

    public void excecuteQuery() {

        String query = "db.testing.find();";
        System.out.println(query);

        try {

            Mongo mongo = new Mongo("localhost", 27017);

            List<String> dbs = mongo.getDatabaseNames();
            for (String db : dbs) {
                System.out.println(">db: " + db);
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }


    }
}
