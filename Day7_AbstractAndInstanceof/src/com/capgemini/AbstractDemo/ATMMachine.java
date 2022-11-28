package com.capgemini.AbstractDemo;
//Abstract Class
abstract class ATMMachine {
	/*Abstract Class Content Abstract Method and Non abstract method*/
	
	//Abstract Method
	abstract void withdraw();

	//Non Abstract Method
	void Display()
	{
		System.out.println("Non Abstract Method");
	}

}
