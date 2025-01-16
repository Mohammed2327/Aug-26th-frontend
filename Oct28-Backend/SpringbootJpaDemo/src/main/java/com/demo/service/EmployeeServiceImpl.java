package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.Employeedao;
import com.demo.modal.Employee;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	//dao object
	
	@Autowired
	private Employeedao dao;

	@Override
	public Employee addEmployee(Employee emp) {
	
		return dao.addEmployee(emp);
	}

	@Override
	public Employee updateEmployee(Employee emp) {

		return dao.updateEmployee(emp);
	}

	@Override
	public Employee getEmployeeById(int empid) {

		return dao.getEmployeeById(empid);
	}

	@Override
	public String deleteEmployeeById(int empid) {
	
		return dao.deleteEmployeeById(empid);
	}

	@Override
	public List<Employee> getAllEmployees() {
	
		return dao.getAllEmployees();
	}
	
	
}