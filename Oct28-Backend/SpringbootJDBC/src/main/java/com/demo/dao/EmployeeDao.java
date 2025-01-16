package com.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.demo.modal.Employee;

@Repository
public class EmployeeDao {
	
	private final JdbcTemplate jdbcTemplate;
	
	public EmployeeDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//create
	
	public int addEmployee(Employee employee) {
		String sql = "INSERT INTO EMPLOYEE(name, department, salary) VALUES(?,?,?)";
		return jdbcTemplate.update(sql, employee.getName(), employee.getDepartment(), employee.getSalary());
	}
	
	
	//Read
	
	public Employee getEmployeeByID(int id) {
		String sql = "SELECT * FROM Employee WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, new EmployeeRowMapper(), id);
		
	}
	
	public List<Employee> getAllEmployees(){
		String sql = "SELECT * FROM Employee";
		return jdbcTemplate.query(sql, new EmployeeRowMapper());
	}
	
	
	//update
	  public int updateEmployee(Employee employee) {
	        String sql = "UPDATE Employee SET name = ?, department = ?, salary = ? WHERE id = ?";
	        return jdbcTemplate.update(sql, employee.getName(), employee.getDepartment(), employee.getSalary(), employee.getId());
	    }
	  
	  //Delete
	  
	  public int deleteEmployee(int id) {
		  String sql= "DELETE FROM EMPLOYEE WHERE ID = ?";
		  return jdbcTemplate.update(sql, id);
	  }
	  
	  //RowMapper Implementation for Employees
	  
	  private static class EmployeeRowMapper implements RowMapper<Employee>{
		  
		  public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			  Employee employee = new Employee();
			  employee.setId(rs.getInt("id"));
			  employee.setName(rs.getString("name"));
			  employee.setDepartment(rs.getString("department"));
			  employee.setSalary(rs.getDouble("salary"));
			  
			  return employee;
			  
		  }
	  }
}
