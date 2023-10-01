/** Assignment 3.2 */
import java.util.Scanner;
public class AddThree {
  public static void main(String[] args) {
    int One = (int)(System.currentTimeMillis() % 10);
    int Two = (int)(System.currentTimeMillis() / 10 % 10);
    int Three = (int)(System.currentTimeMillis() / 5 % 10);
    Scanner input = new Scanner(System.in);
    System.out.println("What is " + One + " + " + Two + " + " + Three + " ?");            
    int answer = input.nextInt();
    int correct = One + Two + Three;
    if (answer == correct) {
        System.out.print("Correct " + One + " + " + Two + " + " + Three);
        System.out.println(" = " + correct);
    }
    else if (answer != correct) {
        System.out.print("Incorrect, " + One + " + " + Two + " + " + Three);
        System.out.println( " = " + correct);    
    }
  }   
}
