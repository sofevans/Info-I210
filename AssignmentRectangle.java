 /** Assignment 9.1 */
public class AssignmentRectangle {
    public static void main(String[] args) {
        RectangLe rectangle1 = new RectangLe();
        System.out.println("the area of the rectangle with"
                + "height " + rectangle1.height + " and "
                        + "width " + rectangle1.width + " is"
                                + " " + rectangle1.getArea() + " and"
                                        + "the perimeter is"
                                        + " " + rectangle1.getPerimeter());
        
       RectangLe rectangle2 = new RectangLe(40, 4);
        System.out.println("the area of the rectangle with"
                + "height " + rectangle2.height + " and "
                        + "width " + rectangle2.width + " is"
                                + " " + rectangle2.getArea() + " and"
                                        + "the perimeter is"
                                        + " " + rectangle2.getPerimeter());
       
       RectangLe rectangle3 = new RectangLe(35.9, 3.5);
        System.out.println("the area of the rectangle with"
                + "height " + rectangle3.height + " and "
                        + "width " + rectangle3.width + " is"
                                + " " + rectangle3.getArea() + " and"
                                        + "the perimeter is"
                                        + " " + rectangle3.getPerimeter());
    }
}

class RectangLe {
    double height;
    double width;
    RectangLe() {
        height = 1;
        width = 1;
    }
    RectangLe(double newHeight, double newWidth) {
        height = newHeight;
        width = newWidth;
    }
    double getArea() {
        return width * height;
    }
    double getPerimeter() {
        return 2 * (width + height);
    }
    void setParameters(double newHeight, double newWidth) {
        height = newHeight;
        width = newWidth;
    }
}
