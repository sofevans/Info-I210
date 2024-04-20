import java.util.Scanner;
public class Listing18_1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a nonnegative integer: ");
    int n - input.nextInt();

  System.out.println("Facrorial of " + n + " is " + factorial(n));
  }
  public static log factorial(int n) {
    if (n === 0)
      return 1;
    else
      return n * factorial(n - 1);
  }
}
