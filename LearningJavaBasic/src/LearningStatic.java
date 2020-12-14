class Student{
	
	//public static final int MY_CONSTANT = 8;
	
	public String name;
	public static String studentClass;
	public static int count = 0;
	public Student() {
		count++;
	}
	
	public void studentName() {
		
		System.out.println(name);
		System.out.println(name + " is called along with variable "+studentClass);
	}
	
	public static void classInfo() {
		
		
		System.out.println("Public Info");
		
		//static method can access static variable
		System.out.println(studentClass);
		
		//static method can not access non-static variable
		//System.out.println(name);
	} 
	
}


public class LearningStatic {
	public static void main(String[] args) {
		
		//how static works, no need to declare object
		
		System.out.println("Before creating object: " +Student.count);
		
		Student.studentClass = "Batman";
		
		
		
		Student student1 = new Student();
		Student student2 = new Student();
		
		
		System.out.println("After creating object: "+ Student.count);
		
		student1.name = "Peter Parker";
		student2.name = "Black Widow";
		
		Student.classInfo();
		
		//System.out.println(student1.name);
		//System.out.println(student2.name);
		System.out.println(Student.studentClass);
		
		//call method
		student1.studentName();
		student2.studentName();
		
		//class math can not declare variable
		System.out.println(Math.E);
		
		//System.out.println(Student.MY_CONSTANT);
		
	}
}
