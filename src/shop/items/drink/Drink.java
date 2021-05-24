package shop.items.drink;

import shop.items.Item;

public abstract class Drink implements Item {
    protected String name;
    protected String type;
    protected double price;

    public double getPrice() {
        return price;
    }

    public String getName() {
        return type+ " of "+ name;
    }
}
