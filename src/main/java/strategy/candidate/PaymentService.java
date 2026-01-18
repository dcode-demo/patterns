package strategy.candidate;// BEFORE: needs Strategy pattern (uses conditionals to pick behavior)

public class PaymentService {

    public void processPayment(String method, double amount) {
        switch (method) {
            case "CREDIT_CARD":
                processCreditCard(amount);
                break;
            case "PAYPAL":
                processPayPal(amount);
                break;
            case "BITCOIN":
                processBitcoin(amount);
                break;
            default:
                throw new IllegalArgumentException("Unknown payment method: " + method);
        }
    }

    private void processCreditCard(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        // Imagine complex logic here...
    }

    private void processPayPal(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        // Imagine API integration here...
    }

    private void processBitcoin(double amount) {
        System.out.println("Processing Bitcoin payment of $" + amount);
        // Blockchain logic, etc.
    }

    public static void main(String[] args) {
        PaymentService service = new PaymentService();
        service.processPayment("CREDIT_CARD", 100.0);
        service.processPayment("PAYPAL", 45.0);
        service.processPayment("BITCOIN", 0.005);
    }
}
