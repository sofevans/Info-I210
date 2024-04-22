import java.util.Scanner;

public class GCDRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int m = input.nextInt();
        System.out.println("Enter the second integer: ");
        int n = input.nextInt();
        System.out.println("The GCD of " + m + " and " + n + " is: " +
                gcd(m, n));
    }
    public static int gcd(int m, int n) {
        if (m % n == 0)
            return n;
        else
            return gcd(n, m % n);
    }
}
