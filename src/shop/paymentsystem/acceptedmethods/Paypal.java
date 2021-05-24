package shop.paymentsystem.acceptedmethods;

import shop.paymentsystem.Payable;
import shop.paymentsystem.PaymentResponse;

public class Paypal implements Payable {
    @Override
    public PaymentResponse pay(double amount) {
        //Logic goes here to connect to Paypal System
        return new PaymentResponse(true,233123, "Paid "+amount+ " via Paypal");
    }
}
