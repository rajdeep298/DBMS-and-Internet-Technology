package org.jdbc.misc;

import java.sql.*;

public class ConnectionProvider {
    static Connection con;
    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mca1sem","root","Rajdeep@2025");
            if (con == null) {
                System.out.println("❌ Connection is NULL!");
            } else {
                System.out.println("✅ Connection successful!");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return con;
    }
}
