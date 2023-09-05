/** Assignment 1.9 */
public class Rectangle {
    //Display the area of a rectangle with a width of 4.5 and height of 7.9
    public static void main(String[]args){
        System.out.println("area = width x height");
        System.out.println("perimeter = 2 x (width + height)");
        System.out.println("Width = 4.5; Height = 7.9");
        System.out.print("area = " + (Math.round((4.5 * 7.9)*100)/100.00));
        //Math.round used to resolve Logic Error
        System.out.print(" perimeter = " + 2 * (4.5 + 7.9));
    }   
}
