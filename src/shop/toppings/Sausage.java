package shop.toppings;

import shop.interfaces.Topping;

public class Sausage implements Topping {
    private String name = "Ketchup";
    private double price = 30.0;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
