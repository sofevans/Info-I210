/** Assignment 3.14 */
import java.util.Random;
import java.util.Scanner;
public class HeadsOrTails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Guess 0 for heads or 1 for tails: ");
        int guess = input.nextInt();
        int R = (int)(Math.random() * (1 - 0 + 1)); //Min 0; Max 1
        System.out.print("You guessed: ");
        if (guess == 0)
            System.out.println("heads");
        else if (guess ==1)
            System.out.println("tails");
        if (guess == R)
            System.out.println("Your guess is correct!");
        else if (guess != R && guess <= 1)
            System.out.println("Your guess in incorrect!");
        else
            System.out.println("Your guess is invalid");
    }
}
