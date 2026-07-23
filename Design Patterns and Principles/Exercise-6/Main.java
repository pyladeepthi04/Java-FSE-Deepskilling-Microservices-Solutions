public class Main {

    public static void main(String[] args) {

        Image image = new ProxyImage("Nature.jpg");

        System.out.println("Image object created.");
        System.out.println();

        System.out.println("First Display:");
        image.display();

        System.out.println();

        System.out.println("Second Display:");
        image.display();

    }

}