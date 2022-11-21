package com.capgemini.Jumping_StatementDemo;

import java.util.Scanner;

public class Break_StatementDemo {
	public static void main(String args[]) {
		int a;
		System.out.println("Enter number :");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		while(a==1234)             //first initialized variable then verify condition then increment loop performed
		{
			System.out.println("Welcome");
			break;                 //it is used to break the Loop
		}
}
}