public class StudentManagement {


 static class Student {

  private int studentId;
private String name;
private int[] marks = new int[3];
private int total;
private float average;

public Student(int studentId, String name) {


this.studentId = studentId;
this.name = name;

}

public void assignMarks(int m1, int m2, int m3) {


marks[0] = m1;
marks[1] = m2;
marks[2] = m3;
total = m1 + m2 + m3;
average = total / 3.0f;

}

public void displayResult(){

System.out.println("Student ID:" + studentId);
System.out.println("Name :" + name);
System.out.println("Marks :" + marks[0] + ", " + marks[1] +", " + marks[2]);
System.out.println("Total :" + total);
System.out.println("Average :" + average);
System.out.println("Result :" + (average >= 35 ?"PASS" : "FAIL"));

}

}

public static void main(String[] args){


Student s1 = new Student(101, "Anitha");
Student s2 = new Student(102, "Bharathi");


s1.assignMarks(80, 75, 90);
s2.assignMarks(30, 40, 20);


s1.displayResult();
s1.displayResult();

}


}