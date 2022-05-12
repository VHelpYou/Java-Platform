package ss.training.java.multithreading.sync;

public class PCTest {
	public static void main(String[] args) throws InterruptedException {
		
		Product mySampleProduct = new Product(5);
		ProdConsExample pc = new ProdConsExample(mySampleProduct);
		Thread producer = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					pc.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
		});
		
		Thread consumer = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					pc.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
	producer.start();
	consumer.start();
	
	producer.join();
	consumer.join();
	}
	
}
