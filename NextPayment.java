/* Assignment 2.20 */
import java.util.Scanner;

public class NextPayment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter balance and interest rate (e.g: 3 for 3%)");
        double balance = input.nextDouble();
        double interest = input.nextDouble();
        double nextInterest = balance * (interest / 1200);
        System.out.println("The interest is " + (Math.round(nextInterest 
                * 100000) / 100000.00));
    }
}
