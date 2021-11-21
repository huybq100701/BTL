/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Btnhom.DTO;

import java.sql.Timestamp;
import java.util.Date;




public class Invoices {

    private int id;
    private int accountId;
    private int tablesId;
    private int totalPrice;
    private Timestamp invoiceDate;
    private int status;

    public Invoices() {
    }

    public Invoices(int id, int accountId, Timestamp invoiceDate, int totalPrice, int tablesId, int status) {
        this.id = id;
        this.accountId = accountId;
        this.tablesId = tablesId;
        this.totalPrice = totalPrice;
        this.invoiceDate = invoiceDate;
        this.status = status;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTablesId() {
        return tablesId;
    }

    public void setTablesId(int tablesId) {
        this.tablesId = tablesId;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Timestamp getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Timestamp invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
