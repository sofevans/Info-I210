import java.util.ArrayList;
import java.util.Scanner;
public class EwmoveDuplicate {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter strings: ");
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 5; i++)
            list.add(input.nextLine());
        
        ArrayList<String> newList = removeDuplicates(list);
        System.out.println(newList);
    }
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
        ArrayList<E> result = new ArrayList<E>();
        list.stream().filter((e) -> (!result.contains(e))).forEachOrdered((e) ->
        { result.add(e);
        });
        return result;
        }
       
    } 
        
