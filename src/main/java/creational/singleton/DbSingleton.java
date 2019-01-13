package creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {

    //thread safe with volatile
    private static volatile DbSingleton dbSingleton = null;
    private static volatile Connection conn = null;


    private DbSingleton() {

        try {
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        if (conn != null) {
            throw new RuntimeException("There's getConnection method to use!");
        }
        if (dbSingleton != null) {
            throw new RuntimeException("There's getInstance() method to use!");
        }
    }

    //lazy loading
    //even more thread safe
    public static DbSingleton getDbSingleton() {
        if (dbSingleton == null) {
            synchronized (DbSingleton.class) {
                if (dbSingleton == null) {
                    dbSingleton = new DbSingleton();
                }
            }
        }
        return dbSingleton;
    }

    public Connection getConnection() {
        if (conn == null) {
            synchronized (DbSingleton.class) {
                if (conn == null) {
                    try {
                        String dbUrl = "jdbc:derby:codejava/webdb;create=true";
                        conn = DriverManager.getConnection(dbUrl);
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
        return conn;
    }
}
