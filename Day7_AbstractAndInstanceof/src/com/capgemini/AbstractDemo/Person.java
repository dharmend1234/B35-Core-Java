package com.capgemini.AbstractDemo;
//Abstract Class
public abstract class Person {
	//Private Data Member
	private String name;
	private String gender;
	//Constructor
	public Person(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	
	}
	//Abstract Method
	public abstract void work();
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + "]";
	}
	//Userdefined Method
	//Non Abstract Method
	void changename(String newname)
	{
		name=newname;
	}

}
