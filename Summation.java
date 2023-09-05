/** Assignment 1.6 */
public class Summation {
    // Display the sum of 1,2,3,4,5,6,7,8, and 9
    public static void main(String[]args){
        int a = 0;
       for(int i = 1; i <= 9; i = i + 1){
           a = a + i;
           if(i == 9){
               System.out.print("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9");
               System.out.println(" = " + a);
           }
        }    
    }
