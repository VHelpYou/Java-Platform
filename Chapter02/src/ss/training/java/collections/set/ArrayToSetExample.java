package ss.training.java.collections.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ArrayToSetExample {
	public static void main(String[] args) {

		String[] vowels = { "a", "e", "i", "o", "u" ,"e"};

		Set<String> vowelsSet = new HashSet<String>(Arrays.asList(vowels));
		System.out.println(vowelsSet);

		/**
		 * Unlike List, Set is NOt backed by array, so we can do structural modification
		 * without any issues.
		 */
		vowelsSet.remove("e");
		System.out.println(vowelsSet);
		vowelsSet.clear();
		System.out.println(vowelsSet);
	}
	
	
	public void Way2() {
		
		String[] vowels = { "a", "e", "i", "o", "u" };

		Set<String> vowelsSet = new HashSet<>();

		Collections.addAll(vowelsSet, vowels);

		System.out.println(vowelsSet);

		/**
		 * Unlike List, Set is NOt backed by array, so we can do structural modification
		 * without any issues.
		 */
		vowelsSet.remove("e");
		System.out.println(vowelsSet);
		vowelsSet.clear();
		System.out.println(vowelsSet);
	}
	
	
	public void Way3() {
		
		Set<String> vowelsSet = new HashSet<String>();

		// add example
		vowelsSet.add("a");
		vowelsSet.add("e");
		vowelsSet.add("i");
		vowelsSet.add("o");
		vowelsSet.add("u");

		// convert Set to Array
		String strArray[] = vowelsSet.toArray(new String[vowelsSet.size()]);
		System.out.println(Arrays.toString(strArray));
		
	}
	
	
}
