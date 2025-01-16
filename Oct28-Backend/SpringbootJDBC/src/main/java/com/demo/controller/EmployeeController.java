package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.modal.Employee;
import com.demo.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
//	public EmployeeController(EmployeeService employeeService) {
//		this.employeeService = employeeService;
	// }
	
	@PostMapping //http://localhost:5454/api/employees
	public String addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
		return "Employee added successfully!";
	}
	
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return employeeService.getEmployeeById(id);
	}
	
	@GetMapping
	public List<Employee> getAllEmployees()
	{
		return employeeService.getAEmployees();
	}
	
	@PutMapping("/{id}")
	public String updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
		employee.setId(id);
		employeeService.updateEmployee(employee);
		return "Employee updated successfully!";
	}
	
	public String deleteEmployee(@PathVariable int id) {
		employeeService.deleteEmployee(id);
		return "Employee deleted successfully!";
	}
}
