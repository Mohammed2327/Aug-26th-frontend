package com.variables;


import java.util.Scanner; 

public class Demo2 {
public static void main(String[] args) {
	
	//create object of Scanner class
	
	Scanner sc = new Scanner(System.in);
	
	// display the message to end user	
	System.out.println("Enter the Employee Name: ");
	String empName = sc.next();
	
	System.out.println("Enter the Employee Salary: ");
	double empSal = sc.nextDouble();
	
	System.out.println("Enter Employee Id: ");
	int empId = sc.nextInt();
	
	System.out.println("Enter employee Address");
	String empAddress = sc.next();
	
	
	System.out.println("====== Employee Information ======");
	System.out.println("Employee ID :" +empId);
	System.out.println("Employee Name :" +empName);
	System.out.println("Employee Salary :" +empSal);
	System.out.println("Employee Address :" +empAddress);
	
}
}
