package Btnhom.DAO;

import Btnhom.DTO.*;
import Btnhom.DAO.*;
import Btnhom.Utilities.DBUtility;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class EventDAO {
    public boolean add(String name, int discount, String start, String end) {
        Connection connection = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = connection.prepareStatement("INSERT INTO "
            + "event(name, discount, start, end) VALUES (?, ?, ?, ?)");
            pstmt.setString(1, name);
            pstmt.setInt(2, discount);
            pstmt.setString(3, start);
            pstmt.setString(4, end);
            int affectedRows = pstmt.executeUpdate();
            if(affectedRows > 0) return true;
        } catch (SQLException e) {
            Logger.getLogger(EventDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }
    
    public int getIdByName(String name) {
        Connection connection = DBUtility.openConnection();
        try {
            String sql = "SELECT `id` FROM `event` WHERE name = ?";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, name);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()) {
                return rs.getInt("id");
            }
        } catch (SQLException e) {
            Logger.getLogger(EventDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return 0;
    }
    
    public int getDiscountByName(String name) {
        Connection connection = DBUtility.openConnection();
        try {
            String sql = "SELECT `discount` FROM `event` WHERE name = ?";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, name);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()) {
                return rs.getInt("discount");
            }
        } catch (SQLException e) {
            Logger.getLogger(EventDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return 0;
    }
        
    public boolean Update(int id, String name, int discount, String start, String end) {
        Connection con = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("UPDATE `event` SET name= ?, discount = ?, "
                    + " start = ?, end = ? WHERE id = ?");
            pstmt.setString(1, name);
            pstmt.setInt(2, discount);
            pstmt.setString(3, start);
            pstmt.setString(4, end);
            pstmt.setInt(5, id);
            int i = pstmt.executeUpdate();
            if (i > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(EventDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean delete(int id) {
        Connection connection = DBUtility.openConnection();
        try {
            if(new AccountDAO().hasAccount(id)) {
                new AccountDAO().deleteByEmployeeId(id);
            }
            PreparedStatement pstmt = connection.prepareStatement("DELETE FROM event WHERE id = ?");
            pstmt.setInt(1, id);
            int affectedRows = pstmt.executeUpdate();
            if(affectedRows > 0) return true;
        } catch (SQLException e) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }
    
    public void loadDataToTable(DefaultTableModel myModel) {
        Connection connection = DBUtility.openConnection();
        try {
            String sql = "SELECT * FROM event";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                Vector v = new Vector();
                Event e = new Event();
                e.setName(rs.getString("name"));
                e.setDiscount(rs.getInt("discount"));
                e.setStart(rs.getString("start"));
                e.setEnd(rs.getString("end"));
                
                v.add(e.getName());
                v.add(e.getDiscount());
                v.add(e.getStart());
                v.add(e.getEnd());
                
                myModel.addRow(v);
            }
        } catch (SQLException e) {
            Logger.getLogger(EventDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public boolean checkExistName(String name) {
        Connection connection = DBUtility.openConnection();
        try {
            String sql = "SELECT * FROM `event` WHERE name = ?";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, name);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            Logger.getLogger(EventDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }
    
    public List<Event> GetListEvent() {
        List<Event> list = new ArrayList<>();
        Connection con = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM `event`");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Event event = new Event(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5));
                list.add(event);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EventDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
