package ss.training.java.oops.Inheritance;

public class Teacher {
	String designation = "Teacher";
	String college = "Beginnersbook";

	void does() {
		System.out.println("Teaching");
	}
}

	class MathTeacher extends Teacher {
		String mainSubject = "Maths";

		public static void main(String args[]) {
			MathTeacher obj = new MathTeacher();
			System.out.println(obj.college);
			System.out.println(obj.designation);
			System.out.println(obj.mainSubject);
			obj.does();
		}
	}
