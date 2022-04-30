package ss.training.java.oops;

public class Employee {
	private String name;
	private int salary;
	//private Bonus bonuComp;
	public Employee() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int calSalary( ) {
		return salary * 100;
	}
	
}
