import java.util.Scanner;
public class FutureInvestment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The amount invested: ");
        double amount = input.nextDouble();
        System.out.println("Annual interest rate: ");
        double rate = input.nextDouble();
        int year = 1;
        System.out.println("Years     Future Value");
        while (year <= 30) {
        System.out.printf("%-10d%10.2f\n", year,
                futureInvestmentValue(amount, rate, year));
        year++;
        }
    }
    public static double futureInvestmentValue (
            double investmentAmount, double monthlyInterestRate, int years) {
            double futureValue = investmentAmount * (Math.pow((
                1 + (monthlyInterestRate / 100.0) / 12.0), (years * 12.0)));
        return futureValue;
    }
}
