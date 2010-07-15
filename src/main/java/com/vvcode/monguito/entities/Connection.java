package com.vvcode.monguito.entities;

public class Connection {

    private static Connection INSTANCE = null;

    private String host;
    private int port;

    public static Connection getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Connection("localhost", 27017);
        }
        
        return INSTANCE;
    }

    Connection(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
