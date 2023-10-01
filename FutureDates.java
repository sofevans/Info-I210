/** Assignment 3.5 */
import java.util.Scanner;
public class FutureDates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day (0-Sunday, 1-Monday, ");
        System.out.print("2-Tuesday, 3-Wednesday, 4-Thursday, ");
        System.out.println("5-Friday, 6-Saturday");
        int today = input.nextInt();
        System.out.println("Enter the number of days elapsed since today: ");
        int elapsed = input.nextInt();
        int date = today + elapsed;
        if (today == 0)
            System.out.print("Today is Sunday and the future day is ");
        else if (today == 1)
            System.out.print("Today is Monday and the future day is ");
        else if (today == 2)
            System.out.print("Today is Tuesday and the future day is ");
        else if (today == 3)
            System.out.print("Today is Wednesday and the future day is ");
        else if (today == 4)
            System.out.print("Today is Thursday and the future day is ");
        else if (today == 5)
            System.out.print("Today is Friday and the future day is ");
        else if (today == 6)
            System.out.print("Today is Saturday and the future day is ");
        if ((elapsed + today) % 7 == 0)
            System.out.println("Sunday");
        else if ((elapsed + today) % 7 == 1)
            System.out.println("Monday");
        else if ((elapsed + today) % 7 == 2)
            System.out.println("Tuesday");
        else if ((elapsed + today) % 7 == 3)
            System.out.println("Wednesday");
        else if ((elapsed + today) % 7 == 4)
            System.out.println("Thursday");
        else if ((elapsed + today) % 7 == 5)
            System.out.println("Friday");
        else if ((elapsed + today) % 7 == 6)
            System.out.println("Saturday");
    }
}
