package com.capgemini.thiskeyword;

//5.to invoke current class constructor
public class Color {
	
	public String name;
	
	//default constructor
	Color()
	{
		this("RED");//invoking paramterized constructor
		System.out.println("Default Constructor");
	}
	//parameterized constructor
	Color(String name)
	{
		System.out.println("The color is: "+name);
	}

}