package org.example;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;

public class InsertCust {
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
        String insertsql = "INSERT INTO cust VALUES (?,?,?,NOW(),NOW())";
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement(insertsql);
            pstmt.setString(1, "id22");
            pstmt.setString(2, "pwd22");
            pstmt.setString(3, "이말자");
            // 4. SQL 문장 전송
            int result = pstmt.executeUpdate();
            System.out.println("Insert successfully : " + result);


        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        } finally {
            // 5. Close
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {}
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {}
            }
        }
    }
}
