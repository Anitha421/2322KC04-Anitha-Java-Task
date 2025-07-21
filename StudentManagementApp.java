import java.io.*;
import java.util.*;

public class StudentManagementApp {

    private ArrayList<String> studentNames;
    private HashMap<Integer, ArrayList<String>> studentCourses;
    private int nextId;

    public StudentManagementApp() {
        studentNames = new ArrayList<>();
        studentCourses = new HashMap<>();
        nextId = 1; 
    }

    
    public void addStudent(String name) {
        if (studentNames.contains(name)) {
            System.out.println("Student already exists.");
            return;
        }
        studentNames.add(name);
        studentCourses.put(nextId, new ArrayList<>());
        System.out.println("Student added: ID = " + nextId + ", Name = " + name);
        nextId++;
    }

  
    public void addCourse(int id, String course) {
        if (studentCourses.containsKey(id)) {
            ArrayList<String> courses = studentCourses.get(id);
            if (!courses.contains(course)) {
                courses.add(course);
                System.out.println("Course " + course + " added for Student ID " + id);
            } else {
                System.out.println("Student already enrolled in this course.");
            }
        } else {
            System.out.println("Invalid Student ID.");
        }
    }

    
    public void searchStudent(String name) {
        if (studentNames.contains(name)) {
            System.out.println("Student found: " + name);
            for (Map.Entry<Integer, ArrayList<String>> entry : studentCourses.entrySet()) {
                if (studentNames.get(entry.getKey() - 1).equals(name)) {
                    System.out.println("Student ID: " + entry.getKey() + ", Courses: " + entry.getValue());
                }
            }
        } else {
            System.out.println("Student not found.");
        }
    }

    
    public void deleteStudent(int id) {
        if (studentCourses.containsKey(id)) {
            String name = studentNames.get(id - 1);
            studentCourses.remove(id);
            studentNames.set(id - 1, "[REMOVED]");
            System.out.println("Deleted student ID " + id + ", Name: " + name);
        } else {
            System.out.println("Student ID not found.");
        }
    }

   
    public void deleteCourse(int id, String course) {
        if (studentCourses.containsKey(id)) {
            ArrayList<String> courses = studentCourses.get(id);
            if (courses.contains(course)) {
                courses.remove(course);
                System.out.println("Course " + course + " removed from Student ID " + id);
            } else {
                System.out.println("Course not found for this student.");
            }
        } else {
            System.out.println("Student ID not found.");
        }
    }

   
    public void displayAll() {
        System.out.println("\n--- Students and Courses ---");
        for (Map.Entry<Integer, ArrayList<String>> entry : studentCourses.entrySet()) {
            int id = entry.getKey();
            String name = studentNames.get(id - 1);
            if (!name.equals("[REMOVED]")) {
                System.out.println("ID: " + id + ", Name: " + name + ", Courses: " + entry.getValue());
            }
        }
    }

   
    public void saveToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("students_courses.txt"))) {
            for (Map.Entry<Integer, ArrayList<String>> entry : studentCourses.entrySet()) {
                int id = entry.getKey();
                String name = studentNames.get(id - 1);
                if (!name.equals("[REMOVED]")) {
                    writer.write("ID: " + id + ", Name: " + name + ", Courses: " + entry.getValue());
                    writer.newLine();
                }
            }
            System.out.println("Student courses saved to students_courses.txt");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        StudentManagementApp app = new StudentManagementApp();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Delete Course");
            System.out.println("6. Display All");
            System.out.println("7. Save to File");
            System.out.println("8. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            String name, course;
            int id;

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    name = scanner.nextLine();
                    app.addStudent(name);
                    break;
                case 2:
                    System.out.print("Enter student ID: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter course: ");
                    course = scanner.nextLine();
                    app.addCourse(id, course);
                    break;
                case 3:
                    System.out.print("Enter student name to search: ");
                    name = scanner.nextLine();
                    app.searchStudent(name);
                    break;
                case 4:
                    System.out.print("Enter student ID to delete: ");
                    id = scanner.nextInt();
                    app.deleteStudent(id);
                    break;
                case 5:
                    System.out.print("Enter student ID: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter course to remove: ");
                    course = scanner.nextLine();
                    app.deleteCourse(id, course);
                    break;
                case 6:
                    app.displayAll();
                    break;
                case 7:
                    app.saveToFile();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
