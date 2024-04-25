import java.util.ArrayList;
import java.util.Scanner;

public class GenericStack {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five strings: ");
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 5; i++)
            list.add(input.nextLine());
        
        System.out.println(reverse(list));
    }
    public static <E> ArrayList<E> reverse(ArrayList<String> list){
        ArrayList<String> newList = new ArrayList<String>();
        String f = " ";
        for (int j = 5; j > 0; j--) {
           f = list.get(j);
           newList.add(f);
        }
        return newList;
    } 
}
        
