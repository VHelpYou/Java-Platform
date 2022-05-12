package ss.training.java.multithreading;

public class MultithreadingDemo extends Thread {
	
	@Override
    public void run()
    {
        try {
            // Displaying the thread that is running
            System.out.println(
                "Thread Created Using Thread Class" + Thread.currentThread().getId()
                + " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
    
    
}
