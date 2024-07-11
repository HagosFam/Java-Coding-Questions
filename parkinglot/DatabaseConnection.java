package parkinglot;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    private static final String url = "";
    private static final String user = "";
    private static final String passwoird = "";

    private static Connection connection;

    static {
        try {
            Class.forName("org.");

          connection = DriverManager.getConnection();
            System.out.println("Database connected su");

        } catch () {

        }
    }

    // random numbers
    // 99, 21, 43, 55, 61
    // it should search









}
