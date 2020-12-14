class Methods {

	String name;
	int value;
	int month;

	void run() {
		System.out.println("Start running!");
		for (int i = 0; i < value; i++) {
			System.out.println("My " + name + " is getting older than previous one by " + i + " year(s)");
		}

	}
	
	int calculateMonthToBirthday() {
		int monthLeft = 12 - month;
		return monthLeft;
	}
	
	void talk(String text) {
		System.out.println(text);
		
	}
	
	void spend(int money) {
		System.out.println("My total spend this month is $"+ money);
	}
	
	void remain(int integer, double charge) {
		System.out.println("My remain money is $"+ integer + " and "+ charge +" cent(s)");
	}
}

public class Objects {
	public static void main(String[] args) {
		Methods older = new Methods();
		older.name = "computer";
		older.value = 3;
		//older.run();
		older.month = 3;
		int monthLeft = older.calculateMonthToBirthday();
		System.out.println("My birthday is still in " + monthLeft +" month(s) left");
		older.talk("haha");
		older.spend(1000);
		older.remain(50, 5.24);
		String hello = "new text!";
		older.talk(hello);

	}
}
