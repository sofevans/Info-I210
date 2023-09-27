/* Assignment 2.23 */
import java.util.Scanner;
public class Driving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the driving distance as a decimal, "
                + "e.g. 1 = 1.0: ");
        double distance = input.nextDouble();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter miles per gallon as a decimal: ");
        double mpg = in.nextDouble();
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter price per gallon as a decimal"
                + "e.g. $3 = 3.00: ");
        double price = enter.nextDouble();
        double cost = (distance / mpg) * price;
        System.out.println("The cost of driving is $" 
                + (Math.round(cost * 100) / 100.00));
    }
}
