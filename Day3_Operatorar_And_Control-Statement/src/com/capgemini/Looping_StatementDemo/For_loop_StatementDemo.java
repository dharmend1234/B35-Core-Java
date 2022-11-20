package com.capgemini.Looping_StatementDemo;
//WhatEver we want to repeat certain statement Saveral times then we should write write those Statements inside the loop body
//here it will print the table of number which we required to print
import java.util.Scanner;

public class For_loop_StatementDemo {
	public static void main(String args[]) {
		int a;
		System.out.println("Enter number :");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		for(int i=1;i<=10;i++)             //first initialized variable then verify condition then increment loop performed
		{
			System.out.println(a*i);
		}
		
		s.close();	
	}

}
