package Btnhom.Interface;

import Btnhom.DAO.*;
import Btnhom.DTO.*;
import javax.swing.JOptionPane;

public class QuanLyChung extends javax.swing.JFrame {

    private AccountDAO accDAO = new AccountDAO();
    
    public QuanLyChung() {
        initComponents();
        setTitle("General Management");
        setLocationRelativeTo(this);
    }
    
    public QuanLyChung(AccountDAO accDAO) {
        initComponents();
        setTitle("General Management");
        setLocationRelativeTo(this);
        this.accDAO = accDAO;
        txtHello.setText(String.format("Hello, %s!", accDAO.getAccount().getName()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        tableButton = new javax.swing.JButton();
        drinksButton = new javax.swing.JButton();
        orderButton = new javax.swing.JButton();
        summaryButton = new javax.swing.JButton();
        txtHello = new javax.swing.JLabel();
        employeeButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Account = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        logOutMenuItem = new javax.swing.JMenuItem();
        changePassMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("General Management");

        tableButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Btnhom/Interface/Icon/icons8-table-50.png"))); // NOI18N
        tableButton.setText("Table");
        tableButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableButtonActionPerformed(evt);
            }
        });

        drinksButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Btnhom/Interface/Icon/drinks.png"))); // NOI18N
        drinksButton.setText("Drinks");
        drinksButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        drinksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinksButtonActionPerformed(evt);
            }
        });

        orderButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Btnhom/Interface/Icon/order.png"))); // NOI18N
        orderButton.setText("Order");
        orderButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        orderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderButtonActionPerformed(evt);
            }
        });

        summaryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Btnhom/Interface/Icon/icons8-money-bag-50.png"))); // NOI18N
        summaryButton.setText("Summary");
        summaryButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        summaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                summaryButtonActionPerformed(evt);
            }
        });

        txtHello.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        employeeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Btnhom/Interface/Icon/tải xuống.png"))); // NOI18N
        employeeButton.setText("Employee");
        employeeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        employeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeButtonActionPerformed(evt);
            }
        });

        Account.setText("Account");
        Account.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Account.add(jSeparator1);

        logOutMenuItem.setText("Log out");
        logOutMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutMenuItemMouseClicked(evt);
            }
        });
        logOutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutMenuItemActionPerformed(evt);
            }
        });
        Account.add(logOutMenuItem);

        changePassMenuItem.setText("Change Password");
        changePassMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePassMenuItemActionPerformed(evt);
            }
        });
        Account.add(changePassMenuItem);

        jMenuBar1.add(Account);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(drinksButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(summaryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtHello, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(146, 146, 146))))
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(employeeButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtHello, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel3)
                .addGap(39, 39, 39)
                .addComponent(employeeButton)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tableButton)
                    .addComponent(drinksButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(summaryButton)
                    .addComponent(orderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logOutMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMenuItemMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_logOutMenuItemMouseClicked

    private void tableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableButtonActionPerformed
        // TODO add your handling code here:
        QuanLyBan qlb = new QuanLyBan(accDAO);
        qlb.setVisible(true);
        dispose();
    }//GEN-LAST:event_tableButtonActionPerformed

    private void drinksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinksButtonActionPerformed
        // TODO add your handling code here:
        QuanLyDoUong qldu = new QuanLyDoUong(accDAO);
        qldu.setVisible(true);
        dispose();
    }//GEN-LAST:event_drinksButtonActionPerformed

    private void changePassMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePassMenuItemActionPerformed
        // TODO add your handling code here:
        ThayMatKhau tmk = new ThayMatKhau(accDAO);
        tmk.setVisible(true);
        dispose();
    }//GEN-LAST:event_changePassMenuItemActionPerformed

    private void logOutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutMenuItemActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(this,"Are you sure to exit?", "EXIT", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(result == JOptionPane.YES_OPTION){
               DangNhap dn = new DangNhap();
               dn.setVisible(true);
               dispose();
            }else return;
    }//GEN-LAST:event_logOutMenuItemActionPerformed

    private void employeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeButtonActionPerformed
        // TODO add your handling code here:
        if(!new EmployeeDAO().getPosition(accDAO.getAccount().getEmployeeId()).equals("Manager")) {
            JOptionPane.showMessageDialog(this, "You do not have permission to do that!");
            return;
        }
        QuanLyNhanVien qlnv = new QuanLyNhanVien(accDAO);
        qlnv.setVisible(true);
        dispose();
    }//GEN-LAST:event_employeeButtonActionPerformed

    private void summaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_summaryButtonActionPerformed
        // TODO add your handling code here:
        QuanLyThongKe qltk = new QuanLyThongKe(accDAO);
        qltk.setVisible(true);
        dispose();
    }//GEN-LAST:event_summaryButtonActionPerformed

    private void orderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderButtonActionPerformed
        Thanhtoan tt = new Thanhtoan(accDAO);
        tt.setVisible(true);
        dispose();
    }//GEN-LAST:event_orderButtonActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyChung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyChung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyChung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyChung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyChung().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Account;
    private javax.swing.JMenuItem changePassMenuItem;
    private javax.swing.JButton drinksButton;
    private javax.swing.JButton employeeButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem logOutMenuItem;
    private javax.swing.JButton orderButton;
    private javax.swing.JButton summaryButton;
    private javax.swing.JButton tableButton;
    private javax.swing.JLabel txtHello;
    // End of variables declaration//GEN-END:variables
}
