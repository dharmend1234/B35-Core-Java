package com.capgemini.Constructor;

public class Parameterized_Constructor {
	int x,y;
	Parameterized_Constructor(int a, int b)            
	{
		x=a;y=b;
	}
	void show()
	{
		System.out.println(x+" "+y);
	}
}	
class b
{
	public static void main(String args[]) {
		Parameterized_Constructor pc =new Parameterized_Constructor(100, 200);
		pc.show();
		
	}


}

