package com.capgemini.lamdaexpressiondemo;
//Driver Class
public class EmployeeExecutorUsingLambda {

	public static void main(String[] args) {
		/*implementing the functional interface-Employee using
		Lambda Expression-with No parameter*/
		/*Employee e=()->{
			System.out.println("Lambda expression-No paramter");
			};
			e.display();*/
		
		/*implementing the functional interface-Employee using
		Lambda Expression-with two parameter*/
		/*Employee e=(int a,int b)->{
			int result=(a>b)?a:b;
			System.out.println("The Maximum number is :"+result);
			return result;
			};
			e.max(90,96);*/
		//lambda expression without return type
				Employee obj=(a,b)->(a>b)?a:b;
				System.out.println("The maximum number is: "+obj.max(48,98));
			
		
		

	}

}
