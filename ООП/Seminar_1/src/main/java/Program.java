package src.main.java;

import src.main.java.Product;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        Product product1 = new Product();
        product1.name = "Продукт 1";
        product1.brand = "Производитель 1";
        product1.price = 200;
        System.out.println(product1.displayInfo());

        Product product2 = new Product();
        System.out.println(product2.displayInfo());

        Product bottleOfWater = new BottleOfWater("ООО Святой источник", "Бутылка с водой", 150, 1.5);
        System.out.println(bottleOfWater.displayInfo());

        Product bottleOfMilk = new BottleOfMilk("ООО МОЛОКО", "Бутылка с молоком", 150, 1.5, 0);
        System.out.println(bottleOfMilk.displayInfo());

        Product chocolate = new Chocolate("Аленка", "Шоколад", 200, 395);
        System.out.println(chocolate.displayInfo());

        ArrayList<Product> products = new ArrayList<>();
        products.add(bottleOfWater);
        products.add(bottleOfMilk);
        products.add(chocolate);


        VendingMachine vendingMachine = new VendingMachine(products);
        Chocolate chocolate1 = vendingMachine.getChocolate("Шоколад", 395);
        if (chocolate1 == null){
            System.out.println("Такого продукта не в автомате");
        }
        else {
            System.out.println("Вы купили:");
            System.out.println(chocolate1.displayInfo());
        }
    }
}
