package com.capgemini.StreamApi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class BasicStreamDemo {

	public static void main(String[] args) {
		Stream<String>obj=Stream.of("Dharmendra","Sunil","Shiva");
		//forEach terminal operation
		obj.forEach((i)->System.out.print(i+" "));
		
		System.out.println();
		//A stream can be obtained from sources like arrays or collections using “stream” method 
	    //To obtain steam from array, use java.util.Arrays class
		List<Integer>obj1=Arrays.asList(new Integer[] {20,52,36});
		obj1.forEach((i)->System.out.print(i+" "));
		
		System.out.println();
		
		Set<String>obj2=new HashSet<>();
		obj2.add("Dharmendra");
		obj2.add("Mahendra");
		obj2.add("Sunil");
		System.out.print(obj2);
		
		System.out.println();
		
		obj2.forEach((i)->System.out.print(i+" "));
		/*for(String itr:obj2)
		/*{
			System.out.print(itr+" ");
		}*/
	}

}
