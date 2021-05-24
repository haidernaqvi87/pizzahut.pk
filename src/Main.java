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
        order 1
        I want one random shape Fajita with Ketchup and Sausage and one drink (cane of Pepsi)
        order 2
        one random shaped Tikka with only Ketchup

        I want to see the Order's summary and the Grand total
        I want to pay with a random available payment method.
         */
        String[] pizzaShapes = {"Rounded", "Square", "Triangle"};
        String[] acceptedPayments = {"paypal", "creditcard", "sofort"};

        //get pizza factory
        try {
            int pizzaShapeIndex1 = ThreadLocalRandom.current().nextInt(0, 2 + 1);
            int pizzaShapesIndex2 = ThreadLocalRandom.current().nextInt(0, 2 + 1);

            //Random Shape
            AbstractFactory shapeFactory1 = PizzaFactoryProducer.getFactory(pizzaShapes[pizzaShapeIndex1]);
            //Random Shape
            AbstractFactory shapeFactory2 = PizzaFactoryProducer.getFactory(pizzaShapes[pizzaShapesIndex2]);

            //First Pizza (Fajita) of random Shape
            Pizza pizza1 = shapeFactory1.getPizza("Fajita");
            //Lets add toppings
            pizza1.addTopping(new Ketchup());
            pizza1.addTopping(new Sausage());

            //Second Pizza (Tikka) of random Shape
            Pizza pizza2 = shapeFactory2.getPizza("Tikka");// we get SquareFajita
            //Lets add toppings
            pizza2.addTopping(new Ketchup());


            //Order#1
            Order order1 = new Order();
            order1.addItem(pizza1);//adding pizza1 to Order#1
            order1.addItem(pizza2);//adding pizza2 to Order#1

            //Order#2
            Order order2 = new Order();
            order2.addItem(pizza2);//adding pizza1 to Order#2

            //Oh I forgot to add a drink. Please add Pepsi to Order# 1
            Drink pepsi = new Pepsi("Cane");
            order1.addItem(pepsi);//adding Drink(Pepsi) to Order#1

            //Adding orders to Cart
            Cart cart = new Cart();
            cart.addOrder(order1);
            cart.addOrder(order2);

            //Orders summaries
            CartOutputter cartOutputter = new CartOutputter(cart);
            cartOutputter.displayText();

            //Get the Grand Total
            SumCalculator sumCalculator = new SumCalculator();
            double grandTotal = sumCalculator.grandTotal(cart);
            System.out.println("Grand Total:: Rs "+grandTotal);

                //Please pay
                //just to play around with random accepted payment methods
                int paymentIndex = ThreadLocalRandom.current().nextInt(0, 2 + 1);

                //get the random payment processor
                Payable processPayment = PaymentProcessor.getPaymentProcessor(acceptedPayments[paymentIndex]);
                //lets try to make a payment
                PaymentResponse response = processPayment.pay(grandTotal);
                //see the response
                if (response.getPaymentAccepted()) {//payment successfull
                    System.out.println("Message:: " + response.getMessage());
                    System.out.println("Order Reference number: " + response.getTransactionId());
                    System.out.println("Greetings:: Enjoy your meal!" );
                } else {//something went wrong
                    System.out.println("Error:: " + response.getMessage());
                }
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }


    }

}