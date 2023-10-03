import java.io.*;
import java.util.ArrayList;
import java.util.List;

class StudentManagementSystem {
    private List<Student> students;
    private String dataFile = "students.txt"; 

    public StudentManagementSystem() {
        this.students = new ArrayList<>();
        loadStudentsFromFile();
    }

    public void addStudent(Student student) {
        students.add(student);
        saveStudentsToFile(); 
    }

    public void removeStudent(int rollNumber) {
        students.removeIf(student -> student.getRollNumber() == rollNumber);
        saveStudentsToFile(); 
    }

    public Student searchStudent(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null;
    }

    public List<Student>getAllStudents() {
        return students;
    }
    private void loadStudentsFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(dataFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String name = parts[0];
                    int rollNumber = Integer.parseInt(parts[1]);
                    String grade = parts[2];
                    Student student = new Student(name, rollNumber, grade);
                    students.add(student);
                }
            }
        } catch (IOException e) {
            System.err.println("Error loading student data from the file: " + e.getMessage());
        }
    }

    private void saveStudentsToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(dataFile))) {
            for (Student student : students) {
                String line = student.getName() + "," + student.getRollNumber() + "," + student.getGrade();
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error saving student data to the file: " + e.getMessage());
        }
    }
}
