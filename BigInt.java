import java.math.*;
import java.util.*;

public class BigInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        String num = input.nextLine();
        BigInteger number = new BigInteger(num);
        System.out.println("The Factorial of " + num + " is "
                + factorial(number));
    }
    public static BigInteger factorial(BigInteger i) {
        if (i.equals(BigInteger.ZERO))
            return BigInteger.ONE;
        else
            return i.multiply(factorial(i.subtract(BigInteger.ONE)));
    }
}
