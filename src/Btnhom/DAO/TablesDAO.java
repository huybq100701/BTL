/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
}

