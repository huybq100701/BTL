package Btnhom.DTO;

public class Menu {
    private int num;
    private String drinkName;
    private int count;
    private int price;
    private int totalPrice;

    public Menu() {
    }

    public Menu(int num, String drinkName, int count, int price, int totalPrice) {
        this.num = num;
        this.drinkName = drinkName;
        this.count = count;
        this.price = price;
        this.totalPrice = totalPrice;
    }
    
    public int getNum() {
        return num;
    }
    
    public void setNum(int num) {
        this.num = num;
    }
    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}

