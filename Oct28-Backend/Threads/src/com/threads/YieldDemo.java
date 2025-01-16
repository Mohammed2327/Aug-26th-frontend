package com.threads;

public class YieldDemo extends Thread {
	
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Child Thread");
			Thread.yield();
		}
	}
	
	public static void main(String[] args) {
		YieldDemo yd = new YieldDemo();
		yd.start();
		
		for (int i = 0; i <= 10; i++) {
			System.out.println("Main Thread");
		}
	}
}