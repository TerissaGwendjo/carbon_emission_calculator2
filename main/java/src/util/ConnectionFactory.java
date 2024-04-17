package java.src.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static final String URL = "jdbc:postgresql://localhost:5432/carbon_emission_calculator2";
    private static final String USER = "postgres";
    private static final String PASSWORD = "12345" ;
    private static Connection connection = null;
    private ConnectionFactory () {}
    public static Connection getConnection () {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
