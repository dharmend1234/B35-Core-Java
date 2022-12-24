package com.capgemini.ThreadDemo;

public class SynchronizedMethodExecutor {

	public static void main(String[] args) {
		SynchronizedMethodDemo obj=new SynchronizedMethodDemo();
		Thread t1=new Thread(()->obj.arraysum(new int[] {12,52,63}));
		Thread t2=new Thread(()->obj.arraysum(new int[] {18,55,69}));
		t1.start();
		t2.start();
	}

}
