package com.capgemini.InheritanceDemo;
// Driver Class or Main Class
//Demo on Single Inheritance
import java.util.Scanner;

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		
		System.out.println("Enter the name of the animal is ");
		Scanner s=new Scanner(System.in);
		String name1=s.nextLine();
		System.out.println("Enter the breed of the Dog is ");
		String breed1=s.nextLine();
		
		Dog d=new Dog();
		d.name=name1;
		d.breed=breed1;
		d.display();
		d.print();
		s.close();
		
		
	}

}
