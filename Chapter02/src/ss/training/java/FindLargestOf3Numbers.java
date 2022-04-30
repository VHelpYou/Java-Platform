package ss.training.java;

import java.util.Scanner;
/**
 * 
 * Find the given number is Even Or Odd
 * Find the given set of Strings has more than Length 20
 * @author chethan
 *
 */
public class FindLargestOf3Numbers {
	public static void main(String[] args) {
		 Scanner console = new Scanner(System.in);
		 System.out.println("Enter the Input 1");
		 int a = console.nextInt();
		 System.out.println("Enter the Input 2");
		 int b = console.nextInt();
		 System.out.println("Enter the Input 3");
		 int c = console.nextInt();
		 
		
		if(a > b) {
			if( a > c) {
				System.out.println(a +" is a Largest among the given Three");
			} else {
				System.out.println(c + " is a Largest among the given Three");
			}
		} else {
			if( b > c) {
				System.out.println(b +" is a Largest among the given Three");
			} else {
				System.out.println(c + " is a Largest among the given Three");
			}
		}
		System.out.println("--------- By another way -----------");
		findLargestUsingLogicalOper(a,b,c);
	}
	
	private static void findLargestUsingLogicalOper(int a, int b, int c) {
		if(a > b && a > c) {
			System.out.println(a +" is a Largest among the given Three");
		} 
		if(b > a && b > c) {
			System.out.println(b +" is a Largest among the given Three");
		}
		
		if(c > a && c > b) {
			System.out.println(c +" is a Largest among the given Three");
		}
	}
	
}
