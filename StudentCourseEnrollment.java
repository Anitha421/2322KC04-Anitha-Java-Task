import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentCourseEnrollment {
    private ArrayList<String> studentList;
    private HashMap<String, ArrayList<String>> studentCourses;

    public StudentCourseEnrollment() {
        studentList = new ArrayList<>();
        studentCourses = new HashMap<>();
    }

    
    public void addStudent(String name) {
        if (!studentList.contains(name)) {
            studentList.add(name);
            studentCourses.put(name, new ArrayList<>());
            System.out.println("Student added: " + name);
        } else {
            System.out.println("Student already exists.");
        }
    }

   
    public void removeStudent(String name) {
        if (studentList.contains(name)) {
            studentList.remove(name);
            studentCourses.remove(name);
            System.out.println("Student removed: " + name);
        } else {
            System.out.println("Student not found.");
        }
    }

   
    public void enrollCourse(String name, String course) {
        if (studentList.contains(name)) {
            ArrayList<String> courses = studentCourses.get(name);
            if (!courses.contains(course)) {
                courses.add(course);
                System.out.println("Course " + course + " added for student " + name);
            } else {
                System.out.println("Student already enrolled in this course.");
            }
        } else {
            System.out.println("Student not found.");
        }
    }

   
    public void removeCourse(String name, String course) {
        if (studentList.contains(name)) {
            ArrayList<String> courses = studentCourses.get(name);
            if (courses.contains(course)) {
                courses.remove(course);
                System.out.println("Course " + course + " removed for student " + name);
            } else {
                System.out.println("Student not enrolled in this course.");
            }
        } else {
            System.out.println("Student not found.");
        }
    }

    
    public void displayAll() {
        System.out.println("\n--- Student Course Enrollment ---");
        Iterator<String> studentIterator = studentList.iterator();

        while (studentIterator.hasNext()) {
            String student = studentIterator.next();
            System.out.print("Student: " + student + " | Courses: ");

            ArrayList<String> courses = studentCourses.get(student);
            Iterator<String> courseIterator = courses.iterator();

            while (courseIterator.hasNext()) {
                System.out.print(courseIterator.next());
                if (courseIterator.hasNext()) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        StudentCourseEnrollment system = new StudentCourseEnrollment();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Enroll Course");
            System.out.println("4. Remove Course");
            System.out.println("5. Display All");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            String name, course;

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    name = scanner.nextLine();
                    system.addStudent(name);
                    break;
                case 2:
                    System.out.print("Enter student name: ");
                    name = scanner.nextLine();
                    system.removeStudent(name);
                    break;
                case 3:
                    System.out.print("Enter student name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter course to enroll: ");
                    course = scanner.nextLine();
                    system.enrollCourse(name, course);
                    break;
                case 4:
                    System.out.print("Enter student name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter course to remove: ");
                    course = scanner.nextLine();
                    system.removeCourse(name, course);
                    break;
                case 5:
                    system.displayAll();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
