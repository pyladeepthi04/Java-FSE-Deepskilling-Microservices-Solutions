import java.util.ArrayList;

public class InventoryManagement {

    // ArrayList to store products
    static ArrayList<Product> inventory = new ArrayList<>();

    // Add Product
    public static void addProduct(Product product) {
        inventory.add(product);
        System.out.println("Product Added Successfully.");
    }

    // Update Product
    public static void updateProduct(int id, int quantity, double price) {

        for (Product p : inventory) {

            if (p.getProductId() == id) {

                p.setQuantity(quantity);
                p.setPrice(price);

                System.out.println("Product Updated Successfully.");
                return;
            }
        }

        System.out.println("Product Not Found.");
    }

    // Delete Product
    public static void deleteProduct(int id) {

        Product removeProduct = null;

        for (Product p : inventory) {

            if (p.getProductId() == id) {

                removeProduct = p;
                break;
            }
        }

        if (removeProduct != null) {

            inventory.remove(removeProduct);
            System.out.println("Product Deleted Successfully.");

        } else {

            System.out.println("Product Not Found.");

        }
    }

    // Display Products
    public static void displayProducts() {

        System.out.println("\nInventory:");

        if (inventory.isEmpty()) {
            System.out.println("No Products Available.");
        } else {

            for (Product p : inventory) {
                System.out.println(p);
            }

        }
    }

    // Main Method
    public static void main(String[] args) {

        // Add Products
        addProduct(new Product(101, "Laptop", 10, 55000));
        addProduct(new Product(102, "Mouse", 50, 500));
        addProduct(new Product(103, "Keyboard", 30, 1200));

        // Display Products
        displayProducts();

        // Update Product
        updateProduct(102, 60, 550);

        // Display Updated Products
        displayProducts();

        // Delete Product
        deleteProduct(101);

        // Display Final Products
        displayProducts();
    }

    /*
     * ---------------------------------------------------------
     * ANALYSIS
     * ---------------------------------------------------------
     *
     * Time Complexity:
     *
     * 1. Add Product
     *    Time Complexity: O(1)
     *    Reason:
     *    ArrayList.add() inserts the product at the end of the list
     *    in constant time (average case).
     *
     * 2. Update Product
     *    Time Complexity: O(n)
     *    Reason:
     *    The program searches through the list to find the product
     *    before updating it.
     *
     * 3. Delete Product
     *    Time Complexity: O(n)
     *    Reason:
     *    The program searches for the product and removes it from
     *    the ArrayList, which may require shifting elements.
     *
     * Optimization:
     * Instead of using an ArrayList, a HashMap<Integer, Product>
     * can be used. This improves searching, updating, and deleting
     * operations to O(1) average time.
     *
     * Conclusion:
     * The Inventory Management System successfully performs
     * Add, Update, Delete, and Display operations.
     * For large datasets, HashMap is a more efficient choice.
     *
     * ---------------------------------------------------------
     */

}