package com.capgemini.Polymorphism;
//Driver Class
public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		//Object Creation
		MethodOverloadingExample m=new MethodOverloadingExample();
		//Method Calling
		m.addition(12, 23);
		m.addition(45, 5, 6);

		//Object Creation
		MethodOverloadingDiffDataType m1=new MethodOverloadingDiffDataType();
		//Method Calling
		m1.addition(45, 12);
		m1.addition(45f, 45);
	}

}
