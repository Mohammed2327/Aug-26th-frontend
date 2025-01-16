package Encapsulation;

public class User {
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setEmpId(420);
		emp.setEmpName("Mohammed Najeebuddin");
		emp.setEmpSal(65000);
		emp.setEmpAdd("Pdpl");
		
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getEmpSal());
		System.out.println(emp.getEmpAdd());
		
		System.out.println(emp);
		
	}
}
