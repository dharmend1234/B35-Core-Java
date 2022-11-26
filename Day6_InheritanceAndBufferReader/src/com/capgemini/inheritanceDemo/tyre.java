package com.capgemini.inheritanceDemo;
//child class of BMW class
public class tyre extends BMW {
	private String tyre_name;
	public void display3()
	{
		System.out.println("The tyre name is "+tyre_name);
	}
	public String getTyre_name() {
		return tyre_name;
	}
	public void setTyre_name(String tyre_name) {
		this.tyre_name = tyre_name;
	}
}
