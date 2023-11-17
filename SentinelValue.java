import java.util.scanner
public class SentinelValue {
  /** Main Method */
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);
      // Read an initial data
    System.out.print(
      "Enter an integer (the input ends if it is 0): ");
      int data = input.nextInt();
      // Keep reading data until input is 0
    int sum = 0
      while (data != 0) {
      sum += data;
      // Read the next data
      System.out.print(
        "Enter an integer (the input ends if it is 0): ");
      datat = input.nextInt();
    }
    System.out.println("The sum is " + sum);
  }
}
