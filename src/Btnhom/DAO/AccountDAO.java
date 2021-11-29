package Btnhom.DAO;
import Btnhom.Utilities.*;
import Btnhom.DTO.*;
import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;

public class AccountDAO {
    private Account account = new Account();
    
    public AccountDAO() {
        
    }
    
    public Account getAccount() {
        return account;
    }
    public boolean login(String username, String password) throws SQLException {
        Connection connection = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM account WHERE username = ? AND password = ?");
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()) {
                account.setId(rs.getInt(1));
                account.setUsername(rs.getString(2));
                account.setPassword(rs.getString(3));
                account.setName(rs.getString(4));
                account.setEmployeeId(rs.getInt(5));
                return true;
            }
        } catch (SQLException e) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }
    
    public boolean changePassword(String currPass, String newPass) {
        Connection connection = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = connection.prepareStatement("UPDATE account SET password = ? WHERE id = ?");
            pstmt.setString(1, newPass);
            pstmt.setInt(2, account.getId());
            int affectedRows = pstmt.executeUpdate();
            if(affectedRows > 0) return true;
        } catch (SQLException e) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }
    
    public boolean signUp(String username, String password, String name, int id) {
        Connection connection = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = connection.prepareStatement("INSERT INTO account(username, password, name, employee_id) VALUES (?, ?, ?, ?)");
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.setString(3, name);
            pstmt.setInt(4, id);
            int affectedRows = pstmt.executeUpdate();
            if(affectedRows > 0) return true;
        } catch (SQLException e) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }
    
    public boolean authenticateEmployeeID(int id) {
        Connection connection = DBUtility.openConnection();
        try {
            String sql = "SELECT * from account WHERE employee_id = ?";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, id);
            
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()) return true;
        } catch (SQLException e) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }
    
    public boolean deleteByEmployeeId(int employee_id) {
        Connection connection = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = connection.prepareStatement("DELETE FROM account WHERE employee_id = ?");
            pstmt.setInt(1, employee_id);
            int affectedRows = pstmt.executeUpdate();
            if(affectedRows > 0) return true;
        } catch (SQLException e) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }
    
    public boolean hasAccount(int employee_id) {
        Connection connection = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM account WHERE employee_id = ?");
            pstmt.setInt(1, employee_id);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()) return true;
        } catch (SQLException e) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }
        
}