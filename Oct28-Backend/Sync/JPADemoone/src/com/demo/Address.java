package com.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="one_add")
public class Address {

	@Id
	private int hno;
	private String colony;
	private String state;
	private String city;
	private int zipcode;
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getColony() {
		return colony;
	}
	public void setColony(String colony) {
		this.colony = colony;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(int hno, String colony, String state, String city, int zipcode) {
		super();
		this.hno = hno;
		this.colony = colony;
		this.state = state;
		this.city = city;
		this.zipcode = zipcode;
	}
	
	
	
}
