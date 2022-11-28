package com.capgemini.AbstractDemo;

public class EmployeePersonExcecutor {

	public static void main(String[] args) {
		Employees p1=new Employees("Dharmendra","Male" , 25);
		Employees p2=new Employees("Shiwani Mam","Female" , -4);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		p1.work();
		p2.work();
		
	}

}
