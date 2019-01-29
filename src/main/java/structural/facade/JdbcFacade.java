package structural.facade;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class JdbcFacade {
    DbSingleton instance = null;

    public JdbcFacade(){
        instance = DbSingleton.getDbSingleton();
    }

    public int createTable() {
        int count = 0;

        try {
            Connection conn = instance.getConnection();
            Statement statement = conn.createStatement();
            count = statement
                    .executeUpdate("CREATE TABLE Address (ID INTEGER, StreetName VARCHAR (20)," + " City VARCHAR (20))");
            statement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public int insertIntoTable() {
        int count = 0;

        try {
            Connection conn = instance.getConnection();
            Statement statement = conn.createStatement();
            count = statement
                    .executeUpdate("INSERT INTO Address (ID, StreetName, City) VALUES(1, '1234 Some street', 'Laytorn')");
            statement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;

    }

    public List<Address> getAddress() {
        List<Address> addresses = new ArrayList<>();

        try {
            Connection conn = instance.getConnection();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT FROM * Address");

            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
                Address address = new Address();
                address.setId(rs.getString(1));
                address.setStreetName(rs.getString(2));
                address.setCity(rs.getString(3));

                addresses.add(address);
            }
            rs.close();
            statement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return addresses;
    }
}
