/** Exercise 4.5 */
import java.util.Scanner;
public class GeometryPolygon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of sides: ");
        System.out.println("Enter the side length: ");
        double n = input.nextDouble();
        double s = input.nextDouble();
        double tan = Math.tan(Math.PI / n);
        double area = (n * Math.pow(s, 2)) / (4.0 * tan);
        System.out.println("The area of the polygon is " + area);
    }
}
