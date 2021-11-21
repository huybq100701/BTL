/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Btnhom.DAO;

import Btnhom.DTO.Menu;
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
public class MenuDAO {

    private static MenuDAO instance;

    public MenuDAO() {
    }

    public static MenuDAO getInstance() {
        if (instance == null) {
            instance = new MenuDAO();
        }
        return instance;
    }

    public static void setInstance(MenuDAO instance) {
        MenuDAO.instance = instance;
    }

    public List<Menu> GetListMenuByTableId(int id) {
        List<Menu> list = new ArrayList<Menu>();
        Connection con = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT `drinks`.`name`, `orders`.`count`, `drinks`.`price`, `orders`.`count`*`drinks`.`price` AS totalPrice FROM `orders`, `invoice`, `drinks` WHERE `orders`.`invoice_ID` = `invoice`.`ID` AND `orders`.`drinks_ID` = `drinks`.`ID` AND `invoice`.`status` = 0 AND `invoice`.`tables_id` = ?");
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Menu menu = new Menu(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getInt(4));
                list.add(menu);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MenuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}

