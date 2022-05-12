package ss.training.java.multithreading.sync;

public class SyncDemo {
	
	public static void main(String args[])
    {
        Sender send = new Sender();
        MessageSenderThread S1 =
            new MessageSenderThread( " Hi " , send );
        MessageSenderThread S2 =
            new MessageSenderThread( " Hello " , send );
 
        // Start two threads of ThreadedSend type
        S1.start();
        S2.start();
 
        // wait for threads to end
        try
        {
            //S1.join();
            //S2.join();
        }
        catch(Exception e)
        {
            System.out.println("Interrupted");
        }
    }
	
}
