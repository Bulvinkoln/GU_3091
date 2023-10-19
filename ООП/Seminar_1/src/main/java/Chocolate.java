package src.main.java;

public class Chocolate extends Product{
    /***
     * Калорийность
     */

    private double calory;


    public double getCalory() {
        return calory;
    }

    public Chocolate(String brand, String name, double price, double calory){
        super(brand, name, price);
        this.calory = calory;
    }

    public String displayInfo() {
        return String.format("[Шоколад]\n%s - %s - %.2f;\n Калорийность: %.1f",
                brand,name,price,calory);
    }
}
