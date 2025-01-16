package Variables;

//Withour constructor
public class Student {
	
	//Variables are declared
	int age;
	String name;
	
	//provide initialize of these variables
	public void assign() {
		age = 36;
		name = "Mohammed Mujeebuddin";
	}
	
	public void display() {
		System.out.println("age is: " +age + " Name is: " +name);
	}
	
	public static void main(String[] args) {
		Student std = new Student(); //Object is created
		std.assign(); //mandatory to call the assign method 
		std.display();
	}
}
