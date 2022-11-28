package com.capgemini.AbstractDemo;

public class ATMMachineExecutor {
//Driver Class
	public static void main(String[] args) {
		/*In Abstract Class we Can use Child Class on both Side of Object As Shone in 1 or We can use left hand side Abstract Class
		 * and Right had side Child Class As Shown in 2
		 */
		/*1*/ATMMachineChild a=new ATMMachineChild();
		/*2ATMMachine a=new ATMMachineChild();*/
		a.withdraw();
		a.Display();
		 

	}

}
