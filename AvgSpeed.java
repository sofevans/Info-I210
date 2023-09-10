/**Assignment 1.12*/
public class AvgSpeed {
     public static void main(String[]args){
        System.out.print("If a runner runs 24 miles in 1 hour, ");
        System.out.println("40 minutes, and 35 seconds; " );
        System.out.print("he is running at approximately ");
        double a = 24.0 * 1.6;
        double b = (3600.0 + (40.0 * 60.0) + 35.00) / 3600.0;
        System.out.println(Math.round((a / b)*100)/100.00 + " km/hr");
        //Math.round used to round up to two decimal places
    }   
}
