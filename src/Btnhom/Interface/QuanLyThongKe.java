package Btnhom.Interface;

import Btnhom.DAO.*;
import Btnhom.DTO.*;
import Btnhom.Utilities.DBUtility;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Sales Management");

        drinksCombobox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        drinksCombobox.setName("ChooseDrink"); // NOI18N
        drinksCombobox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                drinksComboboxMouseEntered(evt);
            }
        });

        sizeLabel.setText("Size");

        sizeCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L", "XL", " " }));
        sizeCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeComboboxActionPerformed(evt);
            }
        });

        toppingLabel.setText("Topping");

        toppingCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No topping", "Bubble", "Jelly" }));

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

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Btnhom/Interface/Icon/Go Back_50px.png"))); // NOI18N
        jButton3.setText("Back");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        summaryButton.setText("Summary");
        summaryButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        summaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                summaryButtonActionPerformed(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(319, 491, Short.MAX_VALUE)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(toppingLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(toppingCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(drinksCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(countSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(sizeLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(sizeCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(73, 73, 73)
                                    .addComponent(addButton)))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(345, 345, 345))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(788, Short.MAX_VALUE)
                    .addComponent(summaryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(41, 41, 41)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(drinksCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(countSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sizeLabel)
                                    .addComponent(sizeCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addButton)
                                .addGap(22, 22, 22)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(toppingLabel)
                            .addComponent(toppingCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(144, 144, 144)
                    .addComponent(summaryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(412, Short.MAX_VALUE)))
        );

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
        // add a invoice
        if(Integer.parseInt(countSpinner.getValue().toString()) < 0) {
            JOptionPane.showMessageDialog(this, "Quantity must be greater than 0!");
            return;
        }
        int accountID = accDAO.getAccount().getId();
        int row = table1.getSelectedRow();
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> sizeCombobox;
    private javax.swing.JLabel sizeLabel;
    private javax.swing.JButton summaryButton;
    private javax.swing.JTable table1;
    private javax.swing.JTable table2;
    private javax.swing.JComboBox<String> toppingCombobox;
    private javax.swing.JLabel toppingLabel;
    // End of variables declaration//GEN-END:variables
}
