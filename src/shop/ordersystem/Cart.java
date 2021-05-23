package shop.ordersystem;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Order> orders;

    public Cart() {
        orders = new ArrayList<Order>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders(){
        return orders;
    }

    public Order getOrder(int orderId){
        return null;
    }

    public void removeOrder(int orderId) {
        //
    }

    public int getOrderCount() {
        return orders.size();
    }
}
