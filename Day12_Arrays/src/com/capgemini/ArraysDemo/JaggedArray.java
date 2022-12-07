package com.capgemini.ArraysDemo;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		//Declaring 2D array with 2 rows
		int arr[][]=new int[2][];
		//make this array as jagged array
		//first row has 2 columns
		 arr[0]=new int[3];
		//second row has 3 column
		 arr[1]=new int[3];
		 Scanner s=new Scanner(System.in);
			System.out.println("Enter the elements of an array: ");
			//to enter the array element
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[i].length;j++)
				{
					arr[i][j]=s.nextInt();
				}
			}
			
			//to print the array elemnets
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[i].length;j++)
				{
					System.out.print(arr[i][j]+"\t");
				}
				System.out.println(); 
			}
			
	}

}
