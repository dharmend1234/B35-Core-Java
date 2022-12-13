package com.capgemini.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedlistDemo {
	public static void main(String[] args) {
	      
		LinkedList<Character> obj=new LinkedList<>();
	      List<Character> obj1=new LinkedList<>();
	      obj.add('z');
	      obj.add('r');
	      obj.add('g');
	      obj.add('h');
	      obj.add('i');
	      obj.add('o');
	      obj.add('r');
	      obj.addFirst('x');
	      obj.addLast('y');

	      System.out.println(obj);
	      System.out.println(obj.isEmpty());
	      System.out.println(obj1.isEmpty());
	      System.out.println(obj.contains('h'));
	      //Size of the list
	      System.out.println("The Total Element are :"+obj.size());
	      System.out.println("The index of element :"+obj.indexOf('o'));
	      System.out.println("The last index of r :"+obj.lastIndexOf('r'));
	      System.out.println("The Total Element are :"+obj.get(3));
	     //Asending order 
	     Collections.sort(obj);
	     System.out.println("The Total Element are :"+obj);
	     //desending order
	     Collections.reverse(obj); 
	     System.out.println("The Total Element are :"+obj);
	}

}



