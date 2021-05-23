package shop.ordersystem;

import shop.calculator.SumCalculator;

public class CartOutputter {
    Cart cart;
    SumCalculator sumCalculator;

    public CartOutputter(Cart cart){
        this.cart = cart;
        sumCalculator = new SumCalculator(cart.getOrders());
    }

    public void displayText(){
        for (Order order: cart.getOrders()) {
            OrderOutputter orderOutputter = new OrderOutputter(order);
            orderOutputter.displayText();
        }

        System.out.println("Total: "+sumCalculator.grandTotal());
    }
}
