package Variables;

public class Employee {

	//Global variables
	int empId;
	String empName;
	
	//default constructor
	
	public Employee() {
		empId = 2024;
		empName = "Mohammed Mujeebuddin";
	}
	
	public void display() {
		System.out.println("Emp Id is: " +empId + " Emp Name is: " +empName);
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		
		emp.display();
	}
}
