package Btnhom.DTO;

public class Voucher {
    private int id, discount;
    private String name;

    public Voucher(int id, String name, int discount) {
        this.id = id;
        this.discount = discount;
        this.name = name;
    }
    
    public Voucher(){}
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
