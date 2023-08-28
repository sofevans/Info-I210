/** Assignment 1.4 */
public class Table {
    public static void main(String[]args){
      // Display Table shown for Assignment 1.4
        System.out.println("a a^2 a^3");
        for(int i = 1; i <= 4; i = i + 1){
            int a = (i * i);
            int b = (i * i * i);
            System.out.print(i + "  ");
            System.out.print(a);
            if (a < 10){
                System.out.println("  " + b);
            }
            if (a > 10){
                System.out.println(" " + b);
            }
        }
    }
}
