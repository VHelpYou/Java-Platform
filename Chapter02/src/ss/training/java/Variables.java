package ss.training.java;

public class Variables { /* Upper Camel casing*/
	   static int students = 15; /* lower case  instance */
	   
	   public static void main(String [] args) {
	      int teachers = 3;  /* Local Variable - visiable only to the block where it is decl*/
	      students = students + 25;
	      boolean isprogmOn = true;
	      String name = "Chethan"; 
	      char charA= 'A';
	      char charAa= 'a';
	      float pi = 3.14f;
	      int anArray [] = new int[10]; /* declaring empty array with the size*/
	      int intArray [] = {1,2,3}; /* declaring  array and  initializing the values */
	      
	     System.out.println("No of the Students : "+students);
	     System.out.println("No of the Teachers : "+teachers);
	   }

	   public void anOtherMethod() {
	     int localVar = 20; 
	     System.out.println("No of the Students : "+students);
	   }
	 }
