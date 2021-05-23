package shop.ordersystem;

import shop.Pizza;
import java.util.ArrayList;
import java.util.List;

public class Order {
    List<Pizza> items;

    public Order() {
        items = new ArrayList<Pizza>();
    }

    public void addItem(Pizza pizza) {
        items.add(pizza);
    }

    public List<Pizza> getItems(){
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
