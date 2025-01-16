package com.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.modal.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
public class EmployeedaoImpl implements Employeedao	 {
	
	
	//entity object
	@PersistenceContext //entity object is wired with DAOImpl
	private EntityManager entity;

	@Override
	public Employee addEmployee(Employee emp) {
	
	entity.persist(emp);
	
		return entity.find(Employee.class, emp.getEmpid());
	}

	@Override
	public Employee updateEmployee(Employee emp) {
	
		return entity.merge(emp);
	}

	@Override
	public Employee getEmployeeById(int empid) {
	Employee empobj= entity.find(Employee.class, empid);
		return empobj;
	}

	@Override
	public String deleteEmployeeById(int empid) {
	Employee empres =	entity.find(Employee.class, empid);
		if (empres !=null) {
			entity.remove(empres);
			return "Employee deleted successfully";
		}
		else {
			return "Employee not found";
		}
	}

	@Override
	public List<Employee> getAllEmployees() {
		TypedQuery<Employee> tq = entity.createQuery("select e from Employee e", Employee.class);
		return tq.getResultList();
	}

}
