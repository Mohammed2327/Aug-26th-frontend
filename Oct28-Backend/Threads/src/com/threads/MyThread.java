package com.threads;

// by extending a thread class
public class MyThread extends Thread{
	//this area executed by child thread
	
	//creating a child thread
	
	public void run()
	{
		for(int i=0; i<=10; i++) {
			System.out.println("Child Thread");
		}
	}
	
		public static void main(String[] args) {
			MyThread mt = new MyThread();
			mt.run(); // normal method calling
			mt.start(); // creating a thread
			
			
			//area executed by main thread
			for(int i=0; i<=10; i++) {
				System.out.println("Main Thread");
			}
			
			
		}
}
