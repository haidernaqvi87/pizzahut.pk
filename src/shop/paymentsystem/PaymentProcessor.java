package shop.paymentsystem;

import shop.paymentsystem.acceptedmethods.CreditCard;
import shop.paymentsystem.acceptedmethods.Paypal;
import shop.paymentsystem.acceptedmethods.Sofort;

public class PaymentProcessor {

    public static Payable getPaymentProcessor(String paymentType) {

        switch (paymentType){
            case "paypal":
                return new Paypal();
            case "creditcard":
                return new CreditCard();
            case "sofort":
                return new Sofort();
            default:
                throw new IllegalStateException(
                        "We dont accept payment via "+paymentType);
        }

    }
}
