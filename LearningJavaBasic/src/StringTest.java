
public class StringTest {

	public static void main(StringTest[] args) {
		
		int aNumber = 100;
		double aDouble = 15.24;
		String text = "Hi";
		String blank = " ";
		String moreText = "there";
		String textCombine = text + blank + moreText;
		
		System.out.println(text);
		System.out.println(text + blank + moreText);
		System.out.println(text + " " + moreText);
		System.out.println(textCombine);
		System.out.println("My number: " + aNumber + " , " + aDouble);
		
	}
	
}
