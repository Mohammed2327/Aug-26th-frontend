package com.multi;

class First{
	public synchronized void display(String msg) {
		System.out.print("[" +msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.print("]");
	}
}

class Second extends Thread{
	String msg;
	First fsd; // has a relation
	
	public Second (First fsd, String msg) {
		this.fsd=fsd;
		this.msg=msg;
		this.start();
	}
}

public class SyncDemo {
	
	//3 thread
	public static void main(String[] args) {
		
		First fnew = new First();
		
		Second s1 = new Second(fnew, "Welcome");
		Second s2 = new Second(fnew, "to");
		Second s3 = new Second(fnew, "Inida");
	}

}
