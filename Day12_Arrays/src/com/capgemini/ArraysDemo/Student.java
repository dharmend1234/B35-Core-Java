package com.capgemini.ArraysDemo;

public class Student {
	private int roll_no;
	private String name;
	//Parameterized Constructor
	public Student(int roll_no, String name) {
		super();
		this.roll_no = roll_no;
		this.name = name;
	}
	
	//Getter And Setter Method
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
