import java.util.Arrays;
import java.util.Comparator;

public class SearchFunction {

    // Linear Search
    public static Product linearSearch(Product[] products, String name) {

        for (Product product : products) {

            if (product.getProductName().equalsIgnoreCase(name)) {

                return product;

            }

        }

        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, String name) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            int compare = products[mid].getProductName()
                    .compareToIgnoreCase(name);

            if (compare == 0) {

                return products[mid];

            }

            if (compare < 0) {

                left = mid + 1;

            } else {

                right = mid - 1;

            }

        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Electronics"),
                new Product(103, "Keyboard", "Electronics"),
                new Product(104, "Mobile", "Electronics"),
                new Product(105, "Shoes", "Fashion")

        };

        System.out.println("------------ Linear Search ------------");

        Product result = linearSearch(products, "Keyboard");

        if (result != null) {

            System.out.println(result);

        } else {

            System.out.println("Product Not Found");

        }

        Arrays.sort(products, Comparator.comparing(Product::getProductName));

        System.out.println("\n------------ Binary Search ------------");

        result = binarySearch(products, "Keyboard");

        if (result != null) {

            System.out.println(result);

        } else {

            System.out.println("Product Not Found");

        }

        /*
        ==========================================
        ANALYSIS
        ==========================================

        Big O Notation:
        Big O notation is used to measure the efficiency
        of an algorithm as the input size increases.

        Linear Search
        Best Case    : O(1)
        Average Case : O(n)
        Worst Case   : O(n)

        Binary Search
        Best Case    : O(1)
        Average Case : O(log n)
        Worst Case   : O(log n)

        Comparison

        Linear Search
        - Works on unsorted data.
        - Suitable for small datasets.

        Binary Search
        - Requires sorted data.
        - Much faster for large datasets.

        Conclusion

        Binary Search is more suitable for
        large e-commerce platforms because
        it searches much faster than Linear Search.
        ==========================================
        */

    }

}