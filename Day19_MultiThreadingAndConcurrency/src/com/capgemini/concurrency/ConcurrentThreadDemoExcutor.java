package com.capgemini.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class ConcurrentThreadDemoExcutor {

	public static void main(String[] args) {
		MultiplyingTask Task1= new MultiplyingTask(10,20,10);
		MultiplyingTask Task2= new MultiplyingTask(17,22,10);
		
		FutureTask<Integer>f1=new FutureTask(Task1);
		FutureTask<Integer>f2=new FutureTask(Task2);
		
		ExecutorService executor=Executors.newFixedThreadPool(2);
		executor.execute(f1);
		executor.execute(f2);
		
		while(true)
		{
			try
			{
			if(!f1.isDone())
			{
				System.out.println("FuturTask1 Output "+f1.get());
			}
			if(!f2.isDone())
			{
				System.out.println("FuturTask1 Output "+f2.get());
			
			}
			if(!f1.isDone() && !f2.isDone())
			{
				System.out.println("Completed Both the Task,Sutting Down the Executor");
				executor.shutdown();
				return;
			}
			}
			catch(InterruptedException e)
			{
				System.out.println("Exception Handled"+e);
			}
			catch(ExecutionException e)
			{
				System.out.println("Exception Handled"+e);
			}
			
		}
			
			
		

	}

}
