/**Assignment 5.4 */
public class MileToKiloTable {
    public static void main(String[] args) {
        System.out.println("Miles | Kilometers");
        double mile = 1;
        while (mile <= 10) {
            double kilometer = mile * 1.609;
            System.out.printf("%5s %9s\n", mile, kilometer);
            mile++;
        }
    }
}
