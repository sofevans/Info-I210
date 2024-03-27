import java.util.ArrayList;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<Number>();
        list.add(32);
        list.add(56);
        list.add(9);
        list.add(2);
        list.add(95);
        System.out.println("Sorted Array: " + list.toString());
    }
    public static void sort(ArrayList<Number> list) {
        for (int i = 0; i < list.size(); i++) { 
            Number min = list.get(i); 
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (min.doubleValue() > list.get(j).doubleValue()) {
                    min = list.get(j);
                    minIndex = j;
                }
            }   
            if (minIndex != i) {
                list.set(minIndex, list.get(i));
                list.set(i, min);
            }
        }
    }
}
