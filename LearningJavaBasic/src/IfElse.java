
public class IfElse {
	public static void main(StringTest[] args) {

		int amount = 10;

		if (amount != 10) {
			System.out.println("That's correct!");

		} else if (amount > 30) {
			System.out.println("It's still wrong!");
		}
		
		else {
			System.out.println("None of them!");
		}
		
		//combine with loop
		
		while(true) {
			System.out.println("In the loop! " + amount);
			
			if(amount == 15) {
				break;
			}
			
			amount++;
			System.out.println("Out of the loop! " +amount);
		}

	}
}
