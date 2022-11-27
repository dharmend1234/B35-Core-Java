package com.capgemini.InheritanceDemo;
//Driver Class Main Class
import java.util.Scanner;

public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		tyre t=new tyre();
		System.out.println("Enter Vehicle Name :");
		String Veh_name=s.nextLine();
		t.setName(Veh_name);
		t.display();
		
		System.out.println();
		
		System.out.println("Enter brand Name :");
		String brand=s.nextLine();
		t.setName1(brand);
		t.display2();
		
		System.out.println();
		
		System.out.println("Enter tyre Name :");
		String tyre=s.nextLine();
		t.setTyre_name(tyre);
		t.display3();
		
		

	}

}
