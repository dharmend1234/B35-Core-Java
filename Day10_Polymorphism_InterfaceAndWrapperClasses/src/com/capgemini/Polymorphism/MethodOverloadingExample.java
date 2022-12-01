package com.capgemini.Polymorphism;

public class MethodOverloadingExample {
	
	
	//Method Overloading
	//1.By Changing the number of Arguments
	public void addition(int x,int y)
	{
		System.out.println("The addition of x and y is :"+(x+y));
	}

	public void addition(int x,int y,int z)
	{
		System.out.println("The addition of x and y and z is :"+(x+y+z));
	}

}
