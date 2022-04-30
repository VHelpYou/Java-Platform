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
}


