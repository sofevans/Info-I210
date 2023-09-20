/** Assignment 2.8 */
import java.util.Scanner;
public class TimeZone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the time zone offset to GMT: ");
        long offset = input.nextLong();
        long Milliseconds = System.currentTimeMillis() + (3600000 * offset);
        long totalSeconds = Milliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        System.out.println("The current time is " + currentHour + ";"
            + currentMinute + ";" + currentSecond);
        //Uses current time, output will not match assignment example output
    }
}
