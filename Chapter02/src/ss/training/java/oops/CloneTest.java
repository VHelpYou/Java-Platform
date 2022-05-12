package ss.training.java.oops;

public class CloneTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		 StudentClonable student = new StudentClonable(12345,"Chethan");
		 System.out.println(student);
		 
		 StudentClonable chethanCloned = (StudentClonable) student.clone();
		 System.out.println("I am the copy of "+ chethanCloned);
	}
}
