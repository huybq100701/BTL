package Btnhom.Utilities;

import java.sql.*;

public class DBUtility {
    public static Connection openConnection() {
        Connection connection = null;
//        String url = "jdbc:mysql://localhost:3306/btl";
//        String user = "root";
//        String pass = "soitrangqwe";
        String url = "jdbc:mysql://localhost:3306/cafe_management_system";
        String user = "root";
        String pass = "123456789";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection(url, user, pass);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
    
    public static void closeConnection(Connection connection) {
        if(connection != null) {
            try {
                connection.close();
            } catch(Exception e) {
                
            } finally {
                connection = null;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(new DBUtility().openConnection());
    }
}
