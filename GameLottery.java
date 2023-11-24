/** Assignment 5.32 */
import java.util.Scanner;
public class GameLottery {
    public static void main(String[] args){
    int lottery1 = (int)(Math.random() * 10);
    int lottery2 = (int)(Math.random() * 10);
    while (lottery1 == lottery2){
        lottery2 = (int)(Math.random() * 10);
    }
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your lottery pick (two digits): ");
    int guess = input.nextInt();
    int guessDigit1 = guess / 10;
    int guessDigit2 = guess % 10;
    System.out.println("the lottery number is " + lottery1 + lottery2);
    if (guessDigit1 == lottery1 && guessDigit2 == lottery2)
      System.out.println("Exact match: you win $10,000");
    else if (guessDigit2 == lottery1 && guessDigit1 == lottery2)
      System.out.println("Match all digits: you win $3,000");
    else if (guessDigit1 == lottery1
             || guessDigit1 == lottery2
             || guessDigit2 == lottery1
             || guessDigit2 == lottery2)
      System.out.println("Match one digit: you win $1,000");
    else
      System.out.println("Sorry, no match");
  }
}
