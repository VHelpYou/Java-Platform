package ss.training.java.multithreading.sync;

public class ProdConsExample {
	
	Product product;
	
	ProdConsExample(Product product) {
		this.product = product;
	}
	
	public void produce() throws InterruptedException{
		int value = 0;
		 while (true) {
			 synchronized (this) {
				 while(product.getProductList().size() == product.getProductCapcity())
					 wait();
				 System.out.println("Producer produced-"
                         + value++);
				 product.getProductList().add(value);
				 notify();
				 Thread.sleep(1000);
			 }
			 
		 }
	}
	
	public void consume() throws InterruptedException{
		while (true) {
			 synchronized (this) {
				 while(product.getProductList().size() == 0)
					 wait();
                 int val =  product.getProductList().removeFirst();
                 
                 System.out.println("Consumer consumed-"
                         + val);
                 notify();

                 Thread.sleep(1000);
			 }
		}
	}
}
