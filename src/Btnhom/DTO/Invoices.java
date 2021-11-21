package Btnhom.DTO;

import java.sql.Timestamp;
import java.util.Date;

public class Invoices {
    private int num;
    private int id;
    private int accountId;
    private String employeeName;
    private int tablesId;
    private String tableName;
    private int totalPrice;
    private Timestamp invoiceDate;
    private int status;

    public Invoices() {
    }

    public Invoices(int num, int id, int accountId, String employeeName, Timestamp invoiceDate, int totalPrice, int tablesId, String tableName, int status) {
        this.num = num;
        this.id = id;
        this.accountId = accountId;
        this.employeeName = employeeName;
        this.tablesId = tablesId;
        this.tableName = tableName;
        this.totalPrice = totalPrice;
        this.invoiceDate = invoiceDate;
        this.status = status;
    }
    
    public int getNum() {
        return num;
    }
    
    public void setNum(int num) {
        this.num = num;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    
    public String getEmployeeName() {
        return employeeName;
    }
    
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
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

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
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

