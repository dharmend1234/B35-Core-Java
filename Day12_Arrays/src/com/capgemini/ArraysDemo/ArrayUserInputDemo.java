package com.capgemini.ArraysDemo;

import java.util.Scanner;

public class ArrayUserInputDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Size of Array :");
		int size=s.nextInt();
		//array declaration
		
		int arr[]=new int[size];
		System.out.println("Enter The Value in the Array :");
		
		//To enter the value in the array element using loop 
	for(int i = 0;i<arr.length;i++)
	{
		System.out.println("Enter The "+i+"th index :");
		arr[i]=s.nextInt();
	}
	   
	//To print the value in Array element using loop
	for(int i = 0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
		
	 
		
		
	}

}
