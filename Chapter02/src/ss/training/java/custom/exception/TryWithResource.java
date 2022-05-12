package ss.training.java.custom.exception;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {
    static String absolutePath;
	
	static {
		String directory = System.getProperty("user.home");
		String fileName = "sample.txt";
		absolutePath = directory + File.separator + fileName;
	}
	
	private void writeFile() {
		try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(absolutePath))) {
		    String fileContent = "This is a sample text.";
		    bufferedWriter.write(fileContent);
		} catch (IOException e) {
		    // Exception handling
			/* close method */
		}
	}
	
	private void readFile() {
		
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(absolutePath))) {
		    String line = bufferedReader.readLine();
		    while(line != null) {
		        System.out.println(line);
		        line = bufferedReader.readLine();
		    }
		} catch (FileNotFoundException e) {
		    // Exception handling
			/* close method */
		} catch (IOException e) {
		    // Exception handling
			/* close method */
		}
		
	}
	
}
