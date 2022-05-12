package ss.training.java.custom.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CustomChinException {
	
	public void readFile() throws FileNotFoundException {
		FileInputStream fin = new FileInputStream("sample.txt");
	}
	
}
