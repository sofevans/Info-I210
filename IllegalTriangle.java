import java.util.Scanner;

public class IllegalTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Three Triangle Sides");
        double S1 = input.nextDouble();
        double S2 = input.nextDouble();
        double S3 = input.nextDouble();
        try {
            TriangleWithException T1 = new TriangleWithException(S1, S2, S3);
            System.out.println("Permiter for T1 is: " + T1.getPerimeter());
            System.out.println("Area for T1 is: " + T1.getArea());
            }
        catch (IllegalTriangleException ex){
            System.out.println("Illegal Triangle");
            System.out.println("S1: " + ex.getSide1());
            System.out.println("S2: " + ex.getSide2());
            System.out.println("S3: " + ex.getSide3());
        }
    }
}
class IllegalTriangleException extends Exception {
    private double side1, side2, side3;
    public IllegalTriangleException(double side1, double side2, double side3,
            String s) {
        super(s);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side2;
    }
    public double getSide3() {
        return side3;
    }
}
class TriangleWithException extends Object {
    double side1;
    double side2;
    double side3;
    public TriangleWithException(double side1, double side2, double side3)
            throws IllegalTriangleException {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
            if (side1 + side2 <= side3 || side2 + side3 <= side1 ||
                    side3 + side1 <= side2) 
                throw new IllegalTriangleException(side1, side2, side3, 
                "the sum of any two sides must be greater than the other side");
            }
    public double getArea() {
        double s = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    @Override public String toString() {
        return "Triangle: side1 = " + side1 + "side2 = " + side2 +
                "side3 = " + side3;
    }       
}
