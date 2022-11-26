package com.capgemini.inheritanceDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferedreaderdemo {
	public static void main(String arg[]) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in) );
	    String Str= reader.readLine();
	    System.out.println(Str);
	}

}
