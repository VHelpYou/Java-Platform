package ss.training.java.oops.aboutClass;

public class AbstarctConstructorDemo {

}

abstract class Car {
	/**
	 * Is it Strange We can't instantiate the abstract class 
	 * then why we need the constructor ?? 
	 */
	Car() {
		System.out.println("A car is Created !!");
	}
	
	abstract void run();
	
}

class Camry extends Car {

	@Override
	void run() {
		System.out.println(" Carmry Run's ... !");
		
	}

	
	public static void main(String[] args) {
		//Car c =  new Car();
		
	}
	
}

