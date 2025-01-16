	package Variables;

public class TypeofMethods {
	//user define methods
	public static void display()
	{
		System.out.println("Welcome to display method");
	}
	
	public static int addition(int a, int b) {
		return a+b;
	}
	
	public static void sub(int a , int b)
	{
		System.out.println("Sub of two numbers is: " +(a - b));
	}
	
	// main method
	public static void main(String[] args) {
		TypeofMethods tom = new TypeofMethods();
//		tom.display();
//		System.out.println(tom.addition(54,46));
//		tom.sub(50, 50);
		
		TypeofMethods.addition(54, 46);
		TypeofMethods.display();
		TypeofMethods.sub(50, 50);
	}
}
