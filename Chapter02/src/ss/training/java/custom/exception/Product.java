package ss.training.java.custom.exception;

public class Product {
	
	void productCheck(int weight) throws InvalidProductException {
		if (weight < 100) {
			throw new InvalidProductException("Product Invalid");
		}
	}
	
}
