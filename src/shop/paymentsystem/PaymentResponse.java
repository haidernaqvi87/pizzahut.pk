package shop.paymentsystem;

public class PaymentResponse {
    int transactionId;
    String message;
    boolean paymentAccepted;

    public PaymentResponse(boolean paymentAccepted, int transactionId, String message){
        this.paymentAccepted = paymentAccepted;
        this.transactionId = transactionId;
        this.message = message;
    }

    public boolean getPaymentAccepted() {
        return paymentAccepted;
    }

    public int getTransactionId() {
        return transactionId;
    }


    public String getMessage() {
        return message;
    }

}
