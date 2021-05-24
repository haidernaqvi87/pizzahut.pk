package shop.items.pizza.toppings;

import shop.items.pizza.Topping;

public class Sausage implements Topping {
    private String name = "Sausage";
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
