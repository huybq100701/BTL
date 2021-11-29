
package Btnhom.Interface;

import Btnhom.DAO.*;
import Btnhom.DTO.*;
import Btnhom.Utilities.*;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.*;

/**
 *
 * @author huybq
 */
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
        setTitle("Drinks Management");
        setLocationRelativeTo(this);
        tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("DrinksName");
        tableModel.addColumn("cost");
        table.setModel(tableModel);
        displayTable();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        drinkname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cost = new javax.swing.JTextField();
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

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Drinks Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        getContentPane().add(drinkname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 201, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Cost");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));
        getContentPane().add(cost, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 201, -1));

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
        Connection con;
        PreparedStatement pstmt;

        if (idSave >= 0) {
            con = DBUtility.openConnection();
            try {
                pstmt = con.prepareStatement("Delete from drinks where ID=?");
                pstmt.setInt(1, idSave);
                int i = pstmt.executeUpdate();
                if (i > 0) {
                    displayTable();
                    idSave = -1;
                    drinkname.setText("");
                    cost.setText("");
                    JOptionPane.showMessageDialog(null, "Delete Succesful!!");
                } else {
                    JOptionPane.showMessageDialog(null, "Delete fail!!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyDoUong.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seletet to Delete!!");
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        Connection con;
        Statement stmt;

        con = DBUtility.openConnection();
        try {
            stmt = con.createStatement();
            int i = stmt.executeUpdate("INSERT INTO drinks(ID,DrinksName, cost) VALUES ('"+ "1"+"','"  + drinkname.getText() + "','" + Integer.parseInt(cost.getText())+ "')");
            if (i > 0) {
                displayTable();
                JOptionPane.showMessageDialog(null, "Insert Succesful!!");
            } else {
                JOptionPane.showMessageDialog(null, "Insert fail!!");
            }
        } catch (SQLException ex) {
            System.out.println("Btnhom.Interface.QuanLyDoUong.addActionPerformed()");
        }
    }//GEN-LAST:event_addActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int row= table.getSelectedRow();
        Connection con;
        con = DBUtility.openConnection();
        List<Drinks> list = DrinksDAO.getInstance().GetListDrink();
        idSave = list.get(row).getId();
        drinkname.setText(tableModel.getValueAt(row, 1) + "");
        cost.setText(tableModel.getValueAt(row, 2) + "");
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
    private javax.swing.JTextField cost;
    private javax.swing.JButton delete;
    private javax.swing.JTextField drinkname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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

