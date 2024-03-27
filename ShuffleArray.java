import java.util.ArrayList;

public class ShuffleArray {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<Number>();
        list.add(5);
        list.add(65);
        list.add(18);
        list.add(95);
        list.add(1);
        list.add(6);
        list.add(24);
        shuffle(list);
        System.out.println(list.toString());
    }
    public static void shuffle(ArrayList<Number> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int switchNum = (int) (Math.random() * list.size());
            Number num = list.get(switchNum);
            list.set(switchNumber, list.get(i));
            list.set(i, num);
        }
    }
}
