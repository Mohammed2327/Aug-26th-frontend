package com.has;

public class Address {
	
	int hno;
	String street;
	String state;
	int pincode;
	
	public Address(int hno, String street, String state, int pincode) {
		this.hno = hno;
		this.state = street;
		this.state= state;
		this.pincode = pincode;
	}
	
	public void display() {
		System.out.println("The house number is: " +hno);
		System.out.println("The street is: " +street);
		System.out.println("The state is: " +state);
		System.out.println("The pincode is: " +pincode);
	}
	
}
