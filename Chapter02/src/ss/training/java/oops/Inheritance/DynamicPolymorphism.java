package ss.training.java.oops.Inheritance;
/**
 * This is also Callled as Runtime  Polymorphism
 * @author chethan
 *
 */
public class DynamicPolymorphism {
	
	public static void main(String args[]){
		Animal obj = new Dog();
		Animal objectDyn = new Cat();
		obj.animalSound();
		objectDyn.animalSound();
		
	   }
	
	
	
	
	
	
}


