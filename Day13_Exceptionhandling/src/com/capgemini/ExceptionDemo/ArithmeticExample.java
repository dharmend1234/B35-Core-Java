package com.capgemini.ExceptionDemo;
//Demo on Arithmetic Exception
import java.util.Scanner;

public class ArithmeticExample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=12;
		System.out.println("Enter the Value of y :");
		int y=s.nextInt();
		//Try block content Exception code
		try {
		int result=x/y;
		System.out.println(result);
	}
		//catch block handle the Exception raised by try block
		catch(ArithmeticException e)
		{
			System.out.println("Exception Handled"+e);
		}
	

	}

}
