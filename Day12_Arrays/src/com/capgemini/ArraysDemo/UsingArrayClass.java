package com.capgemini.ArraysDemo;

import java.util.Arrays;

public class UsingArrayClass {
	//Varargs Allows methods to receive unspecified number of argument

	public static void display(int ...c)
	{
		//sort method is in arrays class which is used to sort the values
		Arrays.sort(c);
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+"\t");
		}
		
	}
	public static void main(String[] args) {
		//Function Call
		display(12,78,45,95,2,3,0,8,4);
		

	}

}
