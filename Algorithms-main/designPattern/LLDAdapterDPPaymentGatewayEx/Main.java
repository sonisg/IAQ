package LLDAdapterDPPaymentGatewayEx;

// Target Interface for Payment Gateway
interface PaymentGateway {
    void processPayment(double amount, String currency);
    void refundPayment(String transactionId);
}

// Adaptee Interface for PayPal
interface PayPalPaymentGateway {
    void makePayment(double amount, String currency);
    void refundTransaction(String transactionId);
}

// Adapter for PayPal
class PayPalAdapter implements PaymentGateway {
    private PayPalPaymentGateway paypalGateway;

    public PayPalAdapter(PayPalPaymentGateway paypalGateway) {
        this.paypalGateway = paypalGateway;
    }

    public void processPayment(double amount, String currency) {
        paypalGateway.makePayment(amount, currency);
    }

    public void refundPayment(String transactionId) {
        paypalGateway.refundTransaction(transactionId);
    }
}

// Adaptee Interface for Stripe
interface StripePaymentGateway {
    void charge(double amount, String currency);
    void refund(String chargeId);
}

// Adapter for Stripe
class StripeAdapter implements PaymentGateway {
    private StripePaymentGateway stripeGateway;

    public StripeAdapter(StripePaymentGateway stripeGateway) {
        this.stripeGateway = stripeGateway;
    }

    public void processPayment(double amount, String currency) {
        stripeGateway.charge(amount, currency);
    }

    public void refundPayment(String chargeId) {
        stripeGateway.refund(chargeId);
    }
}

// E-commerce platform
class ECommercePlatform {
    private PaymentGateway paymentGateway;

    public ECommercePlatform(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void purchase(double amount, String currency) {
        System.out.println("Processing payment...");
        paymentGateway.processPayment(amount, currency);
        System.out.println("Payment processed successfully.");
    }

    public void refund(String transactionId) {
        System.out.println("Processing refund...");
        paymentGateway.refundPayment(transactionId);
        System.out.println("Refund processed successfully.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Using PayPal
        PayPalPaymentGateway paypalGateway = new PayPalPaymentGatewayImpl();
        PaymentGateway paypalAdapter = new PayPalAdapter(paypalGateway);

        ECommercePlatform platform = new ECommercePlatform(paypalAdapter);
        platform.purchase(100.0, "USD");
        platform.refund("PAYPAL123");

        // Using Stripe
        StripePaymentGateway stripeGateway = new StripePaymentGatewayImpl();
        PaymentGateway stripeAdapter = new StripeAdapter(stripeGateway);

        platform = new ECommercePlatform(stripeAdapter);
        platform.purchase(150.0, "EUR");
        platform.refund("STRIPE456");
    }
}

// Concrete implementation of PayPalPaymentGateway
class PayPalPaymentGatewayImpl implements PayPalPaymentGateway {
    public void makePayment(double amount, String currency) {
        System.out.println("Processing PayPal payment of " + amount + " " + currency);
    }

    public void refundTransaction(String transactionId) {
        System.out.println("Refunding PayPal transaction with ID: " + transactionId);
    }
}

// Concrete implementation of StripePaymentGateway
class StripePaymentGatewayImpl implements StripePaymentGateway {
    public void charge(double amount, String currency) {
        System.out.println("Processing Stripe charge of " + amount + " " + currency);
    }

    public void refund(String chargeId) {
        System.out.println("Refunding Stripe charge with ID: " + chargeId);
    }
}
