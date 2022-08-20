package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConfigJDBC {
    private String jdbcDriver;
    private String dbUrl;
    private String user;
    private String passwd;

    public ConfigJDBC(String jdbcDriver, String dbUrl, String user, String passwd) {
        this.jdbcDriver = jdbcDriver;
        this.dbUrl = dbUrl;
        this.user = user;
        this.passwd = passwd;
    }

    public Connection getConnection(){
        Connection connection = null;
        try{
            Class.forName(jdbcDriver);
            connection = DriverManager.getConnection(this.dbUrl,this.user,this.passwd);
        }catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }

}