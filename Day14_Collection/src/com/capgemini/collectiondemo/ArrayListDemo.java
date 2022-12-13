package com.capgemini.collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
	      List<Character> obj=new ArrayList<>(3);
	      List<Character> obj1=new ArrayList<>(3);
	      obj.add('z');
	      obj.add('r');
	      obj.add('g');
	      obj.add('h');
	      obj.add('i');
	      obj.add('o');
	      obj.add('r');
	      System.out.println(obj);
	      System.out.println(obj.isEmpty());
	      System.out.println(obj1.isEmpty());
	      System.out.println(obj.contains('h'));
	      //Size of the list
	      System.out.println("The Total Element are :"+obj.size());
	      System.out.println("The index of element :"+obj.indexOf('o'));
	      System.out.println("The last index of r :"+obj.lastIndexOf('r'));
	      System.out.println("The Total Element are :"+obj.get(3));

	}

}
