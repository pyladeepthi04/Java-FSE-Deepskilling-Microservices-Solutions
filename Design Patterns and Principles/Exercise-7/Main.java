public class Main {

    public static void main(String[] args) {

        Stock stock = new Stock("TCS", 3500);

        Observer investor1 = new MobileApp("Deepthi");
        Observer investor2 = new WebApp("Uday");

        stock.registerObserver(investor1);
        stock.registerObserver(investor2);

        System.out.println("Stock price changed to ₹3600");

        stock.setPrice(3600);

        System.out.println();

        System.out.println("Removing Uday from notification list...");

        stock.removeObserver(investor2);

        System.out.println();

        System.out.println("Stock price changed to ₹3700");

        stock.setPrice(3700);

    }

}