/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Btnhom.DTO;

/**
 *
 * @author Admin
 */
import java.util.Date;

/**
 *
 * @author huyparody
 */
public class Drinks {

    private int id;
    private String name;
    private int price;

    public Drinks() {
    }

    public Drinks(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Drinks(String string, int aInt0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    

    @Override
    public String toString() {
        return name;
    }

}
