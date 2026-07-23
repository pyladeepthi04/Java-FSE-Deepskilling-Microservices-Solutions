public class TaskManagement {

    private Task head = null;

    // Add Task
    public void addTask(int id, String name, String status) {

        Task newTask = new Task(id, name, status);

        if (head == null) {

            head = newTask;

        } else {

            Task temp = head;

            while (temp.next != null) {

                temp = temp.next;

            }

            temp.next = newTask;

        }

        System.out.println("Task Added Successfully.");
    }

    // Search Task
    public void searchTask(int id) {

        Task temp = head;

        while (temp != null) {

            if (temp.taskId == id) {

                System.out.println("\nTask Found");
                System.out.println(temp);
                return;

            }

            temp = temp.next;

        }

        System.out.println("Task Not Found.");
    }

    // Traverse Tasks
    public void traverseTasks() {

        System.out.println("\nTask List");

        Task temp = head;

        while (temp != null) {

            System.out.println(temp);

            temp = temp.next;

        }

    }

    // Delete Task
    public void deleteTask(int id) {

        if (head == null) {

            System.out.println("Task List is Empty.");
            return;

        }

        if (head.taskId == id) {

            head = head.next;
            System.out.println("Task Deleted Successfully.");
            return;

        }

        Task current = head;
        Task previous = null;

        while (current != null && current.taskId != id) {

            previous = current;
            current = current.next;

        }

        if (current == null) {

            System.out.println("Task Not Found.");

        } else {

            previous.next = current.next;
            System.out.println("Task Deleted Successfully.");

        }

    }

    public static void main(String[] args) {

        TaskManagement tm = new TaskManagement();

        tm.addTask(101, "Design Database", "Pending");
        tm.addTask(102, "Develop Login", "In Progress");
        tm.addTask(103, "Testing", "Pending");

        tm.traverseTasks();

        tm.searchTask(102);

        tm.deleteTask(101);

        tm.traverseTasks();

        /*
       

        ANALYSIS

        Add Task
        Time Complexity : O(n)

        Search Task
        Time Complexity : O(n)

        Traverse Tasks
        Time Complexity : O(n)

        Delete Task
        Time Complexity : O(n)

        Advantages of Linked List

         Dynamic size.
         Easy insertion and deletion.
         No memory wastage.
         No shifting of elements.

        Linked List vs Array

        Array
        Fixed size.
        Fast index access.
        Slow insertion/deletion.

        Linked List
        Dynamic size.
        Efficient insertion/deletion.
        Sequential access only.

        Conclusion

        Linked Lists are better when
        frequent insertions and deletions
        are required.
        
        */

    }

}