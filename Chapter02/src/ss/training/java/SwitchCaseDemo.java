package ss.training.java;

public class SwitchCaseDemo {
	
	public static void main(String[] args) {
		
		String color = "red"; 
		int a = 5;
		switch (color) {
		case "red": {	
			System.out.println("Entering the case 1");
			break;
		}
		case "Blue": {
			System.out.println("Entering the case 2");
			break;
		}
		case "Green": {
			System.out.println("Entering the case 3");
			break;
		}
		default:
			System.out.println("None of teh cases are Matched !!");
		}
	}
	
	
}
