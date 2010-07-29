package net.dhpn.monguito.controllers;

import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import net.dhpn.monguito.entities.Connection;

public class MonguitoController {

    private MongoController mongoController;
    private List<String> dataBases;
    private List<String> collections;
    private List<String> strObjectsFound;
    private List<String> listSkip;
    private DBCursor collectionsCursor;
    private int totalObjects;
    private int selectedLimit;
    private int selectedSkip;
    private int calculatedSkip;
    private int collectionIndex;

    public MonguitoController() {
        dataBases = new ArrayList<String>();
        collections = new ArrayList<String>();
        strObjectsFound = new ArrayList<String>();
        listSkip = new ArrayList<String>();
        totalObjects = 0;
    }

    public List<String> getDataBases() {
        return dataBases;
    }

    public List<String> getCollections() {
        return collections;
    }

    public List<String> getObjectsFound() {
        return strObjectsFound;
    }

    public void connectTo(Connection connection) throws UnknownHostException {
        mongoController = new MongoController();
        mongoController.connectToDB(connection);
    }

    public void refreshDataBases() {
        dataBases = mongoController.getDataBaseNames();
        collections = new ArrayList<String>();
        strObjectsFound = new ArrayList<String>();
    }

    public void resetRequest() {
        dataBases = new ArrayList<String>();
        collections = new ArrayList<String>();
        strObjectsFound = new ArrayList<String>();
    }

    public void refreshCollections(String dataBaseName) {
        if (dataBaseName != null) {
            collections = mongoController.getCollectionNames(dataBaseName);
            strObjectsFound = new ArrayList<String>();
        } else {
            collections = new ArrayList<String>();
        }
    }

    public void find(String collection, int limit, int skip) {

        totalObjects = mongoController.getTotalObjects(collection);

        strObjectsFound = new ArrayList<String>();
        collectionsCursor = mongoController.find(collection, limit, skip);
        for (DBObject obj : collectionsCursor) {
            strObjectsFound.add(obj.toString());
        }

        setSelectedLimit(limit);
        setSelectedSkip(skip);
        calculateSkip();
    }

    public void findLastSkip(String collection, int limit) {

        totalObjects = mongoController.getTotalObjects(collection);
        setSelectedLimit(limit);
        calculateSkip();

        strObjectsFound = new ArrayList<String>();
        collectionsCursor = mongoController.find(collection, limit, Integer.parseInt(listSkip.get(listSkip.size() - 1)));

        for (DBObject obj : collectionsCursor) {
            strObjectsFound.add(obj.toString());
        }

        setSelectedLimit(limit);
        setSelectedSkip(Integer.parseInt(listSkip.get(listSkip.size() - 1)));
        calculateSkip();
    }

    public int getCountObjectsFound() {
        return strObjectsFound.size();
    }

    public int getCountTotalObjects() {
        return totalObjects;
    }

    public void calculateSkip() {

        setListSkip(new ArrayList<String>());
        getListSkip().add("0");
        int tmp = getSelectedLimit();
        setCalculatedSkip(0);
        while (tmp < totalObjects) {
            setCalculatedSkip(getCalculatedSkip() + 1);
            getListSkip().add(Integer.toString(getCalculatedSkip()));
            tmp += getSelectedLimit();
        }

    }

    public int getSelectedLimit() {
        return selectedLimit;
    }

    public void setSelectedLimit(int selectedLimit) {
        this.selectedLimit = selectedLimit;
    }

    public int getSelectedSkip() {
        return selectedSkip;
    }

    public void setSelectedSkip(int selectedSkip) {
        this.selectedSkip = selectedSkip;
    }

    public List<String> getListSkip() {
        return listSkip;
    }

    public void setListSkip(List<String> listSkip) {
        this.listSkip = listSkip;
    }

    public int getCalculatedSkip() {
        return calculatedSkip;
    }

    public void setCalculatedSkip(int calculatedSkip) {
        this.calculatedSkip = calculatedSkip;
    }

    public boolean validateCollectionName(String collectionName) {
        if (collectionName.length() > 0 && (collectionName.split("\\.")).length == 1
                && !getCollections().contains(collectionName)) {
            return true;
        } else {
            return false;
        }
    }

    public void createDataBase(String dataBaseName) {
        mongoController.createDataBase(dataBaseName);
    }

    public void destroyDataBase(String dataBaseSelected) {
        mongoController.removeDB(dataBaseSelected);
    }

    public void createCollection(String collectionName) {
        mongoController.createCollection(collectionName);
    }

    public void destroyCollection(String collectionName) {
        mongoController.destroyCollection(collectionName);
    }

    public void truncateCollection(String collectionName) {
        mongoController.destroyCollection(collectionName);
        mongoController.createCollection(collectionName);
    }

    public int getCollectionIndex() {
        return collectionIndex;
    }

    public void setCollectionIndex(int collectionIndex) {
        this.collectionIndex = collectionIndex;
    }

    public void saveObject(String strJson) {
        DBObject json = (DBObject) JSON.parse(strJson);
        mongoController.saveObject(json);
    }

    public void destroyObject(String strJson) {
        DBObject json = (DBObject) JSON.parse(strJson);
        mongoController.removeObject(json);
    }

    public void updateObject(String strJson) {
        DBObject json = (DBObject) JSON.parse(strJson);
        mongoController.updateObject(json);
    }
    
}
