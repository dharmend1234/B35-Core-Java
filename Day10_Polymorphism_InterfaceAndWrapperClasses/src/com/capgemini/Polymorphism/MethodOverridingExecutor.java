package com.capgemini.Polymorphism;
//driver class
public class MethodOverridingExecutor {

	public static void main(String[] args) {
		MethodOverringChild m3=new MethodOverringChild();
		MethodOverriding m4=new MethodOverriding();
		System.out.println(m3.mul(10, 20));
		System.out.println(m4.mul(100, 20));

	}

}
