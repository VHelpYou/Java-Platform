package ss.training.java.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
	
	public static void main(String[] args) throws IOException {
		// Creating a file and reading from local repository
        FileReader file = new FileReader("/Users/chethan/Documents/TestFile.txt");
  
        // Reading content inside a file
        BufferedReader fileInput = new BufferedReader(file);
  
        // Printing first 3 lines of file "C:\test\a.txt"
        for (int counter = 0; counter < 3; counter++)
            System.out.println(fileInput.readLine());
  
        // Closing all file connections
        // using close() method
        // Good practice to avoid any memory leakage
        fileInput.close();
	}
}
