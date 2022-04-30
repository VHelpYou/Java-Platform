package ss.training.java.oops.aboutClass;

/**
 * 
 * The abstract class can also be used to provide 
 * some implementation of the interface.
 *  In such case, the end user may not be forced to override all the methods of the interface.
 * @author chethan
 *
 */
public class AbstactExample {
	public static void main(String args[]) {
		Shape s = new Circle1();// In a real scenario, object is provided through method, e.g., getShape()
								// method
		s.draw();
	}  
}


