import java.util.Scanner;
public class GreatestCommonDivisor {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter first integer: ");
    int n1 = input.nextInt();
    System.out.println("Enter second integer: ");
    int n2 = input.nextInt();
    for (int k = 2; k <= n1 && k <= n2; k++) {
      if (n1 % k == 0 && n2 % k == 0)
        int gcd = k;
    }
     System.out.println("The greatest common divisor for " + n1 + " and " +
                        n2 + " is " + gcd);
  }
