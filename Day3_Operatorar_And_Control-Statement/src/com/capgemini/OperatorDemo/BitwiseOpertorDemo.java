package com.capgemini.OperatorDemo;

import java.util.Scanner;

public class BitwiseOpertorDemo {
	public static void main(String args[]) {
		
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the Value :");
			int a=s.nextInt();
			int b=s.nextInt();
			System.out.println(a&b);
			System.out.println(a|b);
			System.out.println(a^b);
			System.out.println(a>>b);
			System.out.println(a<<b);
			
			
	}

}
