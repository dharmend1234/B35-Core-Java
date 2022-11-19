package com.capgemini.Conditional_StatementDemo;

import java.util.Scanner;
//else if Statement is used for Multiple Condition
//Such as Remark According to marks 

public class ElseIf_StatementDemo {
	public static void main(String args[]) {
		int Marks;
		System.out.println("Enter Your Marks :");
		Scanner s=new Scanner(System.in);
		Marks=s.nextInt();
		if(Marks<=100&&Marks>=70)
		{
			System.out.println("First Class");
		}
		else if(Marks<=69&&Marks>=50)
		{
			System.out.println("Second Class");
		}
		else if(Marks<=49&&Marks>=35)
		{
			System.out.println("Third Class");
		}
		else
		{
			System.out.println("Sorry You are Failed");
		}
		
		

	}		
}
