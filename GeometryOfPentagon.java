/** Exercise 4.1 */
import java.util.Scanner;
public class GeometryOfPentagon {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the lengeth from the center to a vertex: ");
        double length = input.nextDouble();
        Double a = Math.sin((Math.PI) / 5.0);
        Double side = 2 * length * a;
        Double square = Math.pow(side, 2);
        Double area = (5 * square) / (4 * Math.tan((Math.PI) / 5));
        System.out.println("The are of the pentagon is " + 
                Math.round(area * 100) / 100.00);
    }
}
