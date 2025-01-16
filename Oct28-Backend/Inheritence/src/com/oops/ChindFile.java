package com.oops;

class ParentFile //final class cannot extends
{
	int age= 30; //final variable cannot be modified
	
	public void getAge(int age) //final method can't override
	{
		this.age = ++age;
		System.out.println("Parent age is:" +this.age);
	}
}

public class ChindFile extends ParentFile {
	
	@Override
	public void getAge(int age) {
		this.age = --age;
		System.out.println("Parent age is:" +this.age);
	}
	
	public static void main(String[] args) {
		ChindFile	cf = new ChindFile();
		cf.getAge(77);
	}
}
