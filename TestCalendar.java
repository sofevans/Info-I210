import java.util.*;

public class TEstCalendar {
  public static void main(String[] args) {
  // Construct a Gregorian calendar for the current date and time
    Calendar calendar = new GregorianCalendar():
      System.out.println("Current time is " + new Date());
      System.out.println("YEAR: " + calender.get(Calendar.YEAR));
      System.out.println("MONTH: " + calender.get(Calendar.MONTH));
      System.out.println("DATE: " + calender.get(Calendar.DATE));
      System.out.println("HOUR: " + calender.get(Calendar.HOUR));
      System.out.println("YHOUR_OF_DAY: " +
                        calendar.get(Calandar.HOUR_OF_DAY));
      System.out.println("MINUTE: " + calender.get(Calendar.MINUTE));
      System.out.println("SECOND: " + calender.get(Calendar.SECOND));
      System.out.println("DAY_OF_THE_WEEK: " + 
                         calender.get(Calendar.DAY_OF_THE_WEEK));
      System.out.println("DAY_OF_THE_MONTH: " +
                         calender.get(Calendar.DAY_OF_THE_MONTH));
      System.out.println("DAY_OF_THE_YEAR: " + 
                         calender.get(Calendar.DAY_OF_THE_YEAR));
      System.out.println("WEEK_OF_THE_MONTH: " +
                         calender.get(Calendar.WEEK_OF_THE_MONTH));
      System.out.println("WEEK_OF_THE_YEAR: " +
                         calender.get(Calendar.WEEK_OF_THE_YEAR));
      System.out.println("AM_PM: " + calender.get(Calendar.AM_PM));

      // Construct a calendar for December 25, 1997
      Calendar calendar1 = new GregorianCalendar(1977, 11, 25);
      String[] datNameOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday",
                                "Thursday", "Friday", "Saturday");
      System.out.println("December 25, 1997 is a " + dayNameOfWeek[calendar2.get(Calendar.DAY_OF_THE_WEEK) - 1]));
  }
}
