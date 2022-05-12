package ss.training.java.collections;

import java.util.LinkedList;

public class LinkedListExampleOps {
	public static void main(String[] args) {

		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		linkedList.add(23);
		linkedList.add(24);
		linkedList.add(25);
		linkedList.add(28);
		linkedList.add(29);

		System.out.println("Linked list before offer(someInt) ");
		System.out.println(linkedList);
		System.out.println("element offered " + linkedList.offer(30));
		System.out.println("Linked list after offer(someInt) ");
		System.out.println(linkedList);

		System.out.println("Linked list before offerFirst(someInt) ");
		System.out.println(linkedList);
		System.out.println("element offered " + linkedList.offerFirst(31));
		System.out.println("Linked list after offerFirst(someInt) ");
		System.out.println(linkedList);

		System.out.println("Linked list before offerLast(someInt) ");
		System.out.println(linkedList);
		System.out.println("element offered " + linkedList.offerLast(32));
		System.out.println("Linked list after offerLast(someInt) ");
		System.out.println(linkedList);

	}
}
