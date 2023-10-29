/** Exercise 4.11 */
import java.util.Scanner;
public class DecHex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer value (0 to 15): ");
        int value = input.nextInt();
        if (value < 0 || value > 15) 
            System.out.println(value + " is an invalid input");
        else if (value >= 0 && value <= 9)
            System.out.println("The hex value is " + 
                    Integer.toHexString(value));
        else            
            System.out.println("The hex value is " + 
                    Integer.toHexString(value).toUpperCase());
    }
}
