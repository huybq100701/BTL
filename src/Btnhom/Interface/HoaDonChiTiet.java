package Btnhom.Interface;

import Btnhom.DAO.VouchersDAO;
import Btnhom.DAO.*;
import Btnhom.DTO.*;
import java.util.List;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class HoaDonChiTiet extends javax.swing.JFrame {

    private AccountDAO accDAO = new AccountDAO();
    private int invoiceID, tableID;
    private int price;
    private int discount1, discount2;
            
    public HoaDonChiTiet() {
        initComponents();
    }

    public HoaDonChiTiet(AccountDAO accDAO, int invoiceID, int tableID) {
        initComponents();
        this.accDAO = accDAO;
        this.invoiceID = invoiceID;
        this.tableID = tableID;
        setBillDetails();
        setEventCombobox();
        paymentButton.setEnabled(false);
    }
    
    public void setEventCombobox() {
        List<Event> events = new EventDAO().GetListEvent();
        eventCombobox.removeAllItems();
        for(Event event: events) {
            eventCombobox.addItem(event.getName());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        billTextField = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        voucherTextField = new javax.swing.JTextField();
        eventCombobox = new javax.swing.JComboBox<>();
        applyVoucherButton = new javax.swing.JButton();
        applyEventButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        receivedButton = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        OKButton = new javax.swing.JButton();
        exchangeButton = new javax.swing.JTextField();
        paymentButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        resetEventButton = new javax.swing.JButton();
        resetVoucherButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        billTextField.setColumns(20);
        billTextField.setRows(5);
        billTextField.setText("                                                   Bill Details\n");
        jScrollPane1.setViewportView(billTextField);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Apply discount");

        jLabel2.setText("Voucher");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Event");

        eventCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        applyVoucherButton.setText("Apply");
        applyVoucherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyVoucherButtonActionPerformed(evt);
            }
        });

        applyEventButton.setText("Apply");
        applyEventButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyEventButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Received");

        jLabel5.setText("Exchange");

        OKButton.setText("OK");
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });

        paymentButton.setText("Payment");
        paymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        resetEventButton.setText("Reset");
        resetEventButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetEventButtonActionPerformed(evt);
            }
        });

        resetVoucherButton.setText("Reset");
        resetVoucherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetVoucherButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update bill");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(backButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(voucherTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eventCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(applyVoucherButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(resetVoucherButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(applyEventButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(resetEventButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(updateButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(receivedButton)
                                    .addComponent(exchangeButton))))
                        .addGap(29, 29, 29)
                        .addComponent(OKButton)
                        .addGap(70, 70, 70)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paymentButton))
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(paymentButton)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(voucherTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(applyVoucherButton)
                    .addComponent(resetVoucherButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eventCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(applyEventButton)
                    .addComponent(resetEventButton))
                .addGap(33, 33, 33)
                .addComponent(updateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(receivedButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OKButton))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(exchangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void paymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentButtonActionPerformed

        if(new InvoicesDAO().Update(invoiceID, price) && new TablesDAO().updateStatus(0, tableID)) {
            if(price >= 300000) {
                String uuid = UUID.randomUUID().toString();
                uuid.replace("-", "");
                uuid = uuid.substring(0, 5);
                while(new VouchersDAO().checkVouchers(uuid) != -1) {
                    uuid = UUID.randomUUID().toString();
                    uuid.replace("-", "");
                    uuid = uuid.substring(0, 5);
                }
                new VouchersDAO().add(uuid, 20);
                JOptionPane.showMessageDialog(this, "Payment successful!\nGot a voucher 20% discount: " + uuid);
            }
            else if(price >= 200000) {
                String uuid = UUID.randomUUID().toString();
                uuid.replace("-", "");
                uuid = uuid.substring(0, 5);
                while(new VouchersDAO().checkVouchers(uuid) != -1) {
                    uuid = UUID.randomUUID().toString();
                    uuid.replace("-", "");
                    uuid = uuid.substring(0, 5);
                }
                new VouchersDAO().add(uuid, 10);
                JOptionPane.showMessageDialog(this, "Payment successful!\nGot a voucher 10% discount: " + uuid);
            }
            else {
                JOptionPane.showMessageDialog(this, "Payment successful!");
            }
        }
        new QuanLyThongKe().displayTable2(tableID);
        new QuanLyThongKe().displayTable1();
        QuanLyThongKe qltk = new QuanLyThongKe(accDAO);
        qltk.setVisible(true);
        dispose();
    }//GEN-LAST:event_paymentButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        QuanLyThongKe qltk = new QuanLyThongKe(accDAO);
        qltk.setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void applyVoucherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyVoucherButtonActionPerformed
        // TODO add your handling code here:
        String voucher = voucherTextField.getText();
        if(new VouchersDAO().checkVouchers(voucher) != -1) {
            applyVoucherButton.setText("Applied");
            applyVoucherButton.setEnabled(false);
            String s = String.format("Voucher: - %d", new VouchersDAO().checkVouchers(voucher)) + "%\n";
            billTextField.setText(billTextField.getText() + s);
            discount1 = new VouchersDAO().checkVouchers(voucher);
        }
        else {
            JOptionPane.showMessageDialog(this, "Invalid voucher!");
        }
    }//GEN-LAST:event_applyVoucherButtonActionPerformed

    private void resetVoucherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetVoucherButtonActionPerformed
        // TODO add your handling code here:
        applyVoucherButton.setText("Apply");
        applyVoucherButton.setEnabled(true);
        billTextField.setText(setBillDetails());
        discount1 = 0;
    }//GEN-LAST:event_resetVoucherButtonActionPerformed

    private void applyEventButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyEventButtonActionPerformed
        String event = eventCombobox.getItemAt(eventCombobox.getSelectedIndex()).toString();
        int discount = new EventDAO().getDiscountByName(event);
        applyEventButton.setText("Applied");
        applyEventButton.setEnabled(false);
        String s = String.format("Voucher: - %d", discount) + "%\n";
        discount2 = discount;
        billTextField.setText(billTextField.getText() + s);
    }//GEN-LAST:event_applyEventButtonActionPerformed

    private void resetEventButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetEventButtonActionPerformed
        applyEventButton.setText("Apply");
        applyEventButton.setEnabled(true);
        billTextField.setText(setBillDetails());
        
        String voucher = voucherTextField.getText();
        String s = String.format("Voucher: - %d", new VouchersDAO().checkVouchers(voucher)) + "%\n";
        billTextField.setText(billTextField.getText() + s);
        discount2 = 0;
    }//GEN-LAST:event_resetEventButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        int totalPrice = (100 - (discount1 + discount2)) * price / 100;
        price = totalPrice;
        String s = String.format("\n= %d\n", totalPrice);
        billTextField.setText(billTextField.getText() + s);
        paymentButton.setEnabled(true);
    }//GEN-LAST:event_updateButtonActionPerformed

    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed
        // TODO add your handling code here:
        exchangeButton.setText(String.valueOf(Integer.parseInt(receivedButton.getText()) - price));
    }//GEN-LAST:event_OKButtonActionPerformed

    public String setBillDetails() {
        List<Orders> orders = new OrdersDAO().ListOrder(invoiceID);
        String display = "";
        for(int i = 0; i < orders.size(); i++) {
            display += "Drink " + (i + 1) + "\n" ;
            Orders o = orders.get(i);
            int stt = i + 1;
            String drinkName = new DrinksDAO().getNameByID(o.getDrinksId());
            String size = o.getSize();
            String topping = o.getTopping();
            int quantity = o.getCount();
            int cost = new DrinksDAO().getPriceByID(o.getDrinksId());
            display += String.format("Drink name: %s\n", drinkName);
            display += String.format("Quantity: %d\n", quantity);
            display += String.format("Cost: %d\n", cost);
            display += "------------------------------\n";
            if(size.equals("L")) display += String.format("Size: %s x %.1f\n", size, 1.2);
            if(size.equals("XL")) display += String.format("Size: %s x %.1f\n", size, 1.4);
            float hs = (size.equals("M")) ? 1 : size.equals("L") ? 1.2f : 1.4f;
            int t = (topping.equals("No topping")) ? 0 : 10000;
            if(t != 0) display += String.format("Topping: %s  + 10000\n", topping);
            int x = (int)(cost * quantity * hs) + t;
            display += (String.valueOf(x) + "\n\n");
        }
        display += "************************\n";
        String s = String.format("Total: %d\n", new OrdersDAO().totalPrice(invoiceID));
        price = new OrdersDAO().totalPrice(invoiceID);
        display += s;
        billTextField.setText(display);
        return display;
    }
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
            java.util.logging.Logger.getLogger(HoaDonChiTiet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HoaDonChiTiet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HoaDonChiTiet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HoaDonChiTiet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HoaDonChiTiet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OKButton;
    private javax.swing.JButton applyEventButton;
    private javax.swing.JButton applyVoucherButton;
    private javax.swing.JButton backButton;
    private javax.swing.JTextArea billTextField;
    private javax.swing.JComboBox<String> eventCombobox;
    private javax.swing.JTextField exchangeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton paymentButton;
    private javax.swing.JTextField receivedButton;
    private javax.swing.JButton resetEventButton;
    private javax.swing.JButton resetVoucherButton;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField voucherTextField;
    // End of variables declaration//GEN-END:variables
}
