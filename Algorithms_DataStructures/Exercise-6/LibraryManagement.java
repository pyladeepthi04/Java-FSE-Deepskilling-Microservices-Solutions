import java.util.Arrays;
import java.util.Comparator;

public class LibraryManagement {

    // Linear Search
    public static Book linearSearch(Book[] books, String title) {

        for (Book book : books) {

            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }

        }

        return null;
    }

    // Binary Search
    public static Book binarySearch(Book[] books, String title) {

        int left = 0;
        int right = books.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            int compare = books[mid].getTitle().compareToIgnoreCase(title);

            if (compare == 0) {
                return books[mid];
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

        Book[] books = {

                new Book(101, "Java", "James Gosling"),
                new Book(102, "Python", "Guido van Rossum"),
                new Book(103, "Data Structures", "Mark Allen"),
                new Book(104, "Operating System", "Galvin"),
                new Book(105, "Computer Networks", "Andrew Tanenbaum")

        };

        System.out.println("===== Linear Search =====");

        Book result = linearSearch(books, "Python");

        if (result != null)
            System.out.println(result);
        else
            System.out.println("Book Not Found");

        Arrays.sort(books, Comparator.comparing(Book::getTitle));

        System.out.println("===== Binary Search =====");

        result = binarySearch(books, "Python");

        if (result != null)
            System.out.println(result);
        else
            System.out.println("Book Not Found");

        /*
       

        ANALYSIS

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

        Use Linear Search for small or
        unsorted collections.

        Use Binary Search when the
        collection is sorted and large.

        
        */

    }
}