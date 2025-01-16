package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.EmployeeDao;
import com.demo.modal.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;
	
	// public EmployeeService(EmployeeDao employeeDao) {
	//	this.employeeDao = employeeDao;
//	}
	
	public int addEmployee(Employee employee) {
		return employeeDao.addEmployee(employee);
	}
	
	public Employee getEmployeeById(int id) {
		return employeeDao.getEmployeeByID(id);
	}
	
	public List<Employee> getAEmployees(){
		return employeeDao.getAllEmployees();
	}
	
	public int updateEmployee(Employee employee) {
		return employeeDao.updateEmployee(employee);
	}
	
	public int deleteEmployee(int id) {
		return employeeDao.deleteEmployee(id);
	}
}
