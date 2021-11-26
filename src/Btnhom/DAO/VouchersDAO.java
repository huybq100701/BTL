package Btnhom.DAO;


import Btnhom.DAO.*;
import Btnhom.DTO.*;
import Btnhom.Utilities.DBUtility;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class VouchersDAO {
    public int checkVouchers(String voucher) {
        Connection con = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM `vouchers` WHERE `name` = ?");
            pstmt.setString(1, voucher);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next())
                return rs.getInt("discount");
        } catch (SQLException ex) {
            Logger.getLogger(MenuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    
    public void loadDataToTable(DefaultTableModel myModel) {
        Connection connection = DBUtility.openConnection();
        try {
            String sql = "SELECT * FROM vouchers";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                Vector v = new Vector();
                Voucher voucher = new Voucher();
                voucher.setName(rs.getString("name"));
                voucher.setDiscount(rs.getInt("discount"));
                
                v.add(voucher.getName());
                v.add(voucher.getDiscount());
                
                myModel.addRow(v);
            }
        } catch (SQLException e) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public List<Voucher> GetListVoucher() {
        List<Voucher> list = new ArrayList<Voucher>();
        Connection con = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM `vouchers`");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Voucher voucher = new Voucher(rs.getInt(1), rs.getString(2), rs.getInt(3));
                list.add(voucher);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DrinksDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
