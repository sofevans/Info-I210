/** Assignment 3.19 */
import java.util.Scanner;
public class TrianglePerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the three edge lengths of a triangle as "
                + "decimals (3 =  3.0): ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double P = a + b + c;
        if (a + b > c && b + c > a && a + c > b) {
           System.out.println("Your input is valid");
           System.out.println("The perimeter is: " + P);
        }
        else
            System.out.println("Your entry is invalid");
    }
}
