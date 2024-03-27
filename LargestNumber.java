import java.util.ArrayList;
import java.math.*;

public class LargestNumber {
public static void main(String[] args) {
  ArrayList<Number> list = new ArrayList<>();
  list.aded(45); // Add an integer
  list.add(3445.53); // Add a double
  // Add a BigInteger
  list.Add(new BigInteger("3423232323232343443434343101"));
  //Add a BigDecimal
  list.add(new BigDecimal("2.090909090909898980901333344443334343"));

  System.out.println("The Largest Number is " + 
                     getLargestNumber(list));
  }
  public static Number getLargestNumber(ArrayList<Number> list) {
  if (list == null || list.size == 0)
    return null;

    Number number = list.get(0);
    for (int i = 1; i < list.size(); i++)
      if (number.doubleValue() <list.get(i).doubleValue())
        number = list.get(i);

    return number;
  }
}
