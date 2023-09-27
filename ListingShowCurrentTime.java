/* Listing 2.7 */
  public class ListingShowCurrentTime {
    public static void main(String[] args) {
      // Obtain the total milliseconds since midnight, Jan 1, 1970
      long totalMilliseconds = System.currentTimeMillis();

      // Obtain the total seconds since midnight, Jan 1, 1970
      long totalSeconds = totalMilliseconds / 1000;

      // Compute the current second in the minute in the hour
      long CurrentSecond = totalSeconds % 60;

      // Obtain the total minutes
      long totalMinutes = totalSeconds / 60;

      // Compute the current minute in the hour;
      long currentMinute = totalMinutes % 60;

      // Obtain the total hours
      long totalHours = totalMinutes / 60;

      // Compute the current hour
      long currentHour = totalHours % 24;

      // Display results
      System.out.println("current time is " + currentHour + ":" + currentMinutes + ":" + currentSecond + " GMT");
    }
  }
