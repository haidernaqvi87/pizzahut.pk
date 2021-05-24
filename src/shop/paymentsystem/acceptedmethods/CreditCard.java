package shop.paymentsystem.acceptedmethods;

import shop.paymentsystem.Payable;
import shop.paymentsystem.PaymentResponse;

public class CreditCard implements Payable {
    @Override
    public PaymentResponse pay(double amount) {
        //Logic goes here to connect to Credit card System (Microservice)

        //Finally handle the success response and send it back according to your need
        return new PaymentResponse(true,233123, "Paid "+amount+ " via Credit Card");
    }
}
