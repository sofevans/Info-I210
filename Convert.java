/** Assignment 2.1 */
import java.util.Scanner;
public class Convert {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();
        double f = (9.0 / 5.0) * celsius + 32;
        System.out.println(celsius + " Celsius is " + f + " Fahrenheit");
    }    
}
