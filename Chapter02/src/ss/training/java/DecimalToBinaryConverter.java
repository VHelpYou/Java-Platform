package ss.training.java;

import java.util.Scanner;

 public class DecimalToBinaryConverter {
	
	public static void main(String[] args) {
		int input = readInputFromConsole();
		printBinary(input);
	}


	private static void printBinary(int input) {
		String result = "";
		int quo = 0 ;
		int rem ;
		/**
		 * use While loop or Do while Loop 
		 * to complete the operations
		 */
		while (input >= 2) {
			quo = input/2;
			
			rem = input % 2;
			
			input = quo;
			
			result += " "+rem;
		}
		
		result += " "+quo;
		
		//System.out.println(result);
		
		/**
		 * convert the String as charector array
		 */
		char [] binary = result.toCharArray();
		/**
		 * use the for loop to print the string in reverse 
		 */
		for(int i = binary.length-1; i>0; i--) {
			System.out.print(binary[i]);
		}
	}

	private static int readInputFromConsole() {
		 Scanner console = new Scanner(System.in);
		 System.out.println("Enter the Number ");
		 return console.nextInt();
	}
	

}
