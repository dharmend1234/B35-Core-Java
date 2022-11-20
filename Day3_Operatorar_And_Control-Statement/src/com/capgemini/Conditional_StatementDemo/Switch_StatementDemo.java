package com.capgemini.Conditional_StatementDemo;

import java.util.Scanner;

public class Switch_StatementDemo {
	public static void main(String args[]) {
		System.out.println("Enter Two Number :");
		int a,b,c,ch;
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Enter Your Choice :");
		ch=s.nextInt();
switch(ch)
{
case 1 : c=a+b;

	System.out.println("Addition of Number :"+c);
	break;

case 2 : c=a-b;

	System.out.println("Substraction of Number :"+c);
	break;

case 3 : c=a*b;

	System.out.println("Multiplicatin of Number :"+c);
	break;


case 4 : c=(a*b);

	System.out.println("Division of Number :"+c);
	break;

case 5 : c=a%b;

	System.out.println("Modulus of Number :"+c);
	break;


default:

	System.out.println("Invalid Choice!!");

}
}

}
