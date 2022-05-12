package ss.training.java.collections.set;

import java.util.HashSet;
import java.util.Set;
/**
 * 
 *  Set is an interface which extends Collection. It is an unordered collection of objects in which duplicate values cannot be stored.
 *	Basically, Set is implemented by HashSet, LinkedHashSet or TreeSet (sorted representation).
 *	Set has various methods to add, remove clear, size, etc to enhance the usage of this interface
 * @author chethan
 *
 */
public class SetExample {
	public static void main(String[] args) 
	{ 
		// Set demo using HashSet 
		Set<String> hash_Set = new HashSet<String>(); 
		
		hash_Set.add("GyanSetu"); 
		hash_Set.add("For"); 
		hash_Set.add("GyanSetu"); 
		hash_Set.add("Example"); 
		hash_Set.add("Set"); 
		
		System.out.print("Set output without the duplicates"); 

		System.out.println(hash_Set); 
		
		hash_Set.remove("Set");
		
		System.out.println(hash_Set);
	} 
}
