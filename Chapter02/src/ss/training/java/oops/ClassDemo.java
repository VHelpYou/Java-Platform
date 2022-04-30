package ss.training.java.oops;

public class ClassDemo {
	
	
	
	static {
		String name = null; 
		System.out.println("I am always First");
	}
	
	private String aSampleString = null;
	
	static int count;
	
	private void print() {
		aSampleString = aSampleString == null ? "passed empty": aSampleString;
		System.out.println("I am primting..., "+  aSampleString);
	}
	private void print(String wheretoPrint) {
		
	}
	
	public ClassDemo() {
		/**
		 * 
		 */
	}
	public ClassDemo(String aSampleString) {
		this.aSampleString = aSampleString;
	}
	
	public ClassDemo(ClassDemo obj) {
		this.aSampleString = obj.aSampleString;
	}
	/**
	 *  prop
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("Hey Hello!");
		ClassDemo aClassObj = new ClassDemo("SampleText");
		aClassObj.print();
		ClassDemo aClassObj2 = new ClassDemo();
		aClassObj2.print();
	}
	
	
}
