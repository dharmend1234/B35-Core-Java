package com.capgemini.ArraysDemo;
//Demo on varargs

//Varargs Allows methods to receive unspecified number of argument
public class varargs {
	
	public static void print(int a,int b,String...c)
	//String ...s is variable -argument and it contain 0-n values
	{
		System.out.println(a+" "+b);
		//to print varargs
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+"\t");
		}
		
	}

	public static void main(String[] args) {
		//function call
		print(12,56,"Java","Html","Css");

	}

}
