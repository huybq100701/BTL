package Btnhom.Interface;

import Btnhom.DAO.*;
import Btnhom.DTO.*;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ChuongTrinhKhuyenMai extends javax.swing.JFrame {

    private AccountDAO accDAO;
    String[] headers = {"Name", "Discount", "Start", "End"};
    DefaultTableModel myModel;
    public ChuongTrinhKhuyenMai() {
        initComponents();
        setTitle("Event");
        setLocationRelativeTo(this);
        displayTable();
    }

    public ChuongTrinhKhuyenMai(AccountDAO accDAO) {
        initComponents();
        setTitle("Event");
        setLocationRelativeTo(this);
        myModel = new DefaultTableModel(headers, 0);
        table.setModel(myModel);
        this.accDAO = accDAO;
        startTextField.setText("yyyy/MM/dd");
        endTextField.setText("yyyy/MM/dd");
        displayTable();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eventTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        discountTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        startTextField = new javax.swing.JTextField();
        endTextField = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        vouchersButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(eventTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 87, 143, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Event");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 76, 41, 38));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Discount");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 132, -1, 22));
        getContentPane().add(discountTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 135, 143, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("End");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 132, 42, 22));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Start");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 84, 42, 22));
        getContentPane().add(startTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 87, 143, -1));
        getContentPane().add(endTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 135, 143, -1));

        updateButton.setText("Update");
        updateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 200, -1, -1));

        addButton.setText("Add");
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 200, -1, -1));

        deleteButton.setText("Delete");
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 200, -1, -1));

        resetButton.setText("Reset");
        resetButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        getContentPane().add(resetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 200, -1, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Discount", "Start", "End"
            }
        ));
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 241, 500, 320));

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Btnhom/Interface/Icon/Go Back_50px.png"))); // NOI18N
        backButton.setText("Back");
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        vouchersButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Btnhom/Interface/Icon/discount-voucher-outline-icon-thin-line-black-discount-voucher-icon-vector.jpg"))); // NOI18N
        vouchersButton.setText("Vouchers");
        vouchersButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vouchersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vouchersButtonActionPerformed(evt);
            }
        });
        getContentPane().add(vouchersButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        jLabel5.setText("%");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 138, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Event");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Btnhom/Interface/Icon/Screenshot 2021-11-29 161912.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        QuanLyChung qlc = new QuanLyChung(accDAO);
        qlc.setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void vouchersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vouchersButtonActionPerformed
        Vouchers v = new Vouchers(accDAO);
        v.setVisible(true);
        dispose();
    }//GEN-LAST:event_vouchersButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String name = eventTextField.getText();
        int discount = Integer.parseInt(discountTextField.getText());
        String start = startTextField.getText();
        String end = endTextField.getText();
        if(new EventDAO().checkExistName(name)) {
            JOptionPane.showMessageDialog(this, "Name already exist");
            return;
        }
        if(new EventDAO().add(name, discount, start, end)) {
            JOptionPane.showMessageDialog(this, "Add successful");
            displayTable();
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        int row = table.getSelectedRow();
        if(row == -1) {
            JOptionPane.showMessageDialog(this, "Choose event to update!");
        }
        else {
            String name = table.getValueAt(table.getSelectedRow(), 0).toString();
            int id = new EventDAO().getIdByName(name);
            name = eventTextField.getText();
            int discount = Integer.parseInt(discountTextField.getText());
            String start = startTextField.getText();
            String end = endTextField.getText();
            if(new EventDAO().Update(id, name, discount, start, end)) {
                JOptionPane.showMessageDialog(this, "Update successfull!");
                displayTable();
            }
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int row = table.getSelectedRow();
        if(row == -1) {
            JOptionPane.showMessageDialog(this, "Choose event to delete!");
        }
        else {
            String name = table.getValueAt(table.getSelectedRow(), 0).toString();
            int id = new EventDAO().getIdByName(name);
            if(new EventDAO().delete(id)) {
                JOptionPane.showMessageDialog(this, "Delete successfull!");
                displayTable();
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        eventTextField.setText("");
        discountTextField.setText("");
        startTextField.setText("");
        endTextField.setText("");
        displayTable();
    }//GEN-LAST:event_resetButtonActionPerformed
    private void displayTable() {
        myModel.setRowCount(0); 
        List<Event> listEvent = new EventDAO().GetListEvent();
        for (int i = 0; i < listEvent.size(); i++) {
            Event event = listEvent.get(i);
            String discount = event.getDiscount() + "%";
            Object[] dt = {event.getName(), discount, event.getStart(), event.getEnd()};
            myModel.addRow(dt);
        }
    }
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
            java.util.logging.Logger.getLogger(ChuongTrinhKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChuongTrinhKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChuongTrinhKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChuongTrinhKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChuongTrinhKhuyenMai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField discountTextField;
    private javax.swing.JTextField endTextField;
    private javax.swing.JTextField eventTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField startTextField;
    private javax.swing.JTable table;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton vouchersButton;
    // End of variables declaration//GEN-END:variables
}
