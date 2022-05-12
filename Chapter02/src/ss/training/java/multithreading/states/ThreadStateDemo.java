package ss.training.java.multithreading.states;

public class ThreadStateDemo {
	
	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		
		MyTestThread thread1 = new MyTestThread();
		
		// thread1 created and is currently in the NEW
        // state.
        System.out.println(
            "State of thread1 after creating it - "
            + thread1.getState());
        thread1.start();
 
        // thread1 moved to Runnable state
        System.out.println(
            "State of thread1 after calling .start() method on it - "
            + thread1.getState());
        
		MyTestRunnableThread myrunnableThread = new MyTestRunnableThread(thread1);
		Thread thread2 = new Thread(myrunnableThread);
		
		// thread2 created and is currently in the NEW
        // state.
        System.out.println(
            "State of thread2 after creating it - "
            + thread2.getState());
        thread2.start();
 
        // thread2 moved to Runnable state
        System.out.println(
            "State of thread2 after calling .start() method on it - "
            + thread2.getState());
        
        try {
        	
        	 // thread2 moved to Runnable state
            System.out.println(
                "State of thread2 after calling .join() method on it - "
                + thread1.getState());
            
        	thread1.join();
            thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        // thread1 must be moved to terminated State
        System.out.println(
            "State of thread1 after Complete Execution - "
            + thread1.getState());
	}
}
