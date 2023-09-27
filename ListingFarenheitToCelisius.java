/* Listing 2.6 */
import java.util.Scanner;
public class ListingFarenheitToCelisius {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a degree in Fahrenheit: ");
    double fahrenheit = input.nextDouble();

    // Convert Fahrenheit to Celsius
    double Celsius = (5.0 / 9) * (fahrenheit - 32);
    System.out.println("Fahrenheit " + fahrenheit + " is " +
            celsius + " in Celsius");
  }
}
