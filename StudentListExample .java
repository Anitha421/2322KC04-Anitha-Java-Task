import java.util.ArrayList;
import java.util.Iterator;

class Student {
    int id;
    String name;
    int age;

    
    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age;
    }
}

public class StudentListExample {
    public static void main(String[] args) {
        
        ArrayList<Student> studentList = new ArrayList<>();

        
        studentList.add(new Student(101, "John", 20));
        studentList.add(new Student(102, "Alice", 21));
        studentList.add(new Student(103, "Bob", 22));

        
        Iterator<Student> iterator = studentList.iterator();

        System.out.println("Student Details:");
        while (iterator.hasNext()) {
            Student s = iterator.next();
            System.out.println(s);
        }
    }
}
