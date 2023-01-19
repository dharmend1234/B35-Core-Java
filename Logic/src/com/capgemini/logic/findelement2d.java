package com.capgemini.logic;

import java.util.Scanner;

public class findelement2d {

	public static void main(String[] args) {
		System.out.println("Enter the Size of 2D Array");
		Scanner two=new Scanner(System.in);
		int rows=two.nextInt();
		int coln=two.nextInt();
		int count=0;

		int[][] arr1=new int[rows][coln];
		System.out.println("Enter the element of array");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<coln;j++)
			{
				arr1[i][j]=two.nextInt();
			}
			
		}
		System.out.println("Enter the Element You want to search");
		int x=two.nextInt();
		
		
		for(int i=0;i<rows;i++)
		{
			
			for(int j=0;j<coln;j++)
			{
				if(arr1[i][j]==x)
				{
					System.out.println("The Location of :"+x+" ("+i+","+j+")");
					count++;
					
				}
				
				
				
			}
			
			
		}
		if(count>0)
		{
			
		}
		else
		{
			System.out.println("Sorry Element Not Found:(");
		}
		
	
		

	}

}