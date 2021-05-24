package shop.ordersystem;

import shop.items.Item;
import shop.items.pizza.Pizza;
import java.util.ArrayList;
import java.util.List;

public class Order {
    List<Item> items;

    public Order() {
        items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems(){
        return items;
    }

    public Pizza getItem(int itemId){
        return null;
    }

    public void removeItem(int itemId) {
        //
    }

    public int getItemsCount() {
        return items.size();
    }
}
