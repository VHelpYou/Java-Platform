package ss.training.java;

public class DemoLoop {
	static int [] atestArry = null;

	
	public static void main(String[] args) {
		//printUsingWhile();
		//printUsingDoWhile();
		//printUsingFor();
		//infinateLoop();
		demoContinueLoop();
	}

	private static void printUsingFor() {
		int i = 0;
		System.out.println();
		while(atestArry != null && i < atestArry.length) {
			System.out.print(atestArry[i] +" ");
			i++;
		}
		
		
	}

	private static void printUsingDoWhile() {
		System.out.println();
		int i =0;
		do {
			System.out.print(atestArry[i] +" ");
			i++;
		}while(atestArry != null && i < atestArry.length);
		
	}

	private static void printUsingWhile() {
		System.out.println();
		for(int i = 0 ; i < atestArry.length; i ++) {
			System.out.print(atestArry[i]+" ");
		}
		
	}
	
	private static void infinateLoop() {
		int i = 0;
		while(true) {
			
			if(i == 2)
				break;
			i++;
			System.out.println("I am in the loop");
		}
	}
	
	private static void demoContinueLoop() {
		int i = 0;
		while(i < 10) {
			i++;
			
			if(i == 4)
				continue;
			
			System.out.println(i);
		}
	}
	
}
