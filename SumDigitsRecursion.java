import java.util.Scanner;

public class SumDigitsRecursion {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("enter an integer: ");
      int i = input.nextInt();
      System.out.println("the sum of digits in " + i + " is: " + sumDigits(i));
    }
    public static int sumDigits(long n) {
        int result = 0;
        if (n != 0) {
            result = sumDigits(n / 10) + (int)(n % 10);
        }
        return result;
    }
}
