package com.capgemini.Looping_StatementDemo;

import java.util.Scanner;

public class Do_While_Loop_StatementDemo {
	public static void main(String args[]) {
		int a;
		System.out.println("Enter number :");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		do 
		{
			System.out.println(a);
			a++;
		}
		while(a<=10);
		
	}

}
