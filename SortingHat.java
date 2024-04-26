import java.util.ArrayList;
import java.util.Scanner;

public class SortingHat {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter ten integers");
    ArrayList<Integer> number = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++)
        number.add(input.nextInt());
    sort(number);
    System.out.println("Sorted numbers are: ");
    for (int e: number)
        System.out.print(e + " ");
    System.out.println();
    }
    public static <E extends Comparable<E>> void sort(ArrayList<E> list){
        E min;
        int index;
        for (int i = 0; i < list.size() - 1; i++) {
            min = list.get(i);
            index = i;
            for (int j = i + 1; j < list.size(); j++){
                if (min.compareTo(list.get(j)) > 0) {
                    min = list.get(j);
                    index = j;
                }
            }
            if(index  != i){
                list.set(index, list.get(i));
                list.set(i, min);
            }
        }
    }
}
