/** Exercise 4.6 */
import java.util.Random;

public class RandomPoints {
    public static void main(String[] args) {
        int x1 = (int)(Math.random() * (40) - 40); // Min -40 Max 40
        int y1 = (int)(Math.random() * (40) - 40);
        int x2 = (int)(Math.random() * (40) - 40);
        int y2 = (int)(Math.random() * (40) - 40);
        int x3 = (int)(Math.random() * (40) - 40);
        int y3 = (int)(Math.random() * (40) - 40);
        
        double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        
        double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) 
                / (-2 * b *c)));
        double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) 
                / (-2 * a *c)));
        double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) 
                / (-2 * a *b)));
        
        System.out.println("The three points are (" + x1 + "," + y1 + ") , ("
                + x2 + "," + y2 + ") , (" + x3 + "," + y3 + ")");
        System.out.println("The three angles in degrees are " 
                + Math.round(A * 100) / 100.00
                + ", " + Math.round(B * 100) / 100.00 + ", " 
                + Math.round(C * 100) / 100.00);
    }
}
