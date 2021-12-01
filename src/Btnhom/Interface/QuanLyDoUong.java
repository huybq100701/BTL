
package Btnhom.Interface;

import Btnhom.DAO.*;
import Btnhom.DTO.*;
import Btnhom.Utilities.*;
import java.awt.Color;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.*;

public class QuanLyDoUong extends javax.swing.JFrame {
    DefaultTableModel tableModel;
    int idSave = -1;

    private AccountDAO accDAO = new AccountDAO();
    public QuanLyDoUong() {
        initComponents();
        setTitle("Drinks Management");
        setLocationRelativeTo(this);
        tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("DrinksName");
        tableModel.addColumn("cost");
        table.setModel(tableModel);
        displayTable();
    }
    
    public QuanLyDoUong(AccountDAO accDAO) {
        this.accDAO = accDAO;
        initComponents();
        setStyle();
        setTitle("Drinks Management");
        setLocationRelativeTo(this);
        tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("DrinksName");
        tableModel.addColumn("cost");
        table.setModel(tableModel);
        displayTable();
    }
    
    private void setStyle() {
        this.getContentPane().setBackground(Color.decode("#b2dbd5"));
        table.setBackground(Color.decode("#acbd78"));
        drinkLabel.setForeground(Color.decode("#004d47"));
        costLabel.setForeground(Color.decode("#004d47"));
        add.setBackground(Color.decode("#a5c3cf"));
        delete.setBackground(Color.decode("#f3d3b8"));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        drinkLabel = new javax.swing.JLabel();
        drinkname = new javax.swing.JTextField();
        costLabel = new javax.swing.JLabel();
        costText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        add = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Drinks Management");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        drinkLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        drinkLabel.setText("Drinks Name");
        getContentPane().add(drinkLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        getContentPane().add(drinkname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 201, -1));

        costLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        costLabel.setText("Cost");
        getContentPane().add(costLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));
        getContentPane().add(costText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 201, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Drinks Name", "Cost"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 360, 285));

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Btnhom/Interface/Icon/Go Back_50px.png"))); // NOI18N
        backButton.setText("Back");
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        add.setText("Add");
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 253, 71, 30));

        delete.setText("Delete");
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 253, 70, 30));
        delete.getAccessibleContext().setAccessibleName("delete");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Btnhom/Interface/Icon/background.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        QuanLyChung qlc = new QuanLyChung(accDAO);
        qlc.setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int row = table.getSelectedRow();
        if(row == -1) {
            JOptionPane.showMessageDialog(this, "Choose drink to delete!");
        }
        else {
            System.out.println(table.getValueAt(row, 1).toString());
            if(new DrinksDAO().delete(table.getValueAt(row, 1).toString())) {
                JOptionPane.showMessageDialog(this, "Delete successful!");
                drinkname.setText("");
                costText.setText("");
                displayTable();
            }
            else JOptionPane.showMessageDialog(this, "Something went wrong!");
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        String drinkName = drinkname.getText();
        int cost = Integer.parseInt(costText.getText());
        if(new DrinksDAO().add(drinkName, cost)) {
            JOptionPane.showMessageDialog(this, "Add successful");
            displayTable();
        }
        else {
            JOptionPane.showMessageDialog(this, "Something went wrong");
        }
    }//GEN-LAST:event_addActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int row= table.getSelectedRow();
        Connection con;
        con = DBUtility.openConnection();
        List<Drinks> list = DrinksDAO.getInstance().GetListDrink();
        idSave = list.get(row).getId();
        drinkname.setText(tableModel.getValueAt(row, 1) + "");
        costText.setText(tableModel.getValueAt(row, 2) + "");
    }//GEN-LAST:event_tableMouseClicked

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
            java.util.logging.Logger.getLogger(QuanLyDoUong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyDoUong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyDoUong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyDoUong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyDoUong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel costLabel;
    private javax.swing.JTextField costText;
    private javax.swing.JButton delete;
    private javax.swing.JLabel drinkLabel;
    private javax.swing.JTextField drinkname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
private void displayTable() {
        tableModel.setRowCount(0);
        List<Drinks> list = DrinksDAO.getInstance().GetListDrink();
        for (int i = 0; i < list.size(); i++) {
            Drinks drinks = list.get(i);
            Object[] dt = {i + 1, drinks.getName(), drinks.getPrice()};
            tableModel.addRow(dt);
        }
    }
}

