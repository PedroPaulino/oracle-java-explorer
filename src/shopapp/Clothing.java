/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopapp;

/**
 *
 * @author Pedro
 */
public class Clothing {
    
    private String description;
    private String size;
    private double price;
    private boolean outOfStock = true;
    
    public static final double MIN_PRICE = 10.00;
    public static final double MIN_TAX = 0.2;

    public Clothing(String description, double price, String size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        
        return price + (price * MIN_TAX);
    }

    public void setPrice(Double price) {
        
      this.price = (price > MIN_PRICE) ? price : MIN_PRICE;
        
    }

    public boolean isOutOfStock() {
        return outOfStock;
    }

    public void setOutOfStock(boolean outOfStock) {
        this.outOfStock = outOfStock;
    }
    
    
}
