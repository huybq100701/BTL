package Btnhom.DAO;

import Btnhom.DTO.Tables;
import Btnhom.Interface.QuanLyBan;
import Btnhom.Utilities.DBUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TablesDAO {

    private static TablesDAO instance;

    public TablesDAO() {
    }

    public static TablesDAO getInstance() {
        if (instance == null) {
            instance = new TablesDAO();
        }
        return instance;
    }

    public static void setInstance(TablesDAO instance) {
        TablesDAO.instance = instance;
    }

    public List<Tables> LoadListTables() {
        List<Tables> listTable = new ArrayList<Tables>();

        Connection con = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM `tables`");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Tables tables = new Tables(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4) == 0 ? "Còn trống" : "Đã đặt");
                listTable.add(tables);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TablesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listTable;
    }
    
    public int getIDByName(String name) {
        Connection con = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM `tables` WHERE `table_name` = ?");
            pstmt.setString(1, name);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TablesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    
    public boolean updateStatus(int status, int id) {
        Connection con = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("UPDATE `tables` SET `status` = ? WHERE `ID` = ?");
            pstmt.setInt(1, status);
            pstmt.setInt(2, id);
            int affectedRows = pstmt.executeUpdate();
            if(affectedRows > 0) return true;
        } catch (SQLException ex) {
            Logger.getLogger(TablesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
        
}

