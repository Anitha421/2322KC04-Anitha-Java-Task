import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double p = obj1.nextDouble();

        System.out.print("Enter the number of years: ");
        double n = obj1.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double r = obj1.nextDouble();

        if (p > 0 && n > 0 && r > 0) {
            double si = (p * n * r) / 100;
            System.out.println("Simple Interest: " + si);
        } else {
            System.out.println("Invalid input! Principal, rate, and time must be greater than zero.");
        }
    }
}
