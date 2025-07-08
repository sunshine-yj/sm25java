package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateCust {
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
        String updateSql = "UPDATE cust SET cust_pwd=?, cust_name=? WHERE cust_id=?";
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement(updateSql);
            pstmt.setString(1, "password1231");
            pstmt.setString(2, "오말자");
            pstmt.setString(3, "id22");

            int result = pstmt.executeUpdate();
            System.out.println(updateSql + " successfully : " + result);

        } catch (SQLException e) {
            System.out.println("Failed to Update Cust");
        } finally {
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
