package com.capgemini.logic;

import java.util.Scanner;

public class factorialvalue {

	public static void main(String[] args) {
		int a,b=1;
		System.out.println("Enter the number");
		Scanner s= new Scanner(System.in);
		a=s.nextInt();
		System.out.println("Factorial of "+a+" :");
		for(int i=1;i<=a;i++)
		{
			b*=i;
		}
		System.out.println(b);
	}

}
