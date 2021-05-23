package shop.calculator;

import shop.Pizza;
import shop.interfaces.Topping;
import shop.ordersystem.Order;

import java.util.List;

public class SumCalculator {
    List<Order> orders;

    public SumCalculator( List<Order> orders) {
        this.orders = orders;
    }

    public double grandTotal(){
        double sum = 0;

        for (Order order: orders) {
            for (Pizza pizza : order.getItems()) {
                sum += pizza.getPrice();

                for (Topping topping : pizza.getToppings()) {
                    sum += topping.getPrice();
                }
            }
        }
        return sum;
    }

}
