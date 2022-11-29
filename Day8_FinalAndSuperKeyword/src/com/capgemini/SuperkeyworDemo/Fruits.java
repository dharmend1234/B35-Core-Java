package com.capgemini.SuperkeyworDemo;
//parent class or super class or base class 
public class Fruits {
	//variable
	protected String name="King of Fruit";
	
	//parent constructor
	Fruits()
	{
		System.out.println("Parent constructor");
	}
	
	//method
	public void accept()
	{
		System.out.println("Parent class with "+name);
	}

}