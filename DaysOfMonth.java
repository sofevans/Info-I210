/** Exercise 4.17 */
import java.util.Scanner;
public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = input.nextInt();
        Scanner String = new Scanner(System.in);
        System.out.println("Use first 3 letters with uppercased first letter");
        System.out.println("Enter a month: ");
        String month = String.nextLine();
        String text;
        switch (month) {
            case "Jan": text = "Jan " + year + " has 31 days"; break;
            case "Feb": 
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                    text = "Feb " + year + " has 29 days";
                else
                    text = "Feb " + year + " has 28 days";
                    break;
            case "Mar": text = "Mar " + year + " has 31 days"; break;
            case "Apr": text = "Apr " + year + " has 30 days"; break;
            case "May": text = "May " + year + " has 31 days"; break;
            case "Jun": text = "Jun " + year + " has 30 days"; break;
            case "Jul": text = "Jul " + year + " has 31 days"; break;
            case "Aug": text = "Aug " + year + " has 31 days"; break;
            case "Sep": text = "Sep " + year + " has 30 days"; break;
            case "Oct": text = "Oct " + year + " has 31 days"; break;
            case "Nov": text = "Nov " + year + " has 30 days"; break;
            case "Dec": text = "Dec " + year + " has 31 days"; break;
            default: text = month + " is not a correct month name"; break;
        }
        System.out.println(text);
    }
}
