package com.capgemini.logic;

import java.util.Scanner;

public class oddeven {
	public static void main(String args[]) {
		int a;
		System.out.println("Enter the number :");
		Scanner s =new Scanner (System.in);
		a=s.nextInt();
		if(a%2==0)
		{
			System.out.println(+a+" "+"is a Even Number ");
		}
		else 
		{
			System.out.println(+a+" "+"is a Odd Number ");
		}
	}

}
