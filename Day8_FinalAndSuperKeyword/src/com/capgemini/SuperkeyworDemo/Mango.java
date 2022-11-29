package com.capgemini.SuperkeyworDemo;

public class Mango extends Fruits{
	public String name="Mango";
	
	Mango()
	{
		//by default it will call to parent class constructor
		//super();
		System.out.println("Child constructor");
	}
	
	public void accept()
	{
		System.out.println("Child class with "+name);
		
		//super keyword for parent class variable
		System.out.println(super.name);
		//super keyword for parent class method
		super.accept();
	}

	

}