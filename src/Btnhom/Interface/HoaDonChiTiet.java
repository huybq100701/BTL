package Btnhom.Interface;

import Btnhom.DAO.VouchersDAO;
import Btnhom.DAO.*;
import Btnhom.DTO.*;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
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
        setTitle("Bill Detail");
        setLocationRelativeTo(this);
    }

    public HoaDonChiTiet(AccountDAO accDAO, int invoiceID, int tableID) {
        initComponents();
        setStyle();
        setTitle("Bill Detail");
        setLocationRelativeTo(this);
        this.accDAO = accDAO;
        this.invoiceID = invoiceID;
        this.tableID = tableID;
        setBillDetails();
        setEventCombobox();
        paymentButton.setEnabled(false);
    }
    
    private void setStyle() {
        this.getContentPane().setBackground(Color.decode("#b2dbd5"));
        billTextField.setBackground(Color.decode("#ebb582"));
        applyVoucherButton.setBackground(Color.decode("#a5c3cf"));
        applyEventButton.setBackground(Color.decode("#a5c3cf"));
        OKButton.setBackground(Color.decode("#a5c3cf"));
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
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        billTextField.setColumns(20);
        billTextField.setRows(5);
        billTextField.setText("                                    Bill Details\n");
        jScrollPane1.setViewportView(billTextField);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 310, 320));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Apply discount");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 180, 34));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Voucher");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 73, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Event");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 110, 39, 30));
        getContentPane().add(voucherTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 101, -1));

        eventCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        eventCombobox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eventCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventComboboxActionPerformed(evt);
            }
        });
        getContentPane().add(eventCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 101, -1));

        applyVoucherButton.setText("Apply");
        applyVoucherButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        applyVoucherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyVoucherButtonActionPerformed(evt);
            }
        });
        getContentPane().add(applyVoucherButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        applyEventButton.setText("Apply");
        applyEventButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        applyEventButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyEventButtonActionPerformed(evt);
            }
        });
        getContentPane().add(applyEventButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Received");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 70, -1));
        getContentPane().add(receivedButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 132, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Exchange");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        OKButton.setText("OK");
        OKButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });
        getContentPane().add(OKButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, -1, -1));
        getContentPane().add(exchangeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 132, -1));

        paymentButton.setText("Payment");
        paymentButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentButtonActionPerformed(evt);
            }
        });
        getContentPane().add(paymentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Btnhom/Interface/Icon/Go Back_50px.png"))); // NOI18N
        backButton.setText("Back");
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        resetEventButton.setText("Reset");
        resetEventButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resetEventButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetEventButtonActionPerformed(evt);
            }
        });
        getContentPane().add(resetEventButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        resetVoucherButton.setText("Reset");
        resetVoucherButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resetVoucherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetVoucherButtonActionPerformed(evt);
            }
        });
        getContentPane().add(resetVoucherButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        updateButton.setText("Update bill");
        updateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Btnhom/Interface/Icon/Screenshot 2021-11-29 164757.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, -1));

        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, -1));

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
        if(!voucherTextField.getText().equals("")) {
            new VouchersDAO().deleteVouchers(voucherTextField.getText());
        }
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
        applyVoucherButton.setText("Apply");
        applyVoucherButton.setEnabled(true);
        voucherTextField.setText("");
        billTextField.setText(setBillDetails());
        discount1 = 0;
    }//GEN-LAST:event_resetVoucherButtonActionPerformed

    private void applyEventButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyEventButtonActionPerformed
        String event = eventCombobox.getItemAt(eventCombobox.getSelectedIndex()).toString();
        int discount = new EventDAO().getDiscountByName(event);
        applyEventButton.setText("Applied");
        applyEventButton.setEnabled(false);
        String s = String.format("Event: - %d", discount) + "%\n";
        discount2 = discount;
        billTextField.setText(billTextField.getText() + s);
    }//GEN-LAST:event_applyEventButtonActionPerformed

    private void resetEventButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetEventButtonActionPerformed
        applyEventButton.setText("Apply");
        applyEventButton.setEnabled(true);
        billTextField.setText(setBillDetails());
        
        String voucher = voucherTextField.getText();
        if(!voucher.equals("")) {
            String s = String.format("Voucher: - %d", new VouchersDAO().checkVouchers(voucher)) + "%\n";
            billTextField.setText(billTextField.getText() + s);
        }
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

    private void eventComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eventComboboxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            File file = new File("file.txt");
            if(!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(billTextField.getText());
            bw.close();
            fw.close();
            JOptionPane.showMessageDialog(this, "Data exported");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public String setBillDetails() {
        List<Orders> orders = new OrdersDAO().ListOrder(invoiceID);
        String display = "**********CHILLIE COFFEE & TEA**********\n";
        String employee = accDAO.getAccount().getName();
        display += ("Employee: " + employee + "\n\n");
        for(int i = 0; i < orders.size(); i++) {
            display += ((i + 1) + ".\n");
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton paymentButton;
    private javax.swing.JTextField receivedButton;
    private javax.swing.JButton resetEventButton;
    private javax.swing.JButton resetVoucherButton;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField voucherTextField;
    // End of variables declaration//GEN-END:variables
}
