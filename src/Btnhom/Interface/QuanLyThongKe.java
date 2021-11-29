package Btnhom.Interface;

import Btnhom.DAO.*;
import Btnhom.DTO.*;
import Btnhom.Utilities.DBUtility;
import java.awt.Color;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class QuanLyThongKe extends javax.swing.JFrame {
    int idTable = -1;
    DefaultComboBoxModel<Drinks> comboBoxModel;
    DefaultTableModel tableModelTables;
    String[] headers1 = {"ID", "Table Name", "Status", "Note"};
    
    DefaultTableModel tableModelDrinks;
    String[] headers2 = {"ID", "Drink Name", "Cost", "Quantity"};
    int totalPrice = 0;

    private AccountDAO accDAO = new AccountDAO();
    public QuanLyThongKe() {
        initComponents();
        setTitle("Summary Management");
        setLocationRelativeTo(this);
        setDrinksCombobox();
        summaryButton.setEnabled(false);
        tableModelTables = new DefaultTableModel(headers1, 0);
        displayTable1();
        table1.setModel(tableModelTables);
        
        tableModelDrinks = new DefaultTableModel(headers2, 0);
        table2.setModel(tableModelDrinks);
        //displayTable2();
    }
    
    public QuanLyThongKe(AccountDAO accDAO) {
        initComponents();
        setStyle();
        setTitle("Summary Management");
        setLocationRelativeTo(this);
        this.accDAO = accDAO;
        setDrinksCombobox();
        summaryButton.setEnabled(false);
        tableModelTables = new DefaultTableModel(headers1, 0);
        displayTable1();
        table1.setModel(tableModelTables);
        
        tableModelDrinks = new DefaultTableModel(headers2, 0);
        table2.setModel(tableModelDrinks);
        //displayTable2();
    }
    
    private void setStyle() {
        addButton.setBackground(Color.decode("#a5c3cf"));
    }
    
    public void setDrinksCombobox() {
        List<Drinks> drinks = DrinksDAO.getInstance().GetListDrink();
        drinksCombobox.removeAllItems();
        for(Drinks drink: drinks) {
            drinksCombobox.addItem(drink.getName());
        }
    }
    
    void displayTable1() {
        tableModelTables.setRowCount(0); 
        List<Tables> listTable = TablesDAO.getInstance().LoadListTables();
        for (int i = 0; i < listTable.size(); i++) {
            Tables tables = listTable.get(i);
            Object[] dt = {i + 1,tables.getTableName(), tables.getTableStatus(), tables.getTableNote()};
            tableModelTables.addRow(dt);
        }     
    }
    
    void displayTable2(int tableID) {
        tableModelDrinks.setRowCount(0); 
        new MenuDAO().loadDataToTable(tableModelDrinks, tableID);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        drinksCombobox = new javax.swing.JComboBox<>();
        countSpinner = new javax.swing.JSpinner();
        sizeLabel = new javax.swing.JLabel();
        sizeCombobox = new javax.swing.JComboBox<>();
        toppingLabel = new javax.swing.JLabel();
        toppingCombobox = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        summaryButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sizeLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Table number", "Status", "Note"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 367, 384));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(868, 106, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Sales Management");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, -1));

        drinksCombobox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        drinksCombobox.setName("ChooseDrink"); // NOI18N
        drinksCombobox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                drinksComboboxMouseEntered(evt);
            }
        });
        getContentPane().add(drinksCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, -1, -1));
        getContentPane().add(countSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, -1, -1));

        sizeLabel.setText("Size");
        getContentPane().add(sizeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 214, -1, -1));

        sizeCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L", "XL", " " }));
        sizeCombobox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sizeCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeComboboxActionPerformed(evt);
            }
        });
        getContentPane().add(sizeCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 211, -1, -1));

        toppingLabel.setText("Topping");
        getContentPane().add(toppingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 245, -1, -1));

        toppingCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No topping", "Bubble", "Jelly" }));
        toppingCombobox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        toppingCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toppingComboboxActionPerformed(evt);
            }
        });
        getContentPane().add(toppingCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 242, -1, -1));

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Drink Name", "Quantity", "Cost"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Long.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, 275));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Btnhom/Interface/Icon/Go Back_50px.png"))); // NOI18N
        jButton3.setText("Back");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 41, -1, -1));

        summaryButton.setText("Summary");
        summaryButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        summaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                summaryButtonActionPerformed(evt);
            }
        });
        getContentPane().add(summaryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, 91, 60));

        addButton.setText("Add");
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Btnhom/Interface/Icon/Screenshot 2021-11-29 170436.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 390, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Btnhom/Interface/Icon/Screenshot 2021-11-29 170436.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, -1));

        sizeLabel1.setText("Size");
        getContentPane().add(sizeLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 214, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void drinksComboboxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drinksComboboxMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_drinksComboboxMouseEntered

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        QuanLyChung qlc = new QuanLyChung(accDAO);
        qlc.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void sizeComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sizeComboboxActionPerformed

    private void summaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_summaryButtonActionPerformed
        int row = table1.getSelectedRow();
        int tableID = 0;
        if(row >= 0) {
            String tableName = table1.getValueAt(row, 1).toString();
            tableID = new TablesDAO().getIDByName(tableName);
            int invoiceID = new InvoicesDAO().GetUncheckInvoiceByTableId(tableID);
//            int totalPrice = new OrdersDAO().totalPrice(invoiceID);
//            if(new InvoicesDAO().Update(invoiceID, totalPrice) && new TablesDAO().updateStatus(0, tableID)) {
//                //JOptionPane.showMessageDialog(this, "Payment successful!");
//                //new TablesDAO().updateStatus(0, tableID);
//                HoaDonChiTiet hdct = new HoaDonChiTiet(accDAO, invoiceID);
//                hdct.setVisible(true);
//                dispose();
//            }
//            displayTable2(tableID);
//            displayTable1();
              HoaDonChiTiet hdct = new HoaDonChiTiet(accDAO, invoiceID, tableID);
              hdct.setVisible(true);
              dispose();
        }
        else JOptionPane.showMessageDialog(this, "Choose a table to payment!");
    }//GEN-LAST:event_summaryButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        int row = table1.getSelectedRow();
        if(row == -1) {
            JOptionPane.showMessageDialog(this, "Choose a table to add order!");
            return;
        }
        // add a invoice
        if(Integer.parseInt(countSpinner.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(this, "Quantity must be greater than 0!");
            return;
        }
        int accountID = accDAO.getAccount().getId();
        row = table1.getSelectedRow();
        int tableID = 0;
        if(row >= 0) {
            String tableName = table1.getValueAt(row, 1).toString();
            tableID = new TablesDAO().getIDByName(tableName);
            if(new InvoicesDAO().GetUncheckInvoiceByTableId(tableID) == -1) {
                new InvoicesDAO().Insert(tableID, accountID);
            }
        }
        // add a order
        int drinkID = new DrinksDAO().getIDByName(drinksCombobox.getItemAt(drinksCombobox.getSelectedIndex()));
        int invoiceID = new InvoicesDAO().GetUncheckInvoiceByTableId(tableID);
        int count = Integer.parseInt(countSpinner.getValue().toString());
        String size = sizeCombobox.getItemAt(sizeCombobox.getSelectedIndex());
        String topping = toppingCombobox.getItemAt(toppingCombobox.getSelectedIndex());
        if(new OrdersDAO().Insert(drinkID, invoiceID, count, size, topping)) {
            new TablesDAO().updateStatus(1, tableID);
            summaryButton.setEnabled(true);
        }
        // reset table1
        displayTable1();
        // display table2
        displayTable2(tableID);
    }//GEN-LAST:event_addButtonActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        int row = table1.getSelectedRow();
        int tableID = 0;
        if(row >= 0) {
            String tableName = table1.getValueAt(row, 1).toString();
            tableID = new TablesDAO().getIDByName(tableName);
            displayTable2(tableID);
        }
        if(table1.getValueAt(table1.getSelectedRow(), 2).equals("Còn trống")) summaryButton.setEnabled(false);
        else summaryButton.setEnabled(true);
    }//GEN-LAST:event_table1MouseClicked

    private void toppingComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toppingComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toppingComboboxActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyThongKe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JSpinner countSpinner;
    private javax.swing.JComboBox<String> drinksCombobox;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> sizeCombobox;
    private javax.swing.JLabel sizeLabel;
    private javax.swing.JLabel sizeLabel1;
    private javax.swing.JButton summaryButton;
    private javax.swing.JTable table1;
    private javax.swing.JTable table2;
    private javax.swing.JComboBox<String> toppingCombobox;
    private javax.swing.JLabel toppingLabel;
    // End of variables declaration//GEN-END:variables
}
