package com.variables;

public class Emploee2 {
	
	String Name = "Mohammed Mujeebuddin";
	int age = 26;
	double Salary = 29950;
	String Company = "Wipro";
	
	public static void main(String[] args) {
		
		Employee Emp = new Employee();
		
		System.out.println("My name is " +Emp.employeeName );
		System.out.println("My Salary is " +Emp.employeeSalary);
	}

}
