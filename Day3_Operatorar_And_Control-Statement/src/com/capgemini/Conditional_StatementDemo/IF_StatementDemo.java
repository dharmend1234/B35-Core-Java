package com.capgemini.Conditional_StatementDemo;

import java.util.Scanner;
//if statement is used for single Statement

public class IF_StatementDemo {
	public static void main(String args[]) {
		int pwd;
		System.out.println("Enter the Password :");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==1234);
		{
			System.out.println("Welcome Dharmendra ");
		}
		s.close();
		
	}
}
