package com.demo.model;

public class User {
	
	private String name;
	private String age;
	private String mail;
	private String role;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String name, String age, String mail, String role) {
		super();
		this.name = name;
		this.age = age;
		this.mail = mail;
		this.role = role;
	}
	
	
}
