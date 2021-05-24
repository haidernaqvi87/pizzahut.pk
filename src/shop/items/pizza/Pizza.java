package shop.items.pizza;
import shop.items.Item;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza implements Item {
    protected String name;
    protected double price;
    protected List<Topping> toppings = new ArrayList<Topping>();

    public abstract void makePizza();

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }


    public void addTopping(Topping top) {
        toppings.add(top);
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public int getToppingsCount() {
        return toppings.size();
    }
}
