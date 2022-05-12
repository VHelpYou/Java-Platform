package ss.training.java.custom.exception;

import java.io.FileNotFoundException;

public class Caller {
	
	public static void main(String[] args) {
			
		CustomChinException testObj = new CustomChinException();
		try {
			testObj.readFile();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
}
