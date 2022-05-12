package ss.training.java.oops;

public class StudentClonable implements Cloneable{
	int rollno;  
	String name;
	
	public StudentClonable(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}  
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	@Override
	public String toString() {
		String toString = "name : "+ this.name + "\t roolno: "+this.rollno;
		return toString;
	}
	
}
