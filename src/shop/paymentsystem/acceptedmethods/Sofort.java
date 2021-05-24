package shop.paymentsystem.acceptedmethods;

import shop.paymentsystem.Payable;
import shop.paymentsystem.PaymentResponse;

public class Sofort implements Payable {
    @Override
    public PaymentResponse pay(double amount) {
        //Logic goes here to connect to Sofort System
        return new PaymentResponse(false,0, "sofort link is down at the moment." +
                " Please try again later");
        //return new PaymentResponse(true,233123, "Paid "+amount+ " via Sofort");
    }
}
