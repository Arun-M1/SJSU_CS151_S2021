/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arun Murugan
 */
public class Product {

    private String name;
    private String description;
    private double price;
    private int mQuantity;

    public Product(String name, String description, double price, int mQuantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.mQuantity = mQuantity;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getMQuantity() {
        return mQuantity;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + " Item description: " + description + " price: $" + price + " Maximum Quantity " + mQuantity;
    }
}
