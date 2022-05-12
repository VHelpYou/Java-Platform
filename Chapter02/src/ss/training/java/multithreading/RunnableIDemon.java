package ss.training.java.multithreading;

public class RunnableIDemon implements Runnable {
	
    public void run()
    {
        try {
            // Displaying the thread that is running
            System.out.println(
                "Thread Created by Implementing Runnable" + Thread.currentThread().getId()
                + " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}
