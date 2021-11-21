/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Btnhom.DAO;

import Btnhom.DTO.Drinks;
import Btnhom.Utilities.DBUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TRI
 */
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
}

