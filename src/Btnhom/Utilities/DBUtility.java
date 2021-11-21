/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Btnhom.Utilities;

import java.sql.*;

/**
 *
 * @author Admin
 */
public class DBUtility {
    public static Connection openConnection() {// cai ham openConnection() la ham ket noi DB,khi nao gọi thì nó mới kết nối db
        Connection connection = null;
        String url = "jdbc:mysql://localhost:3306/btl";
        String user = "root";
        String pass = "soitrangqwe";
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
