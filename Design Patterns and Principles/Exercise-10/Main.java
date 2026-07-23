public class Main {

    public static void main(String[] args) {

        
        Student student = new Student("Deepthi", "23L31A0383", "A");

        
        StudentView view = new StudentView();

        
        StudentController controller =
                new StudentController(student, view);

        
        System.out.println("Initial Student Details");
        controller.updateView();

        System.out.println();

        
        controller.setStudentName("Uday");
        controller.setStudentGrade("A+");

        System.out.println("Updated Student Details");
        controller.updateView();

    }

}