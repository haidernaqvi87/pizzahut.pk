package shop;
import shop.interfaces.Topping;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected String name;
    protected double price;
    protected List<Topping> toppings = new ArrayList<Topping>();

    public abstract void makePizza();

    public void addTopping(Topping top) {
        toppings.add(top);
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public int getToppingsCount() {
        return toppings.size();
    }
}
