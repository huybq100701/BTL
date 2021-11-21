package Btnhom.DAO;

import Btnhom.DTO.*;
import Btnhom.Utilities.DBUtility;
import java.sql.*;
import java.util.*;
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
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO orders(drinks_ID, count, invoice_ID) VALUES (?,?,?)");
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
    
    public int totalPrice(int invoiceId) {
        Connection con = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT `drinks_ID`,`count` FROM `orders` WHERE `invoice_ID` = ?");
            pstmt.setInt(1, invoiceId);
            ResultSet rs = pstmt.executeQuery();
            int totalPrice = 0;
            if (rs.next()) {
                int price = new DrinksDAO().getPriceByID(rs.getInt(1));
                int count = rs.getInt(2);
                totalPrice += price * count;
            }
            return totalPrice;
        } catch (SQLException ex) {
            Logger.getLogger(MenuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
