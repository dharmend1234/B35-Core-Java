package com.capgemini.gitdemo;

public class Outer
{
	private static int value = 20;
	public static int s = 15;
	public static int temp = 10;
	public static class Nested
	{
	private void display()
	{
		try {
			try {
				System.out.println(temp + s + value);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	
	public static void main(String args[])
	{
	Outer.Nested inner = new Outer.Nested();
	inner.display();
	}
}