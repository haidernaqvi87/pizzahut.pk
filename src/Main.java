import shop.Pizza;
import shop.factory.AbstractFactory;
import shop.factory.PizzaFactoryProducer;
import shop.ordersystem.Cart;
import shop.ordersystem.CartOutputter;
import shop.ordersystem.Order;
import shop.toppings.Ketchup;
import shop.toppings.Sausage;

public class Main {

    public static void main(String args[]) {

        /*
        ### ORDER ###
        I want one Square shaped Fajita with Ketchup and Sausage and one Square shaped Tikka with only Ketchup
         */

        //get pizza factory
        AbstractFactory shapeFactory = PizzaFactoryProducer.getFactory("Square");// we get RoundedPizzaFactory

        //First Pizza
        Pizza pizza1 = shapeFactory.getPizza("Fajita");// we get SquareFajita
        //Lets add toppings
        pizza1.addTopping(new Ketchup());
        pizza1.addTopping(new Sausage());

        //Second Pizza
        Pizza pizza2 = shapeFactory.getPizza("Tikka");// we get SquareFajita
        //Lets add toppings
        pizza2.addTopping(new Ketchup());


        //Add pizzas in single order
        Order order1 = new Order();
        order1.addItem(pizza1);
        order1.addItem(pizza2);

        Order order2 = new Order();
        order2.addItem(pizza2);

        //Add orders to Cart
        Cart cart = new Cart();
        cart.addOrder(order1);
        cart.addOrder(order2);

        CartOutputter cartOutputter = new CartOutputter(cart);
        cartOutputter.displayText();

    }

}