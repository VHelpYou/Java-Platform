package ss.training.java.custom.exception;

public class CustomExceptionCheck {
	
	public static void main(String args[])
    {
		Product obj = new Product();
        try
        {
            obj.productCheck(60);
        }
        catch (InvalidProductException ex)
        {
            System.out.println("Caught the exception");
            System.out.println(ex.getMessage());
        }
    }
	
}
