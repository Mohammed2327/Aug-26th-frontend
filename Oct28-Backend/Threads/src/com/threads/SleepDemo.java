package com.threads;

public class SleepDemo extends Thread{
		public void run() {
			for (int i = 0; i <=10; i++) {
				System.out.println("Sleep mode:" +i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		}
		
		public static void main(String[] args) {
			SleepDemo sd = new SleepDemo();
			sd.start();
		}
}
