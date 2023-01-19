package com.capgemini.logic;

import java.util.Scanner;

public class positivetable {

	public static void main(String[] args) {
		int a;
		System.out.println("Enter the number");
		Scanner s= new Scanner(System.in);
		a=s.nextInt();
		System.out.println("Table of "+a+" :");
		if(a>=0)
		{
			for(int i = 1;i<=10;i++)
			{
				System.out.println(a*i);
			}
		}
		
	}

}
