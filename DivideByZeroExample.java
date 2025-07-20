
import java.util.Scanner;
public class DivideByZeroExample {

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the  number: ");
int number = sc.nextInt();

int n=0;
int result;

try {

result = number / n;
System.out.println("Result: "+ result);

}

catch (ArithmeticException e) {

System.out.println("Cannot divide by zero!");
System.out.println("Error: " + e.getMessage());


}
System.out.println("Program continues after try-catch block...");




}

}