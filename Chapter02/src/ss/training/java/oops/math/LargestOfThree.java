package ss.training.java.oops.math;

public class LargestOfThree /* extends java.lang.Object*/{
	
	private int a;
	private int b;
	private int c;
	
	public LargestOfThree() {
		this.a = 100;
		this.b = 200;
		this.c = 300;
	}
	/**
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */
	public LargestOfThree(int a, int b, int c) {
		//super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int getmeTheLargest() {
		int result = 0;
		if(a > b && a > c) {
			result =  a;
		} 
		if(b > a && b > c) {
			result =  b;
		}
		
		if(c > a && c > b) {
			result =  c;
		}
		return result;
	}
}
