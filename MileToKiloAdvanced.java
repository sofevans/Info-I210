/** Assignment 5.6 */
public class MileToKiloAdvanced {
    public static void main(String[] args) {
        System.out.println("Miles   Kilometers  |   Kilometers    Miles");
        int mile = 1;
        int kilometer = 20;
        while (mile <= 10) {
            double k = mile * 1.609;
            double m = kilometer / 1.609;
            System.out.printf("%-2s %4s %-7s %5s %4s %-10s %1s\n", mile, " ",
                    k, "|", kilometer, " ", Math.round(m * 1000) / 1000.000 );
            mile++;
            kilometer = kilometer + 5;
        }
    }
}
