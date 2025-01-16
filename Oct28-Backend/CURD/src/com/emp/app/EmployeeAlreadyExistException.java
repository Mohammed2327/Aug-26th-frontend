package com.emp.app;

public class EmployeeAlreadyExistException extends EmployeeException{
	
	public EmployeeAlreadyExistException(String message) {
		super(message);
	}
}
