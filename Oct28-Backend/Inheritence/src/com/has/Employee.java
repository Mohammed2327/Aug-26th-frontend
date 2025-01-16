package com.has;

public class Employee {

	int empId;
	String empName;
	int empSal;
	Address address; // has a relation
	
	public Employee(int empId, String empName, int empSal, Address address) {
		super();
		this.empId = empId;
		this.empName= empName;
		this.empSal = empSal;
		this.address = address;
		
	}
	
	public void display() {
		System.out.println("Employee Id is: " +empId);
		System.out.println("Employee Name is: " +empName);
		System.out.println("Employee Salary is: " +empSal);
		// System.out.println(address);
	}
	
	public static void main(String[] args) {
		Address address = new Address(186, "Mohammed", "Ts", 505172 );
		Employee emp = new Employee(125, "Mujeebuddin", 45000, address);
		
		emp.display();
		address.display();
			
	}
}
