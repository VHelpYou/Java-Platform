package ss.training.java.multithreading;

public class TestThread {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello I am the Main Thread !!");
		MultithreadingDemo thread1 = new MultithreadingDemo();
		thread1.start();
		//thread1.run();// No more 
		System.out.println("starting The Runnable Thread !!");
		RunnableIDemon thread2 = new RunnableIDemon();
		//thread2.run();
		Thread t2 = new Thread(thread2);
		
		thread1.join();
		t2.join();
		System.out.println("End of Main Thread");
	}
}
