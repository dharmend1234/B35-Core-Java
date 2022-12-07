package com.capgemini.ArraysDemo;

public class ArrayDemo {

	public static void main(String[] args) {
		//Approach 1
		//Multiple Way to Declare And Initialize Arrays
		int[] arr= {12,45,85,74,56};
		char []arr1= {'a','A','b','B','c'};
		
		//The Value Inside The arr6 is the char but the type is int so it will convert into ascii value
		int[] arr6= {'A','a','B','b','C'};
		System.out.println("The Array Element are "+arr6[3]);
		
		
		float arr2[]={10.5f,20.5f,45.5f,85.5f,95.5f};
		System.out.println("The Array Element are "+arr[4]);
		System.out.println("The Array Element are "+arr1[4]);
		System.out.println("The Array Element are "+arr2[3]);
		System.out.println("The Array Element are "+arr6[3]);
		
		//Approach 2
		int[] arr4 =new int[5];
		arr4[0]=10;
		arr4[1]=20;
		arr4[2]=30;
		arr4[3]=40;
		arr4[4]=50;
		System.out.println("The Array Element are "+arr4[4]);
		
		//To print all the element using foreach loop
		for(int arr5:arr4)
		{
			System.out.println(arr5);
		}
		System.out.println();
		//To print all the element using for loop
		for(int i=0;i<arr4.length;i++)
		{
			System.out.print(arr4[i]+" ");
		}
		

	}

}
