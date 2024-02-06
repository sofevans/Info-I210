 */import java.util.Scanner;
public class location {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in array: ");
        int rows = input.nextInt();
        int columns = input.nextInt();
        double[][] a = new double[rows][columns];
        int i = 0;
        while (i < a.length){
            System.out.printf("Enter Array: \n");
                for (int j = 0; j < a[columns].length; j++) {
                 double A = input.nextDouble();
            }
            i++;
        }
        System.out.println("The location of the largest element is " 
                + " at " + locateLargest(a)) ;
    }
}
class Location {
    public static Location locateLargest(double[][] a) {
        double largest = 0;
        for (int rows = 0; rows < a.length; rows++) {
            for (int columns = 0; columns < a[columns].length; columns++) {
               if (largest < a[rows][columns]){
                 largest = a[rows][columns]; ;
               } 
              }
            return largest;
            }
    }
}
