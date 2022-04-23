package ss.training.java;

public class OperatorsExample {
	
	public OperatorsExample() {
		super();
	}
	public static void main(String[] args) {
		
		//testUnaryOperators();
		//booleanAndNegation();
		//demoInstaceOf();
		//testLogicalBitOperators();
		explainDiffBitShifting();
		/*
		 * // testUnaryOperatorNegation(); // testArithmeticOperatorNegation(); //
		 * testArithmeticShiftOperators(); // explainDiffBitShifting();
		 */		 
	}
	private static void booleanAndNegation() {
		boolean isTrue = false;
		System.out.println(isTrue);
		System.out.println(!isTrue);
		int a = 100;
		//System.out.println(!a); only on to boolean operand 
		
	}
	private static void testUnaryOperators( ) {
		int x=10;  
		System.out.println(x++);//10 (11)  	--->	x + 1;
		System.out.println(++x);//12       	--->	x = x + 1
		System.out.println(x--);//12 (11)  ---->	x - 1;
		System.out.println(--x);//10  	   ---->	x = x - 1;
		
		int a=10;  
		int b=10; 
		/**
		 * 1. a + 1;
		 * 2. a = a+1;
		 * 3. value of a is 12
		 * 4. 10 + 12 = 22
		 */
		System.out.println(a++ + ++a);//10 + 12=22 
		System.out.println(b++ + b++);//10+11=21  
		
	}
	
	private static void testUnaryOperatorNegation() {
		byte a= 10;  
		byte b=-10;  
		
		boolean c=true;  
		boolean d=false; 
		/**
		 * Just reverse the value ( negate the value )
		 * negate all the bits of the number 
		 * ~x = (-x) - 1 
		 */
		System.out.println(~a);//-11    
		System.out.println(~b);//9   
		System.out.println(!c);//false   
		System.out.println(!d);//true  
	}
	
	private static void testArithmeticOperatorNegation() {
		byte a= 100;  
		byte b=-10;  
		
		System.out.println(a+b);//15  
		System.out.println(a-b);//5  
		System.out.println(a*b);//50  
		System.out.println(a/b);//2  
		/**
		 * Only one you need to  remember is module 
		 *   a mod b -> rem of a / b 
		 */
		System.out.println(a%b);//0  
		
		/**
		 * Example for operator precedence 
		 *   => / takes more precedence then * then + / -.
		 */
		int x=0; int y = 0;
		x = x + y;
		
		System.out.println(10*10/5+3-1*4/2); 
		
	}
	
	private static void testArithmeticShiftOperators() {
		int number = 2;
		// 2 bit left shift operation
		int Ans = number << 2;
		System.out.println(number + "bit left shift (<<)" + Ans);

		number = 8;
		// 2 bit signed right shift
		Ans = number >> 2;
		System.out.println(number + "bit right shift (>>)" + Ans);

		byte num1 = 8;
		byte num2 = -8;

		System.out.println(num1 >>> 2);
		System.out.println(num2 >>> 2);
		
		/**
		 * There is no unsigned Left shift operator 
		 */
	}
	
	private static void explainDiffBitShifting() {
		int n = 24;
		System.out.println(n >> 1);
		System.out.println(n << 1);
		
		/* value is 12 and 48 */
		n = -24;
		System.out.println("------- Negative Number -----------");
		System.out.println(n >> 1);
		System.out.println(n << 1);
		
		
		n = 25;
		System.out.println(n >> 2);
		System.out.println(n << 2);
		
		/* value is 12 and 48 */
		n = -25;
		System.out.println("------- Negative Number -----------");
		System.out.println(n >> 2);
		System.out.println(n << 2);
		/**
		 * Shifting including sign bit 
		 */
		System.out.println(n >>> 1);
		
	}
	
	
	static class Car {
		private String name;
		private int geers;
		public Car(String name, int geers) {
			this.geers = geers;
			this.name = name;
		}
	}
	
	private static void demoInstaceOf() {
		Car aCar = new Car("My Telsa", 4);
		Object theFalseCar = new Object();
		System.out.println(aCar instanceof Car);
		System.out.println(theFalseCar instanceof Car);
	}
	
	private static void testLogicalOperators() {
		boolean a = true;
		boolean b = false;
		boolean res = 10 < 5;
		boolean com = a && b && res;
		
	}
	
	private static void testLogicalBitOperators() {
		int a =8;
		int b = 4;
		System.out.println(a & b);
		
	}
}
