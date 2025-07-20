public class Overloading {


double num1,num2,sum;



public void  sum(int a, int b){
num1 = a;
num2 = b;
sum = a + b;

System.out.println("Input Integers:"+ a + "and " + b);

System.out.println("Sum of integer numbers:"+sum);

}

public void sum(double a, double b){

num1 = a;
num2 = b;
sum = a + b;

System.out.println("Input Doubles:"+ a + "and " + b);

System.out.println("Sum of Double  numbers:"+sum);

}



public static void main(String[] args){

Overloading obj = new Overloading();
obj.sum(10,20);
obj.sum(5.5,3.3);
}

}


