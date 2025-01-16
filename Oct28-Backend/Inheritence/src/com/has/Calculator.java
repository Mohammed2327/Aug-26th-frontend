package com.has;

public class Calculator {
	
	public void addition(int a , int b, int c) {
		System.out.println("Addition of three int values " +(a+b+c));
	}
	
	public void addition(int a , int b) {
		System.out.println("Addition of two int values " +(a+b));
	}
	
	public void addition(float a , float b) {
		System.out.println("Addition of two float values " +(a+b));
	}
	
	public void addition(float a , int b) {
		System.out.println("Addition of int, float values " +(a+b));
	}

	public void addition(int a , float b) {
		System.out.println("Addition of int, float values " +(a+b));
	}
	
	public static void main(String[] args) {
		Calculator ct = new Calculator();
		
		ct.addition(23, 67);
		ct.addition(23.7f, 67);
		ct.addition(12,7,90);
		ct.addition('a', 'a');
	}
}
