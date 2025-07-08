package org.example;

import java.sql.*;

public class SelectAllCust {
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
        String selectAllSql = "SELECT * FROM cust WHERE cust_id = ?";
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            pstmt = conn.prepareStatement(selectAllSql);
            pstmt.setString(1, "id22");
            rs = pstmt.executeQuery();
            rs.next();
            String cust_id = rs.getString("cust_id");
            String cust_pwd = rs.getString("cust_pwd");
            String cust_name = rs.getString("cust_name");
            Timestamp cust_regdate = rs.getTimestamp("cust_regdate");
            Timestamp cust_update = rs.getTimestamp("cust_update");

            System.out.printf("%s %s %s %s \n",cust_id,  cust_pwd, cust_name, cust_regdate.toString());


        } catch (SQLException e) {
            System.out.println("Failed to select all cust");
            e.printStackTrace();

        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {}
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {}
            }
        }
    }
}
