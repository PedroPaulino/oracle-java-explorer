/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopapp;

/**
 *
 * @author Pedro
 */
public class Customer {
    
    private String name;
    private String size;
    private Clothing items[];
    private Integer measurement;

    public Customer(String name, Integer measurement) {
        this.name = name;
        this.measurement = measurement;
    }
    
    
    
    public void addItems(Clothing clothes[]){
        this.items = clothes;
    }
    public Clothing[] getItems(){
        return items;
    }
    
    public double getTotalClothingCost(Clothing clothes[]){
        double total = 0.0;
        
        for (Clothing clothe : clothes) {
            total = total + clothe.getPrice();
        }
        
        return total;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    public void setSize(int measurement){
        switch (measurement) {
            case 1, 2, 3:
                this.setSize("S");
                break;
                
            case 4, 5, 6:
                this.setSize("M");
            break;
            
            case 7, 8, 9:
                this.setSize("L");
            break;
            default:
                this.setSize("X");
        }
    }
    
    
    
}
