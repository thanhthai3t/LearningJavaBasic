
public class Application {
	public static void main(String[] args) {
		
		Factory factory1  = new Factory();
		
		factory1.build();
		factory1.design();
		
		
		
		Car car1 = new Car();
		
		car1.build();
		car1.design();
		car1.brand();
	}
}
