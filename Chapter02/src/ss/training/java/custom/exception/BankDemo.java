package ss.training.java.custom.exception;

import java.util.Scanner;

public class BankDemo {

	   public static void main(String [] args) {
	      CheckingAccount c = new CheckingAccount(101);
	      System.out.println("Depositing $1000...");
	      c.deposit(1000.00);
	      
	      Scanner console = new Scanner(System.in);
	      int amount = 0;
	      while(true) {     
	    	  amount = console.nextInt();
	    	  try {
	 	         System.out.println("\nWithdrawing."+amount);
	 	         c.withdraw(amount);
	 	        
	 	      } catch (InsufficientFundsException e) {
	 	         System.out.println("Sorry, but you are short $" + e.getAmount());
	 	         e.printStackTrace();
	 	         break;
	 	      }
	      }
	      
	   }
	}
