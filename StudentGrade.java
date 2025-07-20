import java.util.Scanner;

public class StudentGrade {

 public static char CalculateGrade(float average){

 if(average >= 90 ){


return 'A';

}
else if(average >= 80) {


return 'B';
}
else if(average >= 70) {


return 'C';
}
else if(average >= 60) {


return 'D';
}
else {

return 'E';

}


}


public static void main(String[] args){



 Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of marks:");

int numSubjects = sc.nextInt();
int[] marks = new int[numSubjects];
int totalMarks = 0;

for(int i=0;i<numSubjects;i++){



System.out.print("Enter marks for subjects:" +(i+1) + ":");

marks[i] = sc.nextInt();
totalMarks += marks[i];


}
float average = (float) totalMarks/numSubjects;

char grade = CalculateGrade(average);

System.out.println("Total Marks:"+totalMarks);
System.out.println("Average Marks:" +average);
System.out.println("Grade:" +grade);
sc.close();

}

}