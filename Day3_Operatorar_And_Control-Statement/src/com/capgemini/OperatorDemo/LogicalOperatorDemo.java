package com.capgemini.OperatorDemo;

import java.util.Scanner;

public class LogicalOperatorDemo {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Value :");
		int age=s.nextInt();
		int weight=s.nextInt();
		boolean result=(age>18)&&(weight>50);
		boolean result2=(8>5)||(53>50);
		boolean result3=(age!=weight);
		System.out.println("The result is :"+result);
		System.out.println("The result is :"+result2);
		System.out.println("The result is :"+result3);
		s.close();
	}
		

}
