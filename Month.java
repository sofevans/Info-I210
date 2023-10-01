/** Assignment 3.4 */
import java.util.Random;
public class Month {
    public static void main(String[] args) {
        Random month = new Random();
        int R = (int)(Math.random() * (12) + 1); // Min of 1 Max of 12
        if (R + 1 == 1)
            System.out.println(R + ". January");
        else if (R + 1 == 2)
            System.out.println(R + ". February");
        else if (R + 1 == 3)
            System.out.println(R + ". March");
        else if (R == 4)
            System.out.println(R + ". April");
        else if (R == 5)
            System.out.println(R + ". May");
        else if (R == 6)
            System.out.println(R + ". June");
        else if (R == 7)
            System.out.println(R + ". July");
        else if (R == 8)
            System.out.println(R + ". August");
        else if (R == 9)
            System.out.println(R + ". September");
        else if (R == 10)
            System.out.println(R + ". October");
        else if (R == 11)
            System.out.println(R + ". November");
        else if (R == 12)
            System.out.println(R + ". December");
    }
}
