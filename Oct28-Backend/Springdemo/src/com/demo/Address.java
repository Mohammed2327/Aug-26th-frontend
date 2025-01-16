package com.demo;

public class Address {
	private int hno;
	private String street;
	private String state;
	private int pincode;
	
	
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(int hno, String street, String state, int pincode) {
		super();
		this.hno = hno;
		this.street = street;
		this.state = state;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", street=" + street + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
}
