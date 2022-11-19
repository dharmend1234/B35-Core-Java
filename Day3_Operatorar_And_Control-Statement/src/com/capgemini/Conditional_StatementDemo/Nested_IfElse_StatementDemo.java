package com.capgemini.Conditional_StatementDemo;

import java.util.Scanner;

public class Nested_IfElse_StatementDemo {
	public static void main(String args[]) {
int age,weight;
System.out.println("Welcome To The Blood Donation Center");
System.out.println("Enter Your Age :");
Scanner s=new Scanner(System.in);
age=s.nextInt();
System.out.println("Enter Your Weight :");
weight=s.nextInt();
if(age>=18)
{
	if(weight>=48)
	{
		System.out.println("You are Elegible To Donate Blood");
	}
	else
	{
		System.out.println("You are Not Elegible To Donate Blood");
	}
	
}
else
    {
	System.out.println("You are Not Greater Then 18!!");
    }
s.close();
	}
	
}
