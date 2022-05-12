package ss.training.java.exception;

public class UncheckedExceptions {
	public static void main(String[] args) {
		
		// Here we are dividing by 0
        // which will not be caught at compile time
        // as there is no mistake but caught at runtime
        // because it is mathematically incorrect
        int x = 0;
        int y = 10;
        int z = y / x;
        
        int a [] = new int [10];
        a[11] = 20; // ArrayIndex out of Bound exception
	}
}
