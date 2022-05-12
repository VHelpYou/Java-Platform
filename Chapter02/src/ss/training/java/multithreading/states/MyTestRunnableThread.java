package ss.training.java.multithreading.states;

public class MyTestRunnableThread implements Runnable{
	
	private MyTestThread myThread;
	public MyTestRunnableThread(MyTestThread myThread) {
		this.myThread = myThread;
	}
	
	@Override
	public void run() {
		
		try {
            // moving thread1 to timed waiting state
            Thread.sleep(200);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		System.out.println(
	            "State of MyTestThread after calling .sleep() method on it - "
	            + myThread.getState());
		
		try {
			myThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
