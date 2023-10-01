/** Exercise 31. */
import java.util.Scanner;
public class Discriminant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double discriminant = (b * b) - (4.0 * a * c);
        double D = Math.pow(discriminant, 0.5);
        if ((b * b) - (4 * a * c) > 0)
            System.out.println("The equation has two roots " + 
                    (0 - b + D) / (2.0 * a) + " and " +
                    (0 - b - D) / (2.0 * a));
        else if ((b * b) - (4 * a * c) == 0)           
            System.out.println("the equation has one root " + 
                    ((0 - b + D) / (2.0 * a)));
        else if ((b * b) - (4.0 * a * c) < 0)
            System.out.println("the equation has no real roots");    
    }
 }
