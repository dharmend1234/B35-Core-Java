package com.capgemini.Jumping_StatementDemo;

import java.util.Scanner;

public class Continue_StatementDemo {
	public static void main(String args[]) {
		int a;
		System.out.println("Enter number :");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		for(int i=1;i<=10;i++)             //first initialized variable then verify condition then increment loop performed
		{
			if(i==6)
			{
				continue;
			}
			System.out.println(a*i);
		}
		
		s.close();
}
}
