import java.util.Scanner
public class ListingComputeTax {
  public static void main(String[] args) {
    // Create Scanner
  Scanner input = new.Scanner(System.in);
    // Prompt the user to enter filling status
  System.out.print("(0-single filer, 1-married jointly or" +
      " qualifying window(er), 2-married seperately, 3-head of " +
                   "household) Enter filing status: ";
    int status = input.nextInt();
    // Prompt the user to enter taxable amount
    System.out.print("Enter the taxable income: ";
    double income = input.nextDouble();
    // Compute tax 
    double tax = 0;
    if (status == 0) { // Compute tax for single fillers
      if (income <= 8350)
        tax = income * 0.10;
      else if (income <= 33950)
        tax = 8350 * 0.10 + (income - 8350) * 0.15;
      else if (income <= 82250)
        tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + 
          (income - 33950) * 0.25 ;
      else if (income <= 171550)
        tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + 
          (income - 33950) * 0.25 + (income - 82250) * 0.28;
      else if (incmoe <= 379250)
        tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + 
          (income - 33950) * 0.25 + (income - 82250) * 0.28 +
          (379250 - 171550) * 0.33 + (income - 372950) * 0.35;
    }
    else if (status ==1) { // Left as an exercise
      // Compute tax for married file jointly or qualifying widow(er)
    } 
    else if (status == 2) { // Compute tax for married seperately
      // Left as an exercise in Programming Exercise 3.13
    }
    else if (status == 3) { // Compute tax for head of household
      // Left as an exercise in Programming Exercise 3.13
    }
    else {
      System.out.println("Error: invalid status");
      System.exit(1);
    }
    // Display the result
    System.out.println("Tax is " + (int)(tax * 100) / 100.0);
  }
}
                     
