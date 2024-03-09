import java.util.ArrayList;

public class ShuffleArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println("Shuffling list: ");
        shuffle(list);
        System.out.println(list);
    }
    public static void shuffle(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int randomIndex = (int) (Math.random() * list.size());
            int num = list.get(randomIndex);
            list.set(randomIndex, list.get(i));
            list.set(i, num);
        }
    }
}
