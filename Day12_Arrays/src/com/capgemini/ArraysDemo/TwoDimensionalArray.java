package com.capgemini.ArraysDemo;
//Demo on 2D array or arrays of array
public class TwoDimensionalArray {

	public static void main(String[] args) {
		/*int arr[][]= {{12,15},{16,45},{46,52}};
		System.out.println(arr[0][1]);
		System.out.println(arr[2][1]);
		System.out.println(arr[1][0]);
		
		System.out.println("Enter the Arrays Element :");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
	}*/
	int [][]arr=new int[3][2];
	arr[0][0]=11;
	arr[0][1]=18;
	arr[1][0]=6;
	arr[1][1]=66;
	arr[2][0]=1;
	arr[2][1]=89;

	System.out.println("Array elements are:");
	//to print array elements
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<2;j++)
		{
			System.out.println(arr[i][j]+" ");
		}
		System.out.println();
	}

}

}
