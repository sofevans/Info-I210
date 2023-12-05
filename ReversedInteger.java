import java.util.Scanner;
public class ReversedInteger {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = input.nextInt();
        System.out.println("The integer reversed is: " + reverse(n));
        
    }
    public static int reverse(int number) {
        int a = (number % 10);
        int b = 0;
        int c = 0;
        while ((number / 10) > 0) {
            c = (b * 10) + a;
            number = number / 10;
            b = c;
            a = (number % 10);
        }
        c = (b * 10) + a;
        return c;
    }
}
