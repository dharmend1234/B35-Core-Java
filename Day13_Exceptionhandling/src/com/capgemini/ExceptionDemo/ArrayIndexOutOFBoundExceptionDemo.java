package com.capgemini.ExceptionDemo;

public class ArrayIndexOutOFBoundExceptionDemo {
//Demo in ArrayIndexOutOfBoundsException
	public static void main(String[] args) {
		System.out.println("First Line");
		System.out.println("Second Line");
		int[] arr = new int []{12,32,89};
		try {
			print(arr);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception Handled"+e);
		}
		//Finally Block Followed by Catch block
		//Finally block always executed whether exception occur or not
		finally
		{
			System.out.println("Finally block always executed ");
		}
		System.out.println("Outside try catch block");
	}
	public static void print(int []arr) 
	{
		System.out.println(arr[2]);
		System.out.println("Fourt Element Sucessfully Displayed");
	}

}
