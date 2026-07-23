public class Main {

    public static void main(String[] args) {

        PaymentProcessor paypal =
                new PayPalAdapter(new PayPalGateway());

        PaymentProcessor stripe =
                new StripeAdapter(new StripeGateway());

        System.out.println("Using PayPal");

        paypal.processPayment(2500);

        System.out.println();

        System.out.println("Using Stripe");

        stripe.processPayment(5000);

    }

}