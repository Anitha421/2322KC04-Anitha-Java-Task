import java.util.Scanner;

public class MenuDriven {

public static void main(String[] args){

Scanner sc=new Scanner(System.in);

System.out.print("Enter a number: "); 

int a=sc.nextInt();

System.out.print("Enter a number:"); 

int b = sc.nextInt();

System.out.print("Enter choice:"); 

int ch = sc.nextInt(); 

int result; 

switch(ch)
{
case 1:

result = a+b; 

System.out.print("Addition:" +result); 

break;

case 2:

result = a-b; 

System.out.print("Subtraction:" +result); 

break;

case 3:

result = a*b; 

System.out.print("Multiplication:" +result); 

break;

case 4:

result = a / b;

System.out.print("Division:" +result); 

break;

default: System.out.print("Invalid"); 

break;

}

}

}
