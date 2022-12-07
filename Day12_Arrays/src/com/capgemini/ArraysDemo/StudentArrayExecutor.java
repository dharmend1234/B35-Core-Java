package com.capgemini.ArraysDemo;

import java.util.Scanner;

public class StudentArrayExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		
		//Non Primitive Memory Allocation
		Student arr[]=new Student[3];
		System.out.println("Enter The Value ");
       arr[0]=new Student(s.nextInt(),s.nextLine());
       arr[1]=new Student(s.nextInt(),s.nextLine());
       arr[2]=new Student(s.nextInt(),s.nextLine());
       
		
		System.out.println("The Elements are :");
		
		//To Print the Array Element
	for(int i = 0;i<arr.length;i++)
	{
		System.out.print(arr[i].getRoll_no()+","+arr[i].getName()+" ");
	}
		
		
		
	}

}
