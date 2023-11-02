/** Exercise 4.12 */
import java.util.Scanner;
public class Hexinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a hex digit: ");
        String hex = input.nextLine();
        String text = hex.toUpperCase();
        String message = "The binary value is "; 
        String value;
        switch (text) {
            case "0": value = message + "0000";
                break;
            case "1": value = message + "0001";
                break;
            case "2": value = message + "0010";
               break;              
            case "3": value = message + "0011";
                break;
            case "4": value = message + "0100";
                break;   
            case "5": value = message + "0101";
                break;
            case "6": value = message + "0110";
                break;
            case "7": value = message + "0111";
                break;
            case "8": value = message + "1000";
                break;
            case "9": value = message + "1001";
                break;
            case "A": value = message + "1010";
                break;    
            case "B": value = message + "1011";
                break;    
            case "C": value = message + "1100";
                break;
            case "D": value = message + "1101";
                break;
            case "E": value = message + "1110";
                break;
            case "F": value = message + "1111";
                break;
            default: value = hex + " is an invalid input";
                break;
        }
        System.out.println(value);
    }
}
