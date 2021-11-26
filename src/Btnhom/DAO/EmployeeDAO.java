package Btnhom.DAO;
import Btnhom.DTO.*;
import Btnhom.Utilities.DBUtility;
import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.*;
import javax.swing.table.DefaultTableModel;


public class EmployeeDAO {
    private Employee employee = new Employee();
    
    public EmployeeDAO() {
        
    }
    
    public Employee getEmployee() {
        return employee;
    }
    
    public boolean add(int id, String name, String gender, String join_date, String address, String phone_number, String position, int salary) {
        Connection connection = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = connection.prepareStatement("INSERT INTO "
            + "employee(id, name, gender, join_date, address, phone_number, position, salary) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, gender);
            pstmt.setString(4, join_date);
            pstmt.setString(5, address);
            pstmt.setString(6, phone_number);
            pstmt.setString(7, position);
            pstmt.setInt(8, salary);
            int affectedRows = pstmt.executeUpdate();
            if(affectedRows > 0) return true;
        } catch (SQLException e) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }
    
    
    public boolean delete(int id) {
        Connection connection = DBUtility.openConnection();
        try {
            if(new AccountDAO().hasAccount(id)) {
                new AccountDAO().deleteByEmployeeId(id);
            }
            PreparedStatement pstmt = connection.prepareStatement("DELETE FROM employee WHERE id = ?");
            pstmt.setInt(1, id);
            int affectedRows = pstmt.executeUpdate();
            if(affectedRows > 0) return true;
        } catch (SQLException e) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }
    
    public boolean update(int id, String name, String gender, String join_date, String address, String phone_number, String position, int salary) {
        Connection connection = DBUtility.openConnection();
        try {
            PreparedStatement pstmt = connection.prepareStatement("UPDATE employee SET name = ?, gender = ?, join_date = ?"
                    + ", address = ?, phone_number = ?, position = ?, salary = ? WHERE id = ?");
            pstmt.setString(1, name);
            pstmt.setString(2, gender);
            pstmt.setString(3, join_date);
            pstmt.setString(4, address);
            pstmt.setString(5, phone_number);
            pstmt.setString(6, position);
            pstmt.setInt(7, salary);
            pstmt.setInt(8, id);
            int affectedRows = pstmt.executeUpdate();
            if(affectedRows > 0) return true;
        } catch (SQLException e) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }
    
    public boolean authenticateID(int id) {
        Connection connection = DBUtility.openConnection();
        try {
            String sql = "SELECT * FROM employee WHERE id = ?";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, id);
            
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()) return true;
        } catch (SQLException e) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }
    
    public String getPosition(int id) {
        Connection connection = DBUtility.openConnection();
        try {
            String sql = "SELECT position from employee WHERE id = ?";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, id);
            
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()) return rs.getString("position");
        } catch (SQLException e) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return "";
    }
    
    public void loadDataToTable(DefaultTableModel myModel) {
        Connection connection = DBUtility.openConnection();
        try {
            String sql = "SELECT * FROM employee";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                Vector v = new Vector();
                Employee e = new Employee();
                e.setId(rs.getInt("id"));
                e.setName(rs.getString("name"));
                e.setGender(rs.getString("gender"));
                e.setJoin_date(rs.getString("join_date"));
                e.setAddress(rs.getString("address"));
                e.setPhone_number(rs.getString("phone_number"));
                e.setPosition(rs.getString("position"));
                e.setSalary(rs.getInt("salary"));
                
                v.add(e.getId());
                v.add(e.getName());
                v.add(e.getGender());
                v.add(e.getJoin_date());
                v.add(e.getAddress());
                v.add(e.getPhone_number());
                v.add(e.getPosition());
                v.add(e.getSalary());
                
                myModel.addRow(v);
            }
        } catch (SQLException e) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void searchByID(int id, DefaultTableModel myModel) {
        Connection connection = DBUtility.openConnection();
        try {
            String sql = "SELECT * from employee WHERE id = ?";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, id);
            
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                Vector v = new Vector();
                Employee e = new Employee();
                e.setId(rs.getInt("id"));
                e.setName(rs.getString("name"));
                e.setGender(rs.getString("gender"));
                e.setJoin_date(rs.getString("join_date"));
                e.setAddress(rs.getString("address"));
                e.setPhone_number(rs.getString("phone_number"));
                e.setPosition(rs.getString("position"));
                e.setSalary(rs.getInt("salary"));
                
                v.add(e.getId());
                v.add(e.getName());
                v.add(e.getGender());
                v.add(e.getJoin_date());
                v.add(e.getAddress());
                v.add(e.getPhone_number());
                v.add(e.getPosition());
                v.add(e.getSalary());
                
                myModel.addRow(v);
            }
        } catch (SQLException e) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void searchByName(String name, DefaultTableModel myModel) {
        Connection connection = DBUtility.openConnection();
        try {
            String sql = "SELECT * from employee WHERE name = ?";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, name);
            
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                Vector v = new Vector();
                Employee e = new Employee();
                e.setId(rs.getInt("id"));
                e.setName(rs.getString("name"));
                e.setGender(rs.getString("gender"));
                e.setJoin_date(rs.getString("join_date"));
                e.setAddress(rs.getString("address"));
                e.setPhone_number(rs.getString("phone_number"));
                e.setPosition(rs.getString("position"));
                e.setSalary(rs.getInt("salary"));
                
                v.add(e.getId());
                v.add(e.getName());
                v.add(e.getGender());
                v.add(e.getJoin_date());
                v.add(e.getAddress());
                v.add(e.getPhone_number());
                v.add(e.getPosition());
                v.add(e.getSalary());
                
                myModel.addRow(v);
            }
        } catch (SQLException e) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void searchByPosition(String position, DefaultTableModel myModel) {
        Connection connection = DBUtility.openConnection();
        try {
            String sql = "SELECT * from employee WHERE position = ?";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, position);
            
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                Vector v = new Vector();
                Employee e = new Employee();
                e.setId(rs.getInt("id"));
                e.setName(rs.getString("name"));
                e.setGender(rs.getString("gender"));
                e.setJoin_date(rs.getString("join_date"));
                e.setAddress(rs.getString("address"));
                e.setPhone_number(rs.getString("phone_number"));
                e.setPosition(rs.getString("position"));
                e.setSalary(rs.getInt("salary"));
                
                v.add(e.getId());
                v.add(e.getName());
                v.add(e.getGender());
                v.add(e.getJoin_date());
                v.add(e.getAddress());
                v.add(e.getPhone_number());
                v.add(e.getPosition());
                v.add(e.getSalary());
                
                myModel.addRow(v);
            }
        } catch (SQLException e) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
