import java.util.Scanner;

class Student {
    int id;
    String name;
    double marks;

    // Constructor
    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Display student details
    void display() {
        System.out.println("\n----- Student Details -----");
        System.out.println("Student ID   : " + id);
        System.out.println("Student Name : " + name);
        System.out.println("Marks        : " + marks);
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student student = null;
        int choice;

        do {
            System.out.println("\n====== STUDENT MANAGEMENT SYSTEM ======");
            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Update Marks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sc.nextLine(); // Consume newline

                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    student = new Student(id, name, marks);

                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    if (student != null) {
                        student.display();
                    } else {
                        System.out.println("No student record found!");
                    }
                    break;

                case 3:
                    if (student != null) {
                        System.out.print("Enter New Marks: ");
                        student.marks = sc.nextDouble();
                        System.out.println("Marks updated successfully!");
                    } else {
                        System.out.println("No student record found!");
                    }
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
