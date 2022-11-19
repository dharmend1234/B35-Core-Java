package com.capgemini.Conditional_StatementDemo;

import java.util.Scanner;
//if statement is used for Two Statement

public class IfElse_StatementDemo {
	public static void main(String args[]) {
		int age;
		System.out.println("Enter the Age :");
		Scanner s=new Scanner(System.in);
		age=s.nextInt();
		if(age>=18)
		{
			System.out.println("Congratulations You are Elegible For VOTE ");	
		}
		else
		{
		System.out.println("You are not Elegible For VOTE ");
		}
		s.close();
	}		
		

}
