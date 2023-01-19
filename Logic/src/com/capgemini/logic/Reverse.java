package com.capgemini.logic;

import java.util.Scanner;

public class Reverse {
	public static void main(String args[])
	{
		int a;
		int remain;
		System.out.println("Enter the number :");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		while(a>0)
		{
			remain=a%10;
			a=a/10;
			System.out.print(remain);
			
			
			
		}
		
		
				
	}

}
