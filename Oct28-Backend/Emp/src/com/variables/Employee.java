package com.variables;

// Class representation
public class Employee {

	int employeeID = 33;
	double employeeSalary = 29950.60;
	String employeeName= "Mohammed Mujeebuddin";
	String employeeAddress = "Hyderabad";
	
	static String employeeDepartment = "Developer";
	//main method
	
	public static void main(String[] args) {
		int atmPIN = 1471; // local variable
		
		System.out.println("The ATM pin number is: "+atmPIN);
		
		//Object creation
		
		Employee emp = new Employee();
		
		System.out.println("The employee ID is:" +emp.employeeID);
		System.out.println("The employee Name is:" +emp.employeeName);
		System.out.println("The employee Address is:" +emp.employeeAddress);
		System.out.println("The employee Salary is:" +emp.employeeSalary);
		
		System.out.println("The employee Department is:" +Employee.employeeDepartment);
	}
	
}
