/** Assignment 1.13 */
public class Cramer {
  /* Solve the equation using Cramer's formula */
    public static void main(String[]args){
        System.out.println("When ad - bc DOES NOT EQUAL zero;");
        double a = 3.40;
        double b = 50.20;
        double c = 2.10;
        double d = 0.55;
        double e = 44.50;
        double f = 5.90;
        double g = (a * d) - (b * c);
        double x = ((e * d) - (b * f)) / g;
        double y = ((a * f) - (e * c)) / g;
        System.out.println(" ");
        System.out.print("x = " + (Math.round(x*100)/100.00));
        System.out.println(" and y = " + (Math.round(y*100)/100.00));
        //Math.round used to round to second decimal place
        System.out.println("For the equation:");
        System.out.println(" ");
        System.out.println("3.4x + 50.2y = 44.5");
        System.out.print("2.1x + .55y = 5.9");
    }
}
