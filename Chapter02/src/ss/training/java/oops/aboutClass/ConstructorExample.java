package ss.training.java.oops.aboutClass;

public class ConstructorExample {

	int age;
	String name;

	// Default constructor
	ConstructorExample() {
		this.name = "Chethan";
		this.age = 35;
	}

	// Parameterized constructor
	ConstructorExample(String n, int a) {
		this.name = n;
		this.age = a;
	}

	public static void main(String args[]) {
		ConstructorExample obj1 = new ConstructorExample();
		ConstructorExample obj2 = new ConstructorExample("Steve", 56);
		System.out.println(obj1.name + " " + obj1.age);
		System.out.println(obj2.name + " " + obj2.age);
	}
	
	/**
	 *  A constructor can not be marked as static in Java
	 */
	/*
	 * public static ConstructorExample() { This will not compile
	 * 
	 * }
	 * Why ?? 
	 * To understand More Constructor Chaining..
	 */
	
}
