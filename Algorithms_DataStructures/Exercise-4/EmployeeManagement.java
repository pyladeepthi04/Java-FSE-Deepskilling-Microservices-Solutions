public class EmployeeManagement {

    static Employee[] employees = new Employee[10];
    static int count = 0;

    // Add Employee
    public static void addEmployee(Employee employee) {

        if (count < employees.length) {

            employees[count] = employee;
            count++;

            System.out.println("Employee Added Successfully.");

        } else {

            System.out.println("Employee Array is Full.");

        }

    }

    // Search Employee
    public static void searchEmployee(int id) {

        for (int i = 0; i < count; i++) {

            if (employees[i].getEmployeeId() == id) {

                System.out.println("\nEmployee Found:");
                System.out.println(employees[i]);
                return;

            }

        }

        System.out.println("Employee Not Found.");

    }

    // Traverse Employees
    public static void traverseEmployees() {

        System.out.println("\nEmployee Records:");

        for (int i = 0; i < count; i++) {

            System.out.println(employees[i]);

        }

    }

    // Delete Employee
    public static void deleteEmployee(int id) {

        for (int i = 0; i < count; i++) {

            if (employees[i].getEmployeeId() == id) {

                for (int j = i; j < count - 1; j++) {

                    employees[j] = employees[j + 1];

                }

                employees[count - 1] = null;
                count--;

                System.out.println("Employee Deleted Successfully.");
                return;

            }

        }

        System.out.println("Employee Not Found.");

    }

    public static void main(String[] args) {

        addEmployee(new Employee(101, "Deepthi", "Developer", 50000));
        addEmployee(new Employee(102, "Uday", "Tester", 40000));
        addEmployee(new Employee(103, "Ram", "Manager", 70000));

        traverseEmployees();

        searchEmployee(102);

        deleteEmployee(101);

        traverseEmployees();

        /*
        =========================================

        ANALYSIS

        Add Employee
        Time Complexity : O(1)

        Search Employee
        Time Complexity : O(n)

        Traverse Employees
        Time Complexity : O(n)

        Delete Employee
        Time Complexity : O(n)

        Advantages of Arrays

        Fast access using index.
        Easy to implement.
        Less memory overhead.

        Limitations of Arrays

        Fixed size.
        Insertion and deletion are slow.
        Memory may be wasted if array is not full.

        When to Use Arrays

        Arrays are suitable when
        the number of records is fixed
        and fast index-based access is required.

        =========================================
        */

    }
}