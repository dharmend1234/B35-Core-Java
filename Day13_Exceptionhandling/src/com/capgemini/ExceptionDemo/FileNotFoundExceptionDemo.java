package com.capgemini.ExceptionDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotFoundExceptionDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=null;
		fis=new FileInputStream("C:\\Users\\vaish\\Desktop\\Dharmendra V Resume (1).pd");
		int k;
		while((k=fis.read())!=-1)
		{
			System.out.print((char)k);
		}
		fis.close();

	}

}
