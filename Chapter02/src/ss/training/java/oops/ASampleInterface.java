package ss.training.java.oops;

public interface ASampleInterface {
	double pi = 3.14;
	public void amethod();
	public void AnotherMethod();
	public void calcArea();
	
}

interface Interface2
{
	public void m4();
}

class Implementor2 implements ASampleInterface, Interface2 {

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void amethod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AnotherMethod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		
	}
	
}

class Implementor1 implements ASampleInterface {

	@Override
	public void amethod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AnotherMethod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		
	}
	
}