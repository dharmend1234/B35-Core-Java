package com.capgemini.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
//Demo on Collection Interface
public class DemoonCollectioninterface {

	//@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//Collection is a interface we cant instantiate it
		//@SuppressWarnings("rawtypes")
		Collection<Object> obj=new ArrayList<>();
		obj.add("Core Java");
		obj.add(123);
		obj.add('z');
		obj.add(10.5f);
		System.out.println("Collection of Arrays"+obj);
		//Extract Element From Arraylist
		
		for(Object itr:obj)
		{
			System.out.print(itr+" ");
		}

	}

}
