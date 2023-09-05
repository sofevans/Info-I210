/** Assignment 1.8 */
import java.util.Scanner;
public class NewClass {
    public static void main(String[]args){
        final double PI = 3.14159;
        final String \u03C0 = "\u03C0";
        /* I tried to use unicode for the pi symbol but am unncertain
        if pi symbol is displayed; console id displaying '?'
        but showing pi symbol in description */
        System.out.println("perimiter = 2 x radius x " + \u03C0);
        System.out.println("area = radius x radius x " + \u03C0);
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius value as a decimal (e.x. 5 = 5.0): ");
        double radius = input.nextDouble();
        double perimeter = 2 * radius * PI;
        double area = radius * radius * PI;
        System.out.println("When the radius is: " + radius);
        System.out.println(" ");
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
    }  
}
