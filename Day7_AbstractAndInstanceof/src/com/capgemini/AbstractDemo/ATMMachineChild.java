package com.capgemini.AbstractDemo;

public class ATMMachineChild extends ATMMachine {

	//provided the implementation to abstract method of parent class
	@Override
	void withdraw() {
		int balance=5000;
		System.out.println("Withdrawing Amount is: "+balance);
		
	}
	

}
