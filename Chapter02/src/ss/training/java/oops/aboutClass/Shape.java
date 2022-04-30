package ss.training.java.oops.aboutClass;

abstract public class Shape {
	abstract void draw();
}

/**
 * Implementation Classes 
 * @author chethan
 *
 */
class Rectangle extends Shape {
	void draw() {
		System.out.println("drawing rectangle");
	}
}

class Circle1 extends Shape {
	void draw() {
		System.out.println("drawing circle");
	}
}
