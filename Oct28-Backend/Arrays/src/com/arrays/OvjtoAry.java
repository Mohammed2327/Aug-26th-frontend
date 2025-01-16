package com.arrays;

public class OvjtoAry {
	public static void main(String[] args) {
		
		Employee emp = new Employee(123, "Mohammed");
		Employee emp1 = new Employee(234, "Mujeebuddin");
		Employee emp2 = new Employee(345, "Mohammed");
		Employee emp3 = new Employee(456, "Najeebuddin");
		
		Employee obj[] = {emp, emp1, emp2, emp3};
		
		
		for(Employee e:obj) {
			System.out.println(e.empId + " " +e.empName);
		}
	}
}
