package ss.training.java.oops;
/**
 * It is also called as Compile time Polymorphism 
 * @author chethan
 *
 */
public class StaticPolymorphism {
	public static void main(String args[])
	   {
	       DisplayOverloading obj = new DisplayOverloading();
	       obj.disp('a');
	       obj.disp('a',10);
	   }
	
	class Calc {
		
		int add(int a, int b) {
			return a + b;
		}
		
		double add(double d1, double d2) {
			return d1 + d2;
		}
		
		
	}
}


