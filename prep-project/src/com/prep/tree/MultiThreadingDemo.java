package com.prep.tree;

import java.util.ArrayList;
import java.util.List;

public class MultiThreadingDemo extends Thread {
	
	MultiThreadingDemo(){
		     super("my extending thread");
		     System.out.println("my thread created" + this);
		     start();
	}

	@Override
	public void run(){
	
		try
	     {
	        for (int i=0 ;i<10;i++)
	        {
	           System.out.println("Printing the count " + i);
	           Thread.sleep(1000);
	        }
	     }
	     catch(InterruptedException e)
	     {
	        System.out.println("my thread interrupted");
	     }
	     System.out.println("My thread run is over" );
	}
	
	public static void main(String args[]){
		MultiThreadingDemo m = new MultiThreadingDemo();
//		MultiThreadingDemo n = new MultiThreadingDemo();
//		MultiThreadingDemo b = new MultiThreadingDemo();
//		MultiThreadingDemo c = new MultiThreadingDemo();
//		MultiThreadingDemo d = new MultiThreadingDemo();
	// create as many object you want
		      try
		      {
		         while(m.isAlive())
		         {
		           System.out.println("Main thread will be alive till the child thread is live");
		           Thread.sleep(1500);
		         }
		      }
		      catch(InterruptedException e)
		      {
		        System.out.println("Main thread interrupted");
		      }
		      System.out.println("Main thread's run is over" );
		   }
	
	// Note : we can implement the same thing using runnable interface. but that needs instansiation of thread class
	//seperately. Also thread class is already implementing runnbale interface.
}

