package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteCust {
    public static void main(String[] args) {
        // 1. MySQL Driver Loading ...
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        // 2. Connection
        String url = "jdbc:mysql://localhost:3306/shopdb";
        String user = "smuser";
        String password = "111111";

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database successfully");
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }

        // 3. SQL 문장 생성
        String deleteSql = "SELECT DELETE";
        PreparedStatement pstmt = null;
    }
}
