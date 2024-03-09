import java.util.Scanner;
import java.util.ArrayList;

public class HWArrayList {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        System.out.print("Enter a sequence of numbers ending wih 0: ");
		Integer num = input.nextInt();
		while (num.intValue() != 0) {
			list.add(num);
			num = input.nextInt();
                }
                System.out.println("The largestnumber is: " + max(list));
    }
    public static Integer max(ArrayList<Integer> list) {
        if (list.size() == 0)
            return null;
        
        Integer max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max)
                max = list.get(i);
        }
        return max;
        }
    }
