import java.util.Scanner;

public class GettingUserInput {
	public static void main(String[] args) {

		// The following is the the last lecture
		Scanner input = new Scanner(System.in);

		/*
		 * System.out.println("Enter text here: "); String text = input.nextLine();
		 * System.out.println("Your input is: " + text);
		 */
		int number = 1;
		do {
			System.out.println("Enter your number: " + number);
			number = input.nextInt();
		}

		while (number != 5);
		System.out.println("The loop has stopped!");

	}
}
