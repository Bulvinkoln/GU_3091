package src.main.java;

import java.util.List;

public class VendingMachine {private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public Chocolate getChocolate(String name, double calory){
        for (Product product: products) {
            if (product instanceof Chocolate){
                Chocolate chocolate = (Chocolate) product;
                if (chocolate.getName().equals(name) && chocolate.getCalory() == calory){
                    return chocolate;
                }
            }
        }
        return null;
    }

}
