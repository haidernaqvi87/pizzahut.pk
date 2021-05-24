package shop.ordersystem;


public class CartOutputter {
    Cart cart;

    public CartOutputter(Cart cart){
        this.cart = cart;
    }

    public void displayText(){
        int orderNo = 1;
        for (Order order: cart.getOrders()) {
            System.out.println("*******");
            System.out.println("Order#"+orderNo);
            System.out.println("*******");
            OrderOutputter orderOutputter = new OrderOutputter(order);
            orderOutputter.displayText();
            orderNo++;
        }


    }
}
