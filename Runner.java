/** Assignment 1.10 */
public class Runner {
    // Convert 14km per 45 minutes and 30 seconds to miles per hour
    public static void main(String[]args){
        System.out.print("If a runner runs 14km in 45 minutes ");
        System.out.print("and 30 seconds, he is running at a pace of ");
        double a = 14.0 / 1.6;
        double b = (45.0 * 60.0 + 30.0) / 3600.0;
        System.out.println(Math.round((a / b)*100)/100.00 + " mi/hr");
