package com.capgemini.InheritanceDemo;
//child class of vehicle class
public class BMW extends Vehicle{
	private String name1;
	public void display2()
	{
		System.out.println("The Brand name is "+name1);
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	

}
