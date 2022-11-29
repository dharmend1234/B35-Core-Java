package com.capgemini.finalkeyworddemo;

/*Final method is inherited but can't override*/
public class FinalMethodWithChild extends FinalMethodWithParent{
	
	public String Pan_no;

	/*if we use final keyword with method then method override is not
	 * possible
	 * 
	 */
	
	
	//method overriding
	/*public void print()
	{
		System.out.println("Pan no.is: "+Pan_no);
		super.print();
	}*/
	

	//method overloading
	public void print(String Pan_no)
	{
		System.out.println("Pan no.is: "+Pan_no);
	}

}
