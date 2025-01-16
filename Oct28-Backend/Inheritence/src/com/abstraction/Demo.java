package com.abstraction;

abstract class Test{ //anstract class
	public void m1() //Implemented Method
	{
		System.out.println("Iam a m1 method");
	}
	
	public abstract void m2(); //Unimplemented Method
}


public class Demo extends Test {

	@Override
	public void m2() {
		System.out.println("Iam a m2 method with additional methods");
		
	}
	public static void main(String[] args) {
		Demo d = new Demo();
		d.m1();
		d.m2();
	
	}
	

}
