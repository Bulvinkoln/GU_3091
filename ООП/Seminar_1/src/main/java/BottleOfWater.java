package src.main.java;

public class BottleOfWater extends Product{
    /***
     * объем бутылки
     */

    private double volume;

    public double getVolume() {
        return volume;
    }

    public BottleOfWater(String brand, String name, double price, double volume){
        super(brand, name, price);
        this.volume = volume;
    }

    public String displayInfo() {
        return String.format("[Бутылка с водой]\n%s - %s - %.2f;\n Объем: %.1f",
                brand,name,price,volume);
    }
}
