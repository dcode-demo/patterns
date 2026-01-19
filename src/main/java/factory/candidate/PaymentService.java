package factory.candidate;

public class PaymentService {

    public void pay(String paymentMethod, double amount) {
        PaymentProcessor processor;

        if (paymentMethod.equalsIgnoreCase("CREDIT_CARD")) {
            processor = new CreditCardPaymentProcessor();
        } else if (paymentMethod.equalsIgnoreCase("PAYPAL")) {
            processor = new PayPalPaymentProcessor();
        } else if (paymentMethod.equalsIgnoreCase("BANK_TRANSFER")) {
            processor = new BankTransferPaymentProcessor();
        } else {
            throw new IllegalArgumentException("Unsupported payment method");
        }

        processor.processPayment(amount);
    }


    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        paymentService.pay("CREDIT_CARD", 100.0);
        paymentService.pay("PAYPAL", 250.0);
    }

}
