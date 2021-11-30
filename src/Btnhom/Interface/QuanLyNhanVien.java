package Btnhom.Interface;
import Btnhom.DAO.*;
import java.awt.event.*;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

public class QuanLyNhanVien extends javax.swing.JFrame {
    private AccountDAO accDAO = new AccountDAO();
    String[] headers = {"ID", "Name", "Gender", "Join Date", "Address", "Phone number", "Position", "Salary"};
    DefaultTableModel myModel;
    public QuanLyNhanVien() {
        initComponents();
        setTitle("Employee Management");
        setLocationRelativeTo(this);
        myModel = new DefaultTableModel(headers, 0);
        new EmployeeDAO().loadDataToTable(myModel);
        tableInfo.setModel(myModel);
    }
    
    public QuanLyNhanVien(AccountDAO accDAO) {
        initComponents();
        setStyle();
        setTitle("Employee Management");
        setLocationRelativeTo(this);
        this.accDAO = accDAO;
        myModel = new DefaultTableModel(headers, 0);
        new EmployeeDAO().loadDataToTable(myModel);
        tableInfo.setModel(myModel);
    }

    private void setStyle() {
        this.getContentPane().setBackground(Color.decode("#b2dbd5"));
        addButton.setBackground(Color.decode("#a5c3cf"));
        deleteButton.setBackground(Color.decode("#f3d3b8"));
        updateButton.setBackground(Color.decode("#8593ae"));
        searchButton.setBackground(Color.decode("#52958b"));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        buttonMale = new javax.swing.JRadioButton();
        buttonFemale = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPhoneNum = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        comboboxPosition = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableInfo = new javax.swing.JTable();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        comboBoxSearch = new javax.swing.JComboBox<>();
        backButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        buttonGroup1.add(buttonMale);
        buttonGroup1.add(buttonFemale);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 358, 143, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 361, 83, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Gender");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 412, 83, 25));

        txtId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 358, 143, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Employee ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 361, 83, -1));

        buttonMale.setText("Male");
        getContentPane().add(buttonMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 415, -1, -1));

        buttonFemale.setText("Female");
        getContentPane().add(buttonFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 415, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Join Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 416, 83, -1));

        txtDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDate.setText("yyyy/mm/dd");
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });
        getContentPane().add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 413, 143, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Phone Number");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 459, 106, -1));

        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        getContentPane().add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 456, 143, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Address");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 459, 83, -1));

        txtPhoneNum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPhoneNum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPhoneNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumActionPerformed(evt);
            }
        });
        getContentPane().add(txtPhoneNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 456, 143, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Position");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 500, 106, -1));

        comboboxPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Counter Staff", "Barista", "Supervisor" }));
        comboboxPosition.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboboxPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxPositionActionPerformed(evt);
            }
        });
        getContentPane().add(comboboxPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 500, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Salary");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 500, 85, -1));

        txtSalary.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSalary.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalaryActionPerformed(evt);
            }
        });
        getContentPane().add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 497, 143, -1));

        addButton.setText("Add");
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 399, 77, -1));

        tableInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Gender", "Join Date", "Address", "PhoneNumber", "Position", "Salary"
            }
        ));
        tableInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableInfoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableInfo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 81, 958, 242));

        updateButton.setText("Update");
        updateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 399, 77, -1));

        deleteButton.setText("Delete");
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(853, 399, 77, -1));

        searchButton.setText("Search");
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(831, 458, 77, -1));
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 459, 131, -1));

        comboBoxSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Name", "Position" }));
        comboBoxSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboBoxSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSearchActionPerformed(evt);
            }
        });
        getContentPane().add(comboBoxSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 459, -1, -1));

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Btnhom/Interface/Icon/Go Back_50px.png"))); // NOI18N
        backButton.setText("Back");
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        resetButton.setText("Reset");
        resetButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        getContentPane().add(resetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 499, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Btnhom/Interface/Icon/unnamed.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, 110));

        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtPhoneNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumActionPerformed

    private void txtSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalaryActionPerformed
    
    private boolean authenticateAdd() throws SQLException {
       if(new EmployeeDAO().authenticateID(Integer.parseInt(txtId.getText()))) {
           JOptionPane.showMessageDialog(this, "ID already exists!");
            return false;
       }
        if(txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "ID cannot be empty!");
            return false;
        }
        if(txtName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Name cannot be empty!");
            return false;
        }
        if(!buttonMale.isSelected() && !buttonFemale.isSelected()) {
            JOptionPane.showMessageDialog(this, "Gender cannot be empty!");
            return false;
        }
        if(txtDate.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Join date cannot be empty!");
            return false;
        }
        if(txtPhoneNum.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Phone number cannot be empty!");
            return false;
        }
        
        if(txtAddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Address cannot be empty!");
            return false;
        }
        
        if(txtSalary.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Salary cannot be empty!");
            return false;
        }
        String gender = (buttonMale.isSelected()) ? "Male" : "Female";
        if(!new EmployeeDAO().add(Integer.parseInt(txtId.getText()), txtName.getText(), gender, txtDate.getText(), txtAddress.getText(), 
           txtPhoneNum.getText(), comboboxPosition.getItemAt(comboboxPosition.getSelectedIndex()), Integer.parseInt(txtSalary.getText()))) return false;
        return true;
    }
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        txtId.setEnabled(true);
        txtName.setEnabled(true);
        txtDate.setEnabled(true);
        txtPhoneNum.setEnabled(true);
        txtAddress.setEnabled(true);
        txtSalary.setEnabled(true);
        buttonMale.setEnabled(true);  buttonFemale.setEnabled(true);
        comboboxPosition.setEnabled(true);
        
        try {
            if(authenticateAdd()) {
                JOptionPane.showMessageDialog(this, "Employee has been added!");
                myModel = new DefaultTableModel(headers, 0);
                new EmployeeDAO().loadDataToTable(myModel);
                tableInfo.setModel(myModel); 
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void comboboxPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxPositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboboxPositionActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String s = txtSearch.getText();
        myModel = new DefaultTableModel(headers, 0);
        if(comboBoxSearch.getItemAt(comboBoxSearch.getSelectedIndex()).equals("ID")) {
            new EmployeeDAO().searchByID(Integer.parseInt(s), myModel);
        }
        if(comboBoxSearch.getItemAt(comboBoxSearch.getSelectedIndex()).equals("Name")) {
            new EmployeeDAO().searchByName(s, myModel);
        }
        if(comboBoxSearch.getItemAt(comboBoxSearch.getSelectedIndex()).equals("Position")) {
            new EmployeeDAO().searchByPosition(s, myModel);
        }
        tableInfo.setModel(myModel);
    }//GEN-LAST:event_searchButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int row = tableInfo.getSelectedRow();
        
        if(row < 0) {
            JOptionPane.showMessageDialog(this, "Choose an employee to delete!");
        }
        else {
            int result = JOptionPane.showConfirmDialog(this,"Are you sure to delete this employee?", "Delete employee", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(result == JOptionPane.YES_OPTION){
               int id = Integer.parseInt(myModel.getValueAt(row, 0).toString());
               if(new EmployeeDAO().delete(id)) {
                    JOptionPane.showMessageDialog(this, "Delete successful!");
                    myModel.removeRow(row);
                }
               else JOptionPane.showMessageDialog(this, "Something went wrong");
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void tableInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableInfoMouseClicked
        // TODO add your handling code here:
        int row = tableInfo.getSelectedRow();
        if(row >= 0) {
            txtId.setText(myModel.getValueAt(row, 0).toString());
            txtId.setEnabled(false);
            txtName.setText(myModel.getValueAt(row, 1).toString());
            String gender = myModel.getValueAt(row, 2).toString();
            if(gender.equals("Male")) {
                buttonMale.setSelected(true);  buttonFemale.setSelected(false);
            }
            else {
                buttonFemale.setSelected(true);  buttonMale.setSelected(false);
            }
            txtDate.setText(myModel.getValueAt(row, 3).toString());
            txtPhoneNum.setText(myModel.getValueAt(row, 5).toString());
            txtAddress.setText(myModel.getValueAt(row, 4).toString());
            String position = myModel.getValueAt(row, 6).toString();
            if(position.equals("Manager")) comboboxPosition.setSelectedItem("Manager");
            else if(position.equals("Counter Staff")) comboboxPosition.setSelectedItem("Counter Staff");
            else if(position.equals("Barista")) comboboxPosition.setSelectedItem("Barista");
            else if(position.equals("Supervisor")) comboboxPosition.setSelectedItem("Supervisor");
            txtSalary.setText(myModel.getValueAt(row, 7).toString());
        }
    }//GEN-LAST:event_tableInfoMouseClicked
    private boolean authenticateUpdate() throws SQLException {
        if(txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "ID cannot be empty!");
            return false;
        }
        if(txtName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Name cannot be empty!");
            return false;
        }
        if(!buttonMale.isSelected() && !buttonFemale.isSelected()) {
            JOptionPane.showMessageDialog(this, "Gender cannot be empty!");
            return false;
        }
        if(txtDate.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Join date cannot be empty!");
            return false;
        }
        if(txtPhoneNum.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Phone number cannot be empty!");
            return false;
        }
        
        if(txtAddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Address cannot be empty!");
            return false;
        }
        
        if(txtSalary.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Salary cannot be empty!");
            return false;
        }
        String gender = (buttonMale.isSelected()) ? "Male" : "Female";
        return true;
    }
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed

        int row = tableInfo.getSelectedRow();
        
        if(row < 0) {
            JOptionPane.showMessageDialog(this, "Choose an employee to update!");
        }
        else {
            int id = Integer.parseInt(txtId.getText());
            String name = txtName.getText();
            String gender = (buttonMale.isSelected()) ? "Male" : "Female";
            String join_date = txtDate.getText();
            String address = txtAddress.getText();
            String phone_number = txtPhoneNum.getText();
            String position = comboboxPosition.getItemAt(comboboxPosition.getSelectedIndex());
            int salary = Integer.parseInt(txtSalary.getText());
            
         
            try {
                if(authenticateUpdate() && new EmployeeDAO().update(id, name, gender, join_date, address, phone_number, position, salary)) {
                    JOptionPane.showMessageDialog(new QuanLyNhanVien(), "Update successful!");
                    myModel = new DefaultTableModel(headers, 0);
                    new EmployeeDAO().loadDataToTable(myModel); 
                    tableInfo.setModel(myModel);
                }
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyNhanVien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        txtId.setText("");
        txtName.setText("");
        txtDate.setText("");
        txtAddress.setText("");
        txtPhoneNum.setText("");
        txtSalary.setText("");
        txtId.setEnabled(true);
        buttonMale.setSelected(false);
        buttonFemale.setSelected(false);
        myModel = new DefaultTableModel(headers, 0);
        new EmployeeDAO().loadDataToTable(myModel);
        tableInfo.setModel(myModel); 
    }//GEN-LAST:event_resetButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        QuanLyChung qlc = new QuanLyChung(accDAO);
        qlc.setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void comboBoxSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            File file = new File("file.txt");
            if(!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("\t\t\t\t______________EMPLOYEE MANAGEMENT______________\n\n\n");
            bw.write(String.format("%s %15s %15s %15s %15s %15s %15s %15s\n\n", "ID", "Name", "Gender", "Join Date", "Address"
                    , "Phone Number", "Position", "Salary"));
            for(int i = 0; i < tableInfo.getRowCount(); i++) {
                String id = String.valueOf(tableInfo.getModel().getValueAt(i, 0));
                String name = String.valueOf(tableInfo.getModel().getValueAt(i, 1));
                String gender = String.valueOf(tableInfo.getModel().getValueAt(i, 2));
                String joinDate = String.valueOf(tableInfo.getModel().getValueAt(i, 3));
                String address = String.valueOf(tableInfo.getModel().getValueAt(i, 4));
                String phoneNum = String.valueOf(tableInfo.getModel().getValueAt(i, 5));
                String position = String.valueOf(tableInfo.getModel().getValueAt(i, 6));
                String salary = String.valueOf(tableInfo.getModel().getValueAt(i, 7));
                bw.write(String.format("%s %15s %15s %15s %15s %15s %15s %15s\n", id, name, gender, joinDate, address, phoneNum, position, salary));
            }
            bw.close();
            fw.close();
            JOptionPane.showMessageDialog(this, "Data exported");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JRadioButton buttonFemale;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton buttonMale;
    private javax.swing.JComboBox<String> comboBoxSearch;
    private javax.swing.JComboBox<String> comboboxPosition;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTable tableInfo;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNum;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
