package shop.ordersystem;

import shop.calculator.SumCalculator;
import shop.items.Item;
import shop.items.pizza.Topping;
import shop.items.pizza.Pizza;

public class OrderOutputter {
    Order order;

    public OrderOutputter(Order order){
        this.order = order;
    }

    public void displayText(){
        for (Item item: order.getItems()) {
            System.out.println(""+item.getName()+ ":" +item.getPrice() );

            if (item instanceof Pizza) {
                Pizza pizza = (Pizza) item;
                for (Topping topping: pizza.getToppings()) {
                    System.out.println(""+topping.getName()+ ":" +topping.getPrice() );
                }
            }
        }
        SumCalculator sumCalculator = new SumCalculator();
        double sum = sumCalculator.orderTotal(order);

        System.out.println("----------------------------");
        System.out.println("|   Order Total: "+sum+"    |");
        System.out.println("----------------------------");
    }
}
