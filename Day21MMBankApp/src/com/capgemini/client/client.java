package com.capgemini.client;

import com.capgemini.application.MMBankFactory;
import com.capgemini.application.MMCurrentAcc;
import com.capgemini.application.MMSavingAcc;
import com.capgemini.framework.BankFactory;
import com.capgemini.framework.CurrentAcc;
import com.capgemini.framework.SavingAcc;

class client{
	public static void main(String args[])
	{
	
		BankFactory b =new MMBankFactory();
		SavingAcc s= new MMSavingAcc(85639456,"Pooja Patil", 30000, true);
		CurrentAcc c = new MMCurrentAcc(856936547,"Dharmendra Vaishya", 30000,10000);
		
		System.out.println("Saving Account");
		s.withdraw(s.getAccBal());
		
		System.out.println();
		
		System.out.println("Current Account");
		c.withdraw(c.getAccBal());
		
		System.out.println();
		
	    System.out.println(s);
	    System.out.println(c);
	    
	   
	}  
} 