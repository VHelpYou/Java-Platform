package ss.training.java.oops.math;

public class Runner {
	
	public static void main(String[] args) {
		
		LargestOfThree mathObj = new LargestOfThree(10, 20, 30); 
		System.out.println(mathObj.getmeTheLargest());
		
		LargestOfThree mathObj2 = new LargestOfThree();
		System.out.println(mathObj2.getmeTheLargest());
		
	}
}
