package shop.calculator;

import shop.items.Item;
import shop.items.pizza.Pizza;
import shop.items.pizza.Topping;
import shop.ordersystem.Cart;
import shop.ordersystem.Order;

import java.util.List;

public class SumCalculator {

    public SumCalculator() {}

    public double grandTotal(Cart cart) {
        double sum = 0;
        for (Order order: cart.getOrders()) {
            sum += getSum(order.getItems());
        }
        return sum;
    }

    public double orderTotal(Order order) {
        double sum = getSum(order.getItems());
        return sum;
    }

    private double getSum(List<Item> items) {
        double sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
            //If itz a pizza and has toppings
            if (item instanceof Pizza) {
                Pizza pizza = (Pizza) item;
                for (Topping topping : pizza.getToppings()) {
                    sum += topping.getPrice();
                }
            }
        }

        return sum;
    }

}
