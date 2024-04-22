import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter and string: ");
        String i = input.nextLine();
        System.out.println("The reversal of " + i + " is: ");
        reverseStringDisplay(i);
    }
    public static void reverseStringDisplay(String value) {
        if (value.length() > 0) {
            System.out.print(value.charAt(value.length() - 1)); //do not use ln
            reverseStringDisplay(value.substring(0, value.length() - 1));
        }
    }
}
