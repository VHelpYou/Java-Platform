package ss.training.java.multithreading.sync;

public class Sender {
	 public  synchronized  void send(String msg)
	    {
	        System.out.println("Sending\t"  + msg );
	        try
	        {
	            Thread.sleep(5000);
	        }
	        catch (Exception e)
	        {
	            System.out.println("Thread  interrupted.");
	        }
	        System.out.println("\n" + msg + "Sent");
	    }
	 
	 /**
	  * synchronized block
	  * @param msg
	  */
	 public void sendAnOtherWay(String msg)
	   {
	       synchronized(this)
	       {
	           System.out.println("Sending\t" + msg );
	           try  
	           {
	               Thread.sleep(1000);
	           }  
	           catch (Exception e)  
	           {
	               System.out.println("Thread interrupted.");
	           }
	           System.out.println("\n" + msg + "Sent");
	       }
	   }
}
