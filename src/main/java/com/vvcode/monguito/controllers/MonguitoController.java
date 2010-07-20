package com.vvcode.monguito.controllers;

import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MonguitoController extends ApplicationController {

    private MongoController mongoController;
    private List<String> dataBases;
    private List<String> collections;
    private List<String> response;

    public MonguitoController() throws Exception {

        dataBases = new ArrayList<String>();
        collections = new ArrayList<String>();
        response = new ArrayList<String>();

        try {
            mongoController = new MongoController();
            dataBases = mongoController.getDBs();
        } catch (Exception exception) {
            throw exception;
        }

    }

    public List<String> getDataBases() {
        return dataBases;
    }

    public void setDataBases(List<String> dataBases) {
        this.dataBases = dataBases;
    }

    public List<String> getCollections() {
        return collections;
    }

    public void setCollections(List<String> collections) {
        this.collections = collections;
    }

    public void refreshCollections(String db) {
        Set<String> coll = getMongoController().getCollections(db);
        setCollections(new ArrayList<String>(coll));
    }

    public int find(String collection, int skip, int limit) {
        int count = getMongoController().find(collection).count();
        DBCursor dBCursor = getMongoController().find(collection).skip(skip * limit).limit(limit);

        setResponse(new ArrayList<String>());

        for (DBObject obj : dBCursor) {
            getResponse().add(obj.toString());
        }

        return count;
    }

    public List<String> getResponse() {
        return response;
    }

    public void setResponse(List<String> response) {
        this.response = response;
    }

    public void truncate(String collection) {
        getMongoController().remove(collection);
        getMongoController().create(collection);
    }

    public void remove(String collection) {
        getMongoController().remove(collection);
    }

    public boolean validateCollectionName(String collection) {
        if (collection.length() > 0 && (collection.split("\\.")).length == 1
                && !getCollections().contains(collection)) {
            return true;
        } else {
            return false;
        }
    }

    public void createCollection(String collection) {
        getMongoController().create(collection);
    }

    public void addToCollection(String jquery, String collection) {
        DBObject object = (DBObject) JSON.parse(jquery);
        getMongoController().save(object, collection);
    }

    public String getObjectId(int selectedIndex) {

        DBObject obj = (DBObject) JSON.parse(response.get(selectedIndex));
        return obj.get("_id").toString();

    }

    public void removeCollectionField(int selectedIndex, String collection) {
        DBObject obj = (DBObject) JSON.parse(response.get(selectedIndex));
        getMongoController().remove(obj, collection);

    }

    public void createDataBase(String db) {

        getMongoController().createDataBase(db);

    }

    public void removeDB(String dbSelected) {
        getMongoController().removeDB(dbSelected);
    }

    public MongoController getMongoController() {
        return mongoController;
    }

    public void setMongoController(MongoController mongoController) {
        this.mongoController = mongoController;
    }

    public DBObject getObjectBySelectedIndex(int selectedIndex) {
        return (DBObject) JSON.parse(response.get(selectedIndex));
    }

    public void update(DBObject obj) {
        mongoController.update(obj);
    }
}
