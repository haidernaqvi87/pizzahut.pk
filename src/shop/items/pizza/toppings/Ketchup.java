package shop.items.pizza.toppings;
import shop.items.pizza.Topping;

public class Ketchup implements Topping {
    private String name = "Ketchup";
    private double price = 20.0;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
