package Btnhom.DTO;


public class Orders {

    private int id;
    private int drinksId;
    private int invoiceId;
    private int count;
    private String size, topping;

    public Orders() {
    }

    public Orders(int id, int drinksId, int count, int invoiceId, String size, String topping) {
        this.id = id;
        this.drinksId = drinksId;
        this.invoiceId = invoiceId;
        this.count = count;
        this.size = size;
        this.topping = topping;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDrinksId() {
        return drinksId;
    }

    public void setDrinksId(int drinksId) {
        this.drinksId = drinksId;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }
    
    

}

