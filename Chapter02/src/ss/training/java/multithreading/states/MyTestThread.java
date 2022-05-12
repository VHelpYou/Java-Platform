package ss.training.java.multithreading.states;

public class MyTestThread extends Thread{
	@Override
	public void run() {
		
		// moving thread to timed waiting state
        try {
            Thread.sleep(1500);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        try {
            Thread.sleep(200);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        
	}
}
