package com.spa.app;

import java.sql.*;

public class DatabaseManager {
    private Connection connection;

    public DatabaseManager() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/SPA";
            String username = "root";
            String password = "root";
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC driver not found.");
            //   e.printStackTrace();
        }
    }

}
