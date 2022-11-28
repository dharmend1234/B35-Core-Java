 package com.capgemini.AbstractDemo;

public class Employees extends Person{
    private int ID;
	public Employees(String name, String gender,int id) {
		super(name, gender);
		ID=id;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void work() {
		if(ID>0)
		{
			System.out.println("Employee Exist");
		}
		else
		{
			System.out.println("Not Exist");
		}
		
	}

	

}
