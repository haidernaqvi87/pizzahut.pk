package shop.paymentsystem.acceptedmethods;

import shop.paymentsystem.Payable;
import shop.paymentsystem.PaymentResponse;

public class CreditCard implements Payable {
    @Override
    public PaymentResponse pay(double amount) {
        //Logic goes here to connect to Credit card System
        return new PaymentResponse(true,233123, "Paid "+amount+ " via Credit Card");
    }
}
