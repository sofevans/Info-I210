import java.util.Scanner;

public class RedoFibonacci {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an index for a Fibonacci number: ");
    int index = input.nextInt();

  System.out.println("the Fibonacci number at index "
                     + index + " is " + fib(index));
  }

public static long fib(int n) {
    int f0 = 0, f1 = 1, activeFib;
  if (n == 0)
    return 0;
  if (n == 1)
      return 1;
  for (int i = 2; i <= n; i++) {
      activeFib = f0 + f1;
      f0 = f1;
      f1 = activeFib;
  }
  return f1;
    }
}
