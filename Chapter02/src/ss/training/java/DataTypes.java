package ss.training.java;
/**
 * 
 * @author chethan
 *
 */
public class DataTypes {
	
	public static void main(String[] args) {
		String name ="SS";
		short smallNum = 200;
		int books = 4765893;
		boolean isSwitchOn = false;
		byte byteVal = (byte)smallNum;
		float flotingNum = 12.5f;
		double dNum = 475673468;
		int a [] = {1,2,3};
		char [] charArray = {'C','H','A','R'};
		
		System.out.println("smallNum: "+smallNum);
		System.out.println("books: "+books);
		System.out.println("isSwitchOn: "+isSwitchOn);
		System.out.println("flotingNum: "+flotingNum);
		System.out.println("byteVal: "+byteVal);
		System.out.println("dNum: "+dNum);
		System.out.println("----------------");
		System.out.println("Array-A: "+a);
		System.out.println("Name: "+name);
		
		System.out.print("[");
		for (int i : a) {
				System.out.print(i + " ");	
		}
		System.out.print("]");
		System.out.println();
		System.out.print("[");
		
		for (char c : charArray) {
			System.out.print(c+ " ");	
		}
		System.out.print("]");
	}
}
