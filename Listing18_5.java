public class Listing18_5 {
  public static void sort(double[] list) {
    sort(list, 0, list.length -1);
  }
  private static void sort(double[] list, int low, int hight) {
    if (low < high)
      int indexOfMin = low;
      double min = list[low];
    for (int i = low + 1; i <= high; i++) {
      if (list[i] < min) {
        min = list[i];
        indexofMin = i;
      }
    }
    list[IndexOfMin] = list[low];
    list[low] = min;
    sort(list, low + 1, high);
    }
  }
}
