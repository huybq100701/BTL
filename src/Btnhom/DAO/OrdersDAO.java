/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Btnhom.DAO;

import Btnhom.DTO.Invoices;
import Btnhom.DTO.Orders;
import Btnhom.Utilities.DBUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;




public class OrdersDAO {

    private static OrdersDAO instance;

    public OrdersDAO() {
    }

    public static OrdersDAO getInstance() {
        if (instance == null) {
            instance = new OrdersDAO();
        }
        return instance;
    }

    public List<Orders> ListOrder(int id) {
        List<Orders> list = new ArrayList<Orders>();
        Connection con = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM `orders` WHERE `invoice_ID` = ?");
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Orders orders = new Orders(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4));
                list.add(orders);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrdersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public Boolean Insert(int drinkId, int invoiceId, int count) {
        Connection con = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO `orders`(`drinks_ID`, `count`, `invoice_ID`) VALUES (?,?,?)");
            pstmt.setInt(1, drinkId);
            pstmt.setInt(2, count);
            pstmt.setInt(3, invoiceId);
            int i = pstmt.executeUpdate();
            if (i > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(MenuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
