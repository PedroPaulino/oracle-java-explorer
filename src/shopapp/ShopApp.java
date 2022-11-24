/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shopapp;

/**
 *
 * @author Pedro
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double tax = 0.2;
        double total = 0;
        //int measurement = 5;

        Customer c1 = new Customer("Pinky", 3);

        c1.setSize("S");
        //c1.setSize(measurement);

        System.out.println("Customer C1 name: " + c1.getName());

        Clothing item1 = new Clothing("Blue Jacket", 20.90, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.50, "S");
        Clothing item3 = new Clothing("Green Scarf", 5.0, "S");
        //Clothing item2 = new Clothing();
        // Clothing item3 = new Clothing();

        Clothing[] clothes = {item1, item2, item3};

//        item1.setDescription("Blue Jacket");
//        item1.setPrice(20.90);
//        item1.setSize("M");
//        item2.setDescription("Orange T-Shirt");
//        item2.setPrice(10.50);
//        item2.setSize("S");
//        
//        item3.setDescription("Green Scarf");
//        item3.setPrice(5.00);
//        item3.setSize("S");
        c1.addItems(clothes);

        System.out.println("MINIMIUM PRICE VALUE = " + Clothing.MIN_PRICE);
        for (Clothing clothe : c1.getItems()) {

            System.out.println("Clothe" + "," + clothe.getDescription() + "," + clothe.getPrice() + "," + clothe.getSize());

        }
        System.out.println("Total = " + c1.getTotalClothingCost(clothes));

        int average = 0;
        int count = 0;

        for (Clothing item : c1.getItems()) {
            if (item.getSize().equals("L")) {
                count++;
                average += item.getPrice();
            }
        }

        try {
            average = (count == 0) ? 0 : average/count;
        } catch (ArithmeticException Ae) {
            System.out.println("Dont divide by zero a");
        }

        System.out.println("Average price " + average + ", Count" + count);

    }
}
