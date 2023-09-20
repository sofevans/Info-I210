/**Assignment 2.18*/
public class PrintTable {
    //Unsure how to display table boarders
    public static void main(String args[]){
      System.out.println("a  b  pow(a, b)");
        for (int a = 1; a <= 5; a++){
            int b = a + 1;
            double c = Math.pow(a , b);
            float C  = Math.round(c);
            int d = Math.round(C);
            System.out.println(a + "  " + b + "  " + d);
        }
    }
}
