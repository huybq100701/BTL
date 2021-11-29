package Btnhom.DAO;

import Btnhom.DTO.*;
import Btnhom.Utilities.DBUtility;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DrinksDAO {
    
    private static DrinksDAO instance;
    
    public DrinksDAO() {
    }
    
    public static DrinksDAO getInstance() {
        if (instance == null) {
            instance = new DrinksDAO();
        }
        return instance;
    }
    
    public List<Drinks> GetListDrink() {
        List<Drinks> list = new ArrayList<Drinks>();
        Connection con = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM `drinks`");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Drinks drinks = new Drinks(rs.getInt(1), rs.getString(2), rs.getInt(3));
                list.add(drinks);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DrinksDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public int getIDByName(String drinkName) {
        Connection con = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM `drinks` WHERE `DrinksName` = ?");
            pstmt.setString(1, drinkName);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DrinksDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    
    public String getNameByID(int id) {
        Connection con = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM `drinks` WHERE `id` = ?");
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                return rs.getString(2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DrinksDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
    public int getPriceByID(int id) {
        Connection con = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT `cost` FROM `drinks` WHERE `ID` = ?");
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DrinksDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    
    public boolean add(String drinkName, int cost) {
        Connection con;
        con = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO drinks(DrinksName, cost) VALUES (?, ?)");
            pstmt.setString(1, drinkName);
            pstmt.setInt(2, cost);
            int i = pstmt.executeUpdate();
            if (i > 0) {
                return true;
            } 
        } catch (SQLException ex) {
            System.out.println("Btnhom.Interface.QuanLyDoUong.addActionPerformed()");
        }
        return false;
    }
    
    public boolean delete(String drinkName) {
        Connection con;
        con = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("DELETE FROM drinks WHERE DrinksName = ?");
            pstmt.setString(1, drinkName);
            int i = pstmt.executeUpdate();
            if (i > 0) {
                return true;
            } 
        } catch (SQLException ex) {
            System.out.println("Btnhom.Interface.QuanLyDoUong.addActionPerformed()");
        }
        return false;
    }
}

