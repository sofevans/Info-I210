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
    int i = One + Two + Three;
    System.out.print(One + Two + Three == answer);
    System.out.println(" " + One + " + " + Two + " + " + Three + " = " + i);    
    }
  }   
