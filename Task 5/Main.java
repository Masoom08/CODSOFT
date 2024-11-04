import java.util.*;
public class Main {
    public static void main () {
        StudentManagementSystem system = new StudentManagementSystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Edit Student Information");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter roll number: ");
                    int rollNumber = sc.nextInt();
                    sc.nextLine(); // Consume the newline character
                    System.out.print("Enter grade: ");
                    String grade = sc.nextLine();

                    Student student = new Student(name, rollNumber, grade);
                    system.addStudent(student);
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    System.out.print("Enter roll number to remove: ");
                    int rollToRemove = sc.nextInt();
                    system.removeStudent(rollToRemove);
                    System.out.println("Student removed successfully.");
                    break;

                case 3:
                    System.out.print("Enter roll number to search: ");
                    int rollToSearch = sc.nextInt();
                    Student foundStudent = system.searchStudent(rollToSearch);
                    if (foundStudent != null) {
                        System.out.println("Student found: " + foundStudent);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                final List<Student> allStudents = system.getAllStudents();
                    if (!allStudents.isEmpty()) {
                        System.out.println("All Students:");
                        for (Student s : allStudents) {
                            System.out.println(s);
                        }
                    } else {
                        System.out.println("No students in the system.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting the program.");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
                }
            }
        }
    }
