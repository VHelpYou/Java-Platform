package ss.training.java.custom.exception;

public class DemoException {
	
	
	public static void main(String[] args) {
		DemoException obj = new DemoException();
		obj.testException();
	}
	
	
	private void testException() {
		int [] a = {1, 2, 4};
		try {
			a[5] = 10;  // file 2GB disk
			System.out.println("inside Try");
		}catch (Exception e) {
			System.out.println(e);
			System.out.println("After Exception"+a[5]);
		} 
		finally {
			System.out.println("This is Finally Block exception");
		}
			 
		System.out.println("After Exception"+a[1]);
	}
}
