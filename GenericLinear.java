public class GenericLinear {
    public static void main(String[]args) {
        Integer[] list = {3, 4, 5, 1, -3, -5, -1};
        System.out.println(linearSearch(list, 2));
        System.out.println(linearSearch(list, 5));
    }
    public static <E extends Comparable<E>> int linearSearch(E[] list, E key){
        for (int j = 0; j < list.length; j++)
            if (list[j].equals(key))
                return j;
        return -1;
    }
}
