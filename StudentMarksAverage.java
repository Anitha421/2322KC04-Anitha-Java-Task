import java.util.HashMap;
import java.util.Map;

public class StudentMarksAverage {
    public static void main(String[] args) {
        
        HashMap<String, Integer> studentMarks = new HashMap<>();

       
        studentMarks.put("John", 78);
        studentMarks.put("Alice", 85);
        studentMarks.put("Bob", 66);
        studentMarks.put("Mary", 92);

     
        System.out.println("Student Marks:");
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        
        int total = 0;
        for (int marks : studentMarks.values()) {
            total += marks;
        }

        double average = (double) total / studentMarks.size();

        System.out.println("\nAverage Marks: " + average);
    }
}
