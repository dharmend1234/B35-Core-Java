package com.capgemini.logic;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
           int a,i=2,count=0;
           System.out.println("Enter The Number");
           Scanner s=new Scanner(System.in);
           a=s.nextInt();
           while(i<2)
           {
        	   if(a%i==0)
        	   {
        		  count++;
        		  break;
        	   }
           }
           i++;
           if(count==0)
           {
        	   System.out.println("prime");
           }
           else
           {
        	   System.out.println("non prime");
           }
	}
}
