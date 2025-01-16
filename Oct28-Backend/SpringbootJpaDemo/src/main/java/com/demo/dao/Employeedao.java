package com.demo.dao;

import java.util.List;

import com.demo.modal.Employee;

public interface Employeedao {
	
	Employee addEmployee(Employee emp);

	Employee updateEmployee(Employee emp);

	Employee getEmployeeById(int empid);

	String deleteEmployeeById(int empid);

	List<Employee> getAllEmployees();

}
