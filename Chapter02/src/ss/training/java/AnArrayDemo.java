package ss.training.java;

import java.lang.reflect.Field;

/**
 * This Program to illustrate how array elements are indexed. 
 * @author chethan
 *
 */
public class AnArrayDemo {
	
	public static void main(String[] args) {
			anOtherDemo();
//		   // create an array
//		   int[] age = {12, 4, 5, 2, 5};
//
//		   // access each array elements
//		   System.out.println("Accessing Elements of Array:");
//		   System.out.println("First Element: " + age[0]);
//		   System.out.println("Second Element: " + age[1]);
//		   System.out.println("Third Element: " + age[2]);
//		   System.out.println("Fourth Element: " + age[3]);
//		   System.out.println("Fifth Element: " + age[4]);
		 }
	
	private static void anOtherDemo() {
		float percent [] = new float[10];
		percent[0] = 10.5f;
		percent[9] = 55.75f;
		System.out.println(percent[0]);
		System.out.println(percent[9]);
		System.out.println(percent.length);
		
		
	}
	
	private static void an2DArrayDemo() throws SecurityException, ClassNotFoundException {
		
		int [] [] matrix = new int[2][2]; /*{{1,2},{3,4}}*/
		Field [] fileds = Class.forName("SomeClass").getDeclaredFields();
		
	}
	
	
	class Emp {
		private String name;
		private String addr;
		private String phone;
		
		
	}
}
