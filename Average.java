/** Listing 2.3 */
import java.util.Scanner; //Scanner is in the jave.util package
public class Average {
  public static void main(String[] args) {
    //Create Scanner Object
    Scanner input = new Scanner(System.in);
    //Prompt the user to enter three numbers
    System.out.print("Enter three numbers: ");
    double number1 = input.nextDouble();
    double number2 = input.nextDouble();
    double number3 = input.nextDouble();
    //Compute Average
    double average = (number1 + number2 + number3) / 3;
    //Display Results
    System.out.println("The average of " + number1 + " " +  number2
                       + " " + number3 + " is " + average);
  }
}
