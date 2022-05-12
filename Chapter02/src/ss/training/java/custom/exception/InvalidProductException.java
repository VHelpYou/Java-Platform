package ss.training.java.custom.exception;

public class InvalidProductException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 * @param s is amount asked to be withdraw
	 */
	public InvalidProductException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
	
}
