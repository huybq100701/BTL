package Btnhom.Interface;
import Btnhom.DAO.TablesDAO;
import Btnhom.DTO.Tables;
import Btnhom.Utilities.DBUtility;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Btnhom.DAO.*;
import java.awt.Color;

public class QuanLyBan extends javax.swing.JFrame {
    DefaultTableModel tableModel;
    int idSave = -1;

    private AccountDAO accDAO = new AccountDAO();
    public QuanLyBan() {
        initComponents();
        setTitle("Table Management");
        setLocationRelativeTo(this);
        tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("Table Number");
        tableModel.addColumn("Status");
        tableModel.addColumn("Note");
        table.setModel(tableModel);
        displayTable();
    }
    
    public QuanLyBan(AccountDAO accDAO) {
        this.accDAO = accDAO;
        initComponents();
        setStyle();
        soban.setText("Bàn ");
        setTitle("Table Management");
        setLocationRelativeTo(this);
        tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("Table Number");
        tableModel.addColumn("Status");
        tableModel.addColumn("Note");
        table.setModel(tableModel);
        displayTable();
    }
    
    private void setStyle() {
        add.setBackground(Color.decode("#a5c3cf"));
        delete.setBackground(Color.decode("#f3d3b8"));
        edit.setBackground(Color.decode("#8593ae"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        soban = new javax.swing.JTextField();
        ghichu = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Back");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Table Number", "Status", "Note"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 0, 360, 401));

        backButton.setBackground(new java.awt.Color(204, 204, 204));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Btnhom/Interface/Icon/Go Back_50px.png"))); // NOI18N
        backButton.setText("Back");
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Table Management");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 26, 220, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Table Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Note");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 188, -1, -1));

        soban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobanActionPerformed(evt);
            }
        });
        getContentPane().add(soban, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 137, 165, -1));

        ghichu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ghichuActionPerformed(evt);
            }
        });
        getContentPane().add(ghichu, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 185, 165, -1));

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        getContentPane().add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Btnhom/Interface/Icon/Screenshot 2021-11-29 163335.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        QuanLyChung qlc = new QuanLyChung(accDAO);
        qlc.setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        Connection con = DBUtility.openConnection();
        try {
            Statement stmt = con.createStatement();
            int i = stmt.executeUpdate("INSERT INTO tables(table_name, note, status) VALUES ('" + soban.getText() + "','" + ghichu.getText() + "',0)");
            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Add Succesful!");
                displayTable();
            } else {
                JOptionPane.showMessageDialog(null, "Lỗi!!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyBan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        if (idSave >= 0) {
            Connection con;
            PreparedStatement pstmt;

            con = DBUtility.openConnection();
            try {
                pstmt = con.prepareStatement("update tables set table_name=?, note=? where ID=?");
                pstmt.setString(1, soban.getText());
                pstmt.setString(2, ghichu.getText());

                pstmt.setInt(3, idSave);

                int i = pstmt.executeUpdate();
                if (i > 0) {
                    JOptionPane.showMessageDialog(null, "Update Succesful!!");
                    displayTable();
                } else {
                    JOptionPane.showMessageDialog(null, "Update fail!!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyBan.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selete ID to update");
        }
    }//GEN-LAST:event_editActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        Connection con;
        PreparedStatement pstmt;

        if (idSave >= 0) {
            con = DBUtility.openConnection();
            try {
                pstmt = con.prepareStatement("Delete from tables where ID=?");
                pstmt.setInt(1, idSave);
                int i = pstmt.executeUpdate();
                if (i > 0) {
                    displayTable();
                    idSave = -1;
                    soban.setText("");
                    ghichu.setText("");
                    JOptionPane.showMessageDialog(null, "Delete Succesful!!");

                } else {
                    JOptionPane.showMessageDialog(null, "Delete fail!!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyBan.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selete to Delete!!");
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int row = table.getSelectedRow();
        List<Tables> listTable = TablesDAO.getInstance().LoadListTables();
        idSave = listTable.get(row).getTableId();
        soban.setText(table.getValueAt(row, 1) + "");
        ghichu.setText(table.getValueAt(row, 3) + "");
    }//GEN-LAST:event_tableMouseClicked

    private void ghichuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ghichuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ghichuActionPerformed

    private void sobanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sobanActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyBan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton backButton;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JTextField ghichu;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField soban;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
    private void displayTable() {
        tableModel.setRowCount(0);
        List<Tables> listTable = TablesDAO.getInstance().LoadListTables();

        for (int i = 0; i < listTable.size(); i++) {
            Tables tables = listTable.get(i);
            Object[] dt = {i + 1,tables.getTableName(), tables.getTableStatus(), tables.getTableNote()};
            tableModel.addRow(dt);
        }     
    }
}
