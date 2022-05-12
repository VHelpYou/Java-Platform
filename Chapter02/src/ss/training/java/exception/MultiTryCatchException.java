package ss.training.java.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MultiTryCatchException {
	
	private int readFile() {
		String fileName = "input.txt";
		byte [] bytes = new byte[1024]; 
		FileInputStream file = null;
		//try block
		try {
			   file = new FileInputStream(fileName);
			   byte x = (byte) file.read();
			   int counter = 0;
			   while(x != -1) {
				   bytes[counter] = x;
				   counter++;
				   if(counter > 1024) {
					   writeFile(bytes);
					   counter = 0;
					   bytes = new byte[1024];
				   }
			   }
			} catch (FileNotFoundException f)  {
				f.printStackTrace();
				   return -1;
			}catch (IOException i) {
			   i.printStackTrace();
			   return -1;
			} 
		finally {
				try {
					file.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		return 1;		   
	}
	
	private void writeFile(byte [] bytes) {
		
		String fineName = "output.txt";
		FileOutputStream fos = null;
		try {
			 fos = new FileOutputStream(fineName );
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fos.write(bytes);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
