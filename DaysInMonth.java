/** Assignment 3.11 */
import java.util.Scanner;
public class DaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month (as an integer) and year: ");
        int month = input.nextInt();
        switch (month) {
            case 1: System.out.print("January "); break;
            case 2: System.out.print("February "); break;
            case 3: System.out.print("March "); break;
            case 4: System.out.print("April "); break;
            case 5: System.out.print("May "); break; 
            case 6: System.out.print("June "); break;
            case 7: System.out.print("July "); break;
            case 8: System.out.print("August "); break;
            case 9: System.out.print("September "); break;
            case 10: System.out.print("October "); break;
            case 11: System.out.print("November "); break;
            case 12: System.out.print("December "); break;
        }
        int year = input.nextInt();
        if (month % 2 == 0 && month != 2 && month < 8)
            System.out.println(year + " has 30 days.");
        else if (month % 2 != 0 && month < 8)
            System.out.println(year + " has 31 days.");
        else if (month % 2 == 0 && month > 8)
            System.out.println(year + " has 31 days.");
        else if (month % 2 != 0 && month > 8)
            System.out.println(year + " has 30 days.");
        else if (month == 8)
            System.out.println(year + " has 31 days.");
        else
            if (year % 4 == 0)
                System.out.println(year + " has 29 days.");
            else
                System.out.println(year + " has 28 days.");
    }
}
