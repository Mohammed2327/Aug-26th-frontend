package com.variables;

class Employee{
	int empId;
	String empName;
	double empSal;
	
	public Employee(int empId, String empName, double empSal)
	{
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	
	public void Display()
	{
		System.out.println("Employee ID: " +empId);
		System.out.println("Employee Name: " +empName);
		System.out.println("Employee Salary: " +empSal);
	}
}

class Manager extends Employee{
	String department;
	
	public Manager (int empId, String empName, double empSal, String department) {
		super(empId, empName, empSal);
		this.department = department;
	}
	
	public void Display() {
		System.out.println("Employee department : " +this.department);
		super.Display();
		
	}
}

public class Tester extends Employee{
	String tool;
	public Tester (int empId, String empName, double empSal, String tool) {
		super(empId, empName, empSal);
		this.tool = tool;
		
	}
			public void Display() {
				System.out.println("Tester is using " +this.tool);
				super.Display();
			}
	
	public static void main(String[] args) {
		Manager manage= new Manager(123, "Mohammed", 50000, "Sales");
		manage.Display();
		
		
		System.out.println("*******************");
		Tester test = new Tester(456, "Mujeebuddin", 45000, "git");
		test.Display();
	}
}
