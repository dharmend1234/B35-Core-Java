package com.capgemini.BufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
	public static void main(String arg[]) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in) );
	    String Str= reader.readLine();
	    System.out.println(Str);
	}

}
