import java.util.Scanner;
/** Based on Super Class in Listing 11.10 */

public class ImplementMyStack {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MyStack Stack = new MyStack();
                System.out.println("Enter five strings: ");
		for (int i = 0; i < 5; i++) {
                    Stack.push(input.next());
		}
                while (!Stack.isEmpty())
		System.out.print(Stack.pop() + " ");
		System.out.println();
        }
}
