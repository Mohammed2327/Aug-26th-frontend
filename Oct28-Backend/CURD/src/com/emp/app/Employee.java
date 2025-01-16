package com.emp.app;

//encapsulated
public class Employee {
	private String empname;
	private int empsal;
	private String empadd;
	private String empemail;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpsal() {
		return empsal;
	}
	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}
	public String getEmpadd() {
		return empadd;
	}
	public void setEmpadd(String empadd) {
		this.empadd = empadd;
	}
	public String getEmpemail() {
		return empemail;
	}
	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String empname, int empsal, String empadd, String empemail) {
		super();
		this.empname = empname;
		this.empsal = empsal;
		this.empadd = empadd;
		this.empemail = empemail;
	}
	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", empsal=" + empsal + ", empadd=" + empadd + ", empemail=" + empemail
				+ "]";
	}
	
	
}
