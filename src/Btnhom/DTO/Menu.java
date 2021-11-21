/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Btnhom.DTO;

/**
 *
 * @author Admin
 */
public class Menu {

    private String drinkName;
    private int count;
    private int price;
    private int totalPrice;

    public Menu() {
    }

    public Menu(String drinkName, int count, int price, int totalPrice) {
        this.drinkName = drinkName;
        this.count = count;
        this.price = price;
        this.totalPrice = totalPrice;
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

