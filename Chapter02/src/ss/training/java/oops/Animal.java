package ss.training.java.oops;

class Animal {
	
	void eat() {
		System.out.println("eating...");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("barking...");
	}
	
	void isAlive() {
		super.eat();
		bark();
	}
	
	
}

class BabyDog extends Animal {
	
	@Override
	void eat() {
		System.out.println("Drinking...");
	}
	
	void makeNoice( ) {
		System.out.println("Woff....");
	}
}

class TestInheritance {
	public static void main(String args[]) {
		
		/*
		 * Dog d = new Dog(); d.bark(); d.eat();
		 */
		Animal dog = new BabyDog();
		dog.eat();
		BabyDog babyDog = new BabyDog();
		babyDog.makeNoice();
		
	}
}




