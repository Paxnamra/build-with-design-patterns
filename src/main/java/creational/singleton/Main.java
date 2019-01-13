package creational.singleton;

import org.apache.derby.client.am.SqlException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getDbSingleton();

        long timeBefore = 0;
        long timeAfter = 0;

        System.out.println(instance);

        timeBefore = System.currentTimeMillis();
        Connection conn = instance.getConnection();
        timeAfter = System.currentTimeMillis();

        System.out.println(timeBefore - timeAfter);


        Statement statement;

        try {
            statement = conn.createStatement();
            int count = statement
                    .executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR (20)," + " City VARCHAR (20))");
            System.out.println("Table created");
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        timeBefore = System.currentTimeMillis();
        conn = instance.getConnection();
        timeAfter = System.currentTimeMillis();

        System.out.println(timeBefore - timeAfter);

        /*
        System.out.println(instance);

        //doubled the instance to check if result is going to be the same
        DbSingleton anotherInstance = DbSingleton.getDbSingleton();
        System.out.println(anotherInstance);

        */
    }
}
