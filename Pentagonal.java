/** Exercise 6.1 */
public class Pentagonal {
    public static void main(String[] args) {
        System.out.println("The first 100 pentagonal numbers are:  \n");
    printPentagonalNumber(100);
    }
    public static void printPentagonalNumber(int numberOfPentagonals) {
        final int NUMBER_OF_PENTAGONALS_PER_LINE = 10; // Display 10 per line
        int count = 0;
        int number = 1;
        while (count < numberOfPentagonals) {
            int x = getPentagonalNumber(number);
            count++;
            if (count % NUMBER_OF_PENTAGONALS_PER_LINE == 0) {
                System.out.printf("%7d\n", x);
            }
            else {
                System.out.printf("%7d", x);
           }
           number++;
        }
    }
    public static int getPentagonalNumber(int n) {
        int answer = (n* ((3 * n) - 1) / 2);
        return answer;
    }
}
