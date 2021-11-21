package Btnhom.DAO;

import Btnhom.DTO.Invoices;
import Btnhom.DTO.Menu;
import Btnhom.DTO.Tables;
import Btnhom.Interface.QuanLyBan;
import Btnhom.Utilities.DBUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




public class InvoicesDAO {

    private static InvoicesDAO instance;

    public InvoicesDAO() {
    }

    public static InvoicesDAO getInstance() {
        if (instance == null) {
            instance = new InvoicesDAO();
        }
        return instance;
    }

    public int GetUncheckInvoiceByTableId(int id) {
        Connection con = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM `invoice` WHERE `tables_id` = ? AND `status` = 0");
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
//                Invoices invoices = new Invoices(rs.getInt(1), rs.getInt(2), rs.getTimestamp(3), rs.getInt(4), rs.getInt(5), rs.getInt(6));
                return rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InvoicesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public Boolean Insert(int tableId, int accountId) {
        Connection con = DBUtility.openConnection();
        try {
            String sql = "INSERT INTO invoice(account_ID, tables_id, status) VALUES (?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, accountId);
            pstmt.setInt(2, tableId);
            pstmt.setInt(3, 0);
            int i = pstmt.executeUpdate();
            if (i > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyBan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public int GetMaxIdInvoice() {
        Connection con = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT MAX(ID) FROM `invoice`");
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InvoicesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return 1;
    }

    public boolean Update(int id, int totalPrice) {
        Connection con = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("UPDATE `invoice` SET `status`= 1, `total_price` = ? WHERE `ID` = ?");
            pstmt.setInt(1, totalPrice);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            int i = pstmt.executeUpdate();
            if (i > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(InvoicesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public void loadDataToTable(DefaultTableModel myModel, int invoiceID, int accID) {
        Connection connection = DBUtility.openConnection();
        try {
            String sql = "SELECT `employee`.`name`, `tables`.`table_name`, `invoice`.`total_price`, `invoice`.`invoice_date` "
                    + "FROM `employee`, `invoice`, `tables`, `account` WHERE "
                    + "`account`.`employee_id` = `employee`.`id` AND "
                    + "`account`.`id` =`invoice`.`account_ID` AND `invoice`.`id` = ? AND `invoice`.`account_ID` = ?"
                    + " AND `invoice`.`tables_id` = `tables`.`ID`";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, invoiceID);
            pstmt.setInt(2, accID);
            ResultSet rs = pstmt.executeQuery();
            int i = 1;
            while(rs.next()) {
                Vector v = new Vector();
                Invoices in = new Invoices();
                in.setNum(i++);
                in.setEmployeeName(rs.getString("name"));
                in.setTableName(rs.getString("table_name"));
                in.setTotalPrice(rs.getInt("total_price"));
                in.setInvoiceDate(rs.getTimestamp("invoice_date"));
                
                v.add(in.getNum());
                v.add(in.getEmployeeName());
                v.add(in.getTableName());
                v.add(in.getTotalPrice());
                v.add(in.getInvoiceDate());
                
                myModel.addRow(v);
            }
        } catch (SQLException e) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public ArrayList<Integer> invoicesIdList() {
        Connection con = DBUtility.openConnection();
        ArrayList<Integer> res = new ArrayList<>();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM `invoice`");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                res.add(rs.getInt(1));
            }
            return res;
        } catch (SQLException ex) {
            Logger.getLogger(InvoicesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return res;
    }
}
