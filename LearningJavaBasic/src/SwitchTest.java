import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your text:");
		String text = input.nextLine();

		switch (text) {
		case "run":
			System.out.println("The code is run!");
			break;
		case "stop":
			System.out.println("The code is stopped!");
			break;
		default:
			System.out.println("Keyword is not correct");

		}

	}
}
