class Program {
	
	int value;
	String text;
	
	public Program() {
		this(51);
		System.out.println("First constructor");
		
		value = 12;
	}
	
	
	public Program(int value) {
		this.value = value;
		System.out.println("Second constructor");
	}
	
	public Program(String text, int value) {		
		this();
		this.value = value;
		this.text = text;
		System.out.println("Third constructor");
	}
}


public class Constructors {
	public static void main(String[] args) {
		
		Program myProgram = new Program();
		Program myProgram1 = new Program(5);
		Program myProgram2 = new Program("text",10);
		
	}
}
