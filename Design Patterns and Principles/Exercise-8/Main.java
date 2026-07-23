public class Main {

    public static void main(String[] args) {

        PaymentContext context = new PaymentContext();

        System.out.println("Customer selects Credit Card");

        context.setPaymentStrategy(new CreditCardPayment());

        context.makePayment(2500);

        System.out.println();

        System.out.println("Customer selects PayPal");

        context.setPaymentStrategy(new PayPalPayment());

        context.makePayment(3500);

    }

}