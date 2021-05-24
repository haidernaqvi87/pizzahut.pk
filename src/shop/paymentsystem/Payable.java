package shop.paymentsystem;

public interface Payable {
    PaymentResponse pay(double amount);
}
