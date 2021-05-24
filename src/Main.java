import shop.calculator.SumCalculator;
import shop.items.drink.Drink;
import shop.items.drink.Pepsi;
import shop.items.pizza.Pizza;
import shop.factory.AbstractFactory;
import shop.factory.PizzaFactoryProducer;
import shop.ordersystem.Cart;
import shop.ordersystem.CartOutputter;
import shop.ordersystem.Order;
import shop.items.pizza.toppings.Ketchup;
import shop.items.pizza.toppings.Sausage;
import shop.paymentsystem.Payable;
import shop.paymentsystem.PaymentProcessor;
import shop.paymentsystem.PaymentResponse;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String args[]) {

        /*
        ### ORDER ###
        I want one Square shaped Fajita with Ketchup and Sausage and one Square shaped Tikka with only Ketchup
         */
        String[] pizzaShapes = {"Rounded", "Square", "Triangle"};
        String[] acceptedPayments = {"paypal", "creditcard", "sofort"};

        //get pizza factory
        try {
            int pizzaShapeIndex1 = ThreadLocalRandom.current().nextInt(0, 2 + 1);
            int pizzaShapesIndex2 = ThreadLocalRandom.current().nextInt(0, 2 + 1);
            AbstractFactory shapeFactory1 = PizzaFactoryProducer.getFactory(pizzaShapes[pizzaShapeIndex1]);
            AbstractFactory shapeFactory2 = PizzaFactoryProducer.getFactory(pizzaShapes[pizzaShapesIndex2]);

            //First Pizza
            Pizza pizza1 = shapeFactory1.getPizza("Fajita");// we get SquareFajita
            //Lets add toppings
            pizza1.addTopping(new Ketchup());
            pizza1.addTopping(new Sausage());

            //Second Pizza
            Pizza pizza2 = shapeFactory2.getPizza("Tikka");// we get SquareFajita
            //Lets add toppings
            pizza2.addTopping(new Ketchup());


            //First Order
            Order order1 = new Order();
            order1.addItem(pizza1);
            order1.addItem(pizza2);

            //Second Order
            Order order2 = new Order();
            order2.addItem(pizza2);

            //Oh I forgot to add a drink. Please add Pepsi to Order# 1
            Drink pepsi = new Pepsi("Cane");
            order1.addItem(pepsi);

            //Add orders to Cart
            Cart cart = new Cart();
            cart.addOrder(order1);
            cart.addOrder(order2);

            CartOutputter cartOutputter = new CartOutputter(cart);
            cartOutputter.displayText();

            //Get the Grand Total
            SumCalculator sumCalculator = new SumCalculator();
            double grandTotal = sumCalculator.grandTotal(cart);
            System.out.println("Grand Total:: "+grandTotal);

            //Please pay

                //just to play around with random accepted payment methods
                int paymentIndex = ThreadLocalRandom.current().nextInt(0, 2 + 1);

                //get the specific payment processor
                Payable processPayment = PaymentProcessor.getPaymentProcessor(acceptedPayments[paymentIndex]);
                //lets try to make a payment
                PaymentResponse response = processPayment.pay(grandTotal);
                //see the response
                if (response.getPaymentAccepted()) {//payment successfull
                    System.out.println("Message:: " + response.getMessage());
                    System.out.println("Greetings:: Enjoy your meal!" );
                } else {//something went wrong
                    System.out.println("Error:: " + response.getMessage());
                }
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }


    }

}