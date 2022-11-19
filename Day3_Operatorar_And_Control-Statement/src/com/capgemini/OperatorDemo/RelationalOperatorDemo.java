package com.capgemini.OperatorDemo;
//demo on Relational operator

import java.util.Scanner;

public class RelationalOperatorDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a and b:");
		int a=s.nextInt();
		int b=s.nextInt();
		boolean result=(a==b);
		boolean result2=(a<b);
		boolean result3=(a>b);
		boolean result4=(a<=b);
		boolean result5=(a>=b);
		boolean result6=(a!=b);
		//if condition is true it returns true else false
		//relational operator returns a boolean value:true/false
		System.out.println("The result is: "+result);
		System.out.println("The result is: "+result2);
		System.out.println("The result is: "+result3);
		System.out.println("The result is: "+result4);
		System.out.println("The result is: "+result5);
		System.out.println("The result is: "+result6);
		s.close();


	}

}