/** Assignment 1.11 */
public class Census {
  /* Dislay population over the course of five years
  -One birth every 7 seconds
  -One death every 13 seconds
  -One new immigrannt every 45 seconds */
    public static void main(String[]args){
        double  base = 312032486;
        double a = 365.0 * 24.0 * 3600.0;
        double birth = a / 7.0;
        double death = a / 13.0;
        double immigrant = a / 45.0 ;
        double year = birth - death + immigrant;
        double y = Math.ceil(year);
        //Math.ceil used to round up to the next whole person
        double one = y + base;
        double two = one + y;
        double three = two + y;
        double four = three + y;
        double five = four + y;
        System.out.println("Base population: " + base);
        System.out.println("Year One: " + one);
        System.out.println("Year Two: " + two);
        System.out.println("Year Three: " + three);
        System.out.println("Year Four: " + four);
        System.out.print("Year Five: " + five);
    }
