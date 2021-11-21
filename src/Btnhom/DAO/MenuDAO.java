package Btnhom.DAO;

import Btnhom.DTO.Menu;
import Btnhom.Utilities.DBUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

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
    
    public void loadDataToTable(DefaultTableModel myModel, int id) {
        Connection connection = DBUtility.openConnection();
        try {
            String sql = "SELECT `drinks`.`DrinksName`, `orders`.`count`, `drinks`.`cost`, `orders`.`count`*`drinks`.`cost` AS totalPrice FROM `orders`, `invoice`, `drinks` WHERE `orders`.`invoice_ID` = `invoice`.`ID` AND `orders`.`drinks_ID` = `drinks`.`ID` AND `invoice`.`status` = 0 AND `invoice`.`tables_id` = ?";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            int i = 1;
            while(rs.next()) {
                Vector v = new Vector();
                Menu m = new Menu();
                m.setNum(i++);
                m.setDrinkName(rs.getString("DrinksName"));
                m.setCount(rs.getInt("count"));
                m.setPrice(rs.getInt("cost"));
                m.setTotalPrice(rs.getInt("totalPrice"));
                
                v.add(m.getNum());
                v.add(m.getDrinkName());
                v.add(m.getCount());
                v.add(m.getPrice());
                v.add(m.getTotalPrice());
                
                myModel.addRow(v);
            }
        } catch (SQLException e) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }     
}

