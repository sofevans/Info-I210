/* Assignment 2.22 */
import java.util.Scanner;

public class RewriteListing {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an amount as an integer, e.g., "
            + "1156 represent $11.56: ");
    int amount = input.nextInt();
    int numberOfDollars = amount / 100;
    amount = amount % 100;
    int numberOfQuarters = amount / 25;
    amount = amount % 25;
    int numberOfDimes = amount / 10;
    amount = amount % 10;
    int numberOfNickles = amount / 5;
    amount = amount % 5;
    int numberOfPennies = amount;
    System.out.println("Your amount" + amount + " consists of");
    System.out.println(" " + numberOfDollars + " dollars");
    System.out.println(" " + numberOfQuarters + " quarters");
    System.out.println(" " + numberOfDimes + " dimes");
    System.out.println(" " + numberOfNickles + " nickles");
    System.out.println(" " + numberOfPennies + " pennies");
  }
}
