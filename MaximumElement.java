import java.util.Scanner;
import java.util.ArrayList;
        
public class MaximumElement {
    public static void main(String[] args){
        Integer[] numbers = new Integer[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten integers: ");
        for (int i = 0; i < numbers.length; i++);
            numbers[i] = input.nextInt();
        System.out.println("The max number is: " + max(numbers));
    }
    public static <E extends Comparable<E>> E max(E[] list){
        E max = list[0];
        for (int j = 1; j < list.length; j++){
            if (max.compareTo(list[j]) < 0) {
                max = list[j];
            }
        }
        return max;
    }
}
