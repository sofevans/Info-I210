/**Assignment 2.12*/
import java.util.Scanner;
public class Physics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter speed and acceleration: ");
        double v = input.nextDouble();
        double a = input.nextDouble();
        double length = (v * v) / (2.0 * a);
        double L = (Math.round(length*1000)/1000.000);
        //Math.round used to round to third decimal place
        System.out.println("The minimum runway length for this airplane is: " 
                + L);
    }
}
