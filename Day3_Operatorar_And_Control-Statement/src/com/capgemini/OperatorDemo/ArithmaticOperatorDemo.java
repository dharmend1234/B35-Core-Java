package com.capgemini.OperatorDemo;

import java.util.Scanner;

public class ArithmaticOperatorDemo {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Value :");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=a+b;
		int d=a-b;
		int e=a/b;
		@SuppressWarnings("unused")
		int f=a%b;
		System.out.println("Adittion of Value :"+c);     //addition of a and b variable
		System.out.println("Multiplication of Value :"+d); //Multiplication of a and b variable
		System.out.println("Division of Value :"+e); //Division of a and b variable
		System.out.println("Modulus of Value :"+e);// modulus of a and b varible
		s.close();
		
		
	}

}
