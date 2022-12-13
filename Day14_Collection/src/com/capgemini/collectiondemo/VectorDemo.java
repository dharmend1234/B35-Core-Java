package com.capgemini.collectiondemo;

import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		List<Integer> v=new Vector<>();
		v.add(12);
		v.add(1, 16);
		v.add(2, 85);
		System.out.println(v);
		
		for(Integer itr:v)
		{
			System.out.print(itr+",");

		}
		
		

	}

}
