/** Listing 2.2 */
public class Scan {
  public static void main(String[] args) {
    //Create Scanner Object
  Scanner input = new Scanner(System.in);
    //Prompt the user to enter a radius
  System.out.print("Enter a number for radius: ");
    double radius = input.nextDouble();
    //compute area
  double area = radius * radius * 3.14159;
    //Display results
  System.out.println("The area for the circle of radius " + radius + " is " area);
  }
}
