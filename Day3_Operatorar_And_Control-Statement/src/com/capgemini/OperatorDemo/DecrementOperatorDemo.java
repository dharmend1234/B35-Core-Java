package com.capgemini.OperatorDemo;

import java.util.Scanner;

public class DecrementOperatorDemo {
	public static void main(String args[]) {
		System.out.println("Enter Value");
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		System.out.println(--a);
		System.out.println("PreDecrement of Value :"+a);
		System.out.println(a--);
		System.out.println("PostDecrement of Value :"+a);
	    s.close();
	}

}
