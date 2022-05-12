package ss.training.java.collections.examples.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
	
	public static void main(String[] args) {
		ArrayList<String> coutryList = new ArrayList<String>();

		coutryList.add("India");
		coutryList.add("Pakistan");
		coutryList.add("Sri Lanka");
		coutryList.add("Dubai");

		// Iterator to traverse the list
		Iterator iterator = coutryList.iterator();

		System.out.println("Countries : ");

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ,");
		}

		System.out.println(coutryList);
		

		

	}
}
