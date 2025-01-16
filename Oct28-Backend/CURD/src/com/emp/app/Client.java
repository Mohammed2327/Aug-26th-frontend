package com.emp.app;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Client {
	public static void main(String[] args) throws EmployeeException {
		System.out.println("****** Employee Management Applicaton ******");
		
		HashMap<Integer, Employee> employee = new HashMap<Integer, Employee>();
		Scanner sc = new Scanner(System.in);
		int empId = 20373441;
		
		while(true) {
		System.out.println("1. Add Employee");
		System.out.println("2. Update Employee");
		System.out.println("3. Get Employee");
		System.out.println("4. Delete Employee");
		System.out.println("5. Get All Employees");
		
		try {
		int option = sc.nextInt();
		switch(option) {
		case 1:
			System.out.println("Adding Employee Details");
			
			System.out.println("Enter the Employee Name");
			String empName =  sc.next();
			
			System.out.println("Enter the Employee Salary");
			int empSal = sc.nextInt();
			
			System.out.println("Enter the Employee Address");
			String empAdd= sc.next();
			
			System.out.println("Enter the Employee MailID");
			String empMail = sc.next();	
			
			if(empName.isEmpty() || empSal<0 || empAdd.isEmpty() || empAdd.isEmpty())
			{
				throw new InvalidEmployeeInput("Employee Data is Invalid!");
			}
			
			if(employee.containsKey(empId))
			{
				throw new EmployeeAlreadyExistException("Employee " +empId+ "already exists");
			}
			
			Employee emp = new Employee(empName, empSal, empAdd, empMail);
			
			employee.put(empId++, emp);
			System.out.println("Employee Inserted Successfully! " + empId);
			break;
			
			
		case 2:
			System.out.println("Updating Employee Details");
			System.out.println("Enter the Employee ID to Update");
			int eid = sc.nextInt();
			if(employee.containsKey(eid))
			{
				throw new EmployeeNotFoundException("Employee " +eid+ "not found");
			}
			
			System.out.println("Enter the Employee Name");
			String empname =  sc.next();
			
			System.out.println("Enter the Employee Salary");
			int empsal = sc.nextInt();
			
			System.out.println("Enter the Employee Address");
			String empadd= sc.next();
			
			System.out.println("Enter the Employee MailID");
			String empmail = sc.next();	
			
			Employee empupdate = new Employee(empname, empsal, empadd, empmail);
			employee.put(eid, empupdate);
			
			System.out.println("Employee updated :" +eid);
			break;
			
		case 3:
			System.out.println("Get Employee Details");
			int eid1 = sc.nextInt();
			if(!employee.containsKey(eid1)) {
				throw new EmployeeNotFoundException("Employee : "+eid1+"not found!"); 
			}
			Employee empobj = employee.get(eid1);
			System.out.println(empobj);
			break;
			
		case 4:
			System.out.println("Deleting Employee Details");
			System.out.println("Enter ID to Delete");
			int eid2 = sc.nextInt();
			if(!employee.containsKey(eid2)) {
				throw new EmployeeNotFoundException("Employee : "+eid2+"not found!"); 
			}
			employee.remove(eid2);
			System.out.println("Employee deleted with eID: " +eid2);
			break;
			
		case 5:
			Set<Entry <Integer, Employee>> result = employee.entrySet();
			if(result.isEmpty())
			{
				throw new EmployeeNotFoundException("No Employee Found");
			}
			
			 Iterator<Entry<Integer, Employee>> itr =result.iterator();
			 while(itr.hasNext())
			 {
				 Entry<Integer, Employee> FinalResult=itr.next();
				 System.out.println(FinalResult.getKey()+ " " +FinalResult.getValue());
			 }
			break;
		default:
			System.out.println("Please enter the valid option	");
			break;
		}
		}catch(Exception ee) {
			System.err.println("Error :" +ee.getMessage());
		}
		}
	}
}
