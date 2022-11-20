package com.capgemini.Looping_StatementDemo;

import java.util.Scanner;

public class While_loop_StatementDemo {
	public static void main(String args[]) {
		int a;
		System.out.println("Enter number :");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		while(a==1234)             //first initialized variable then verify condition then increment loop performed
		{
			System.out.println("Welcome");
			break;
		}
	}

}
