package src.main.java;

public class BottleOfMilk extends Product{
    /***
     * объем бутылки
     */

    private double volume;

    public double getVolume() {
        return volume;
    }

    /***
     * жирность
     */

    private double fat;

    public double getFat() {
        return fat;
    }

    public BottleOfMilk (String brand, String name, double price, double volume, double fat){
        super(brand, name, price);
        this.volume = volume;
        this.fat = fat;
    }

    public String displayInfo() {
        return String.format("[Бутылка с молоком]\n%s - %s - %.2f;\n Объем: %.1f;\n Жирность: %.1f\"",
                brand,name,price,volume, fat);
    }
}
