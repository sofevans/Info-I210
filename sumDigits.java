/** Exercise 6.2 */
import java.util.Scanner;
public class sumDigits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        long number = input.nextLong();
        System.out.println("Let's find the sum of the integer's digits!");
        System.out.print("The sum of the digits is: " + sumDigits(number));
        
    }
    public static int sumDigits(long n) {
        long a = 0;
        while ((n / 10) > 0) {
            a = a + (n % 10);
            n = n / 10;
        }
        a = a + n;
        int b = Math.round(a);
        return b;
    }
}
