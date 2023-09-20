/** Assignment 2.4 */
import java.util.Scanner;
public class PoundsKilos {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number in pounds: ");
        double lbs = input.nextDouble();
        double kilos = lbs * 0.454;
        System.out.println(lbs + " pounds is " + kilos + " kilograms");
    }
}
