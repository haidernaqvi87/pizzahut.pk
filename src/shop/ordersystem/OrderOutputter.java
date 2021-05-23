package shop.ordersystem;

import shop.Pizza;
import shop.interfaces.Topping;

public class OrderOutputter {
    Order order;

    public OrderOutputter(Order order){
        this.order = order;
    }

    public void displayText(){
        for (Pizza item: order.getItems()) {
            System.out.println(""+item.getName()+ ":" +item.getPrice() );

            for (Topping topping: item.getToppings()) {
                System.out.println(""+topping.getName()+ ":" +topping.getPrice() );
            }
        }

    }
}
