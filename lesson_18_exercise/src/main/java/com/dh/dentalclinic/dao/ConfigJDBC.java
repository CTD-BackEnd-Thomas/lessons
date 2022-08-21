package com.dh.dentalclinic.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConfigJDBC {
    private String jdbcDriver;
    private String dbUrl;
    private String user;
    private String pass;

    public ConfigJDBC(String jdbcDriver, String dbUrl, String user, String pass) {
        this.jdbcDriver = jdbcDriver;
        this.dbUrl = dbUrl;
        this.user = user;
        this.pass = pass;
    }

    public Connection getConnection(){
        Connection connection = null;
        try{
            Class.forName(jdbcDriver);
            connection = DriverManager.getConnection(this.dbUrl,this.user,this.pass);
        }catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }

}
