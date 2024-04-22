import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter and integer: ");
        int i = input.nextInt();
        System.out.println("The reversal integer of " + i + " is: ");
        reverseDisplay(i);
    }
    public static void reverseDisplay(int value) {
        if (value != 0) {
            System.out.print(value % 10); //do not use ln
            value = value / 10;
            reverseDisplay(value);
        }
    }
}
