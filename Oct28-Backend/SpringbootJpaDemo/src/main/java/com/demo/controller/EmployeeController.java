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

@RestController //it act's as a controller class
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	//handler method to handle add employee data
	
	@PostMapping("/add") //http://localhost:5454/emp/add
	public Employee addEmployee(@RequestBody Employee emp)
	{
		return service.addEmployee(emp);
	}
	
	//handler method to update the handler to handle the update request
	
	@PutMapping("/update") //http://localhost:5454/emp/update
	public Employee updateEmployee(@RequestBody Employee emp)
	{
		return service.updateEmployee(emp);
	}
	
	//get employee
	
	@GetMapping("/get/{id}") //http://localhost:5454/emp/get/id
	public Employee getEmployee(@PathVariable("id") int empid)
	{
		return service.getEmployeeById(empid);
	}
	
	//get all the data
	
	@GetMapping("/getall")
	public List<Employee> getAllEmployees()
	{
		return service.getAllEmployees();
	}
	
	//delete the data
	
	@DeleteMapping("/delete/{id}") //http://localhost:5454/emp/delet/id
	public String deleteEmployee(@PathVariable("id") int empid)
	{
		service.deleteEmployeeById(empid);
		return "Employee Deleted Successfully!";
	}
	
}
