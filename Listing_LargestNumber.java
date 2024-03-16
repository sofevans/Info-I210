import java.util.ArrayList;
import java.math.*;

public class Listing_LargestNumber {
  public static void main(String[] argg) {
    ArrayList<Number> list = new ArrayList<>();
    list.add(45); // Add and integer
    list.add(3445.53); // Add a double
    // Add a BigInteger
    list.add(new BigInteger("343232323232343443101"));
    // Add a BigDecimal
    list.add(new BigDecimal("2.0909090909098901343433344343"));

    System.out.println("The largest number is: " +
                       getLargestNumber(list));
  }
  public static Number getLargestNumber(arrayList<Number> list) {
    if (list == null || list.size() == 0)
      return null;
    Number number = list.get(0);
    for(int i = 1; i < list.size(); i++)
      if(number.doubleValue() < list.get(i).doubleValue())
        number = list.get(i);

    return number;
  }
}
