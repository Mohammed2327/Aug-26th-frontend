package Variables;

public class Product {
	
	int pid;
	String pname;
	
	//default constructor
	public Product() {
		System.out.println("This is the default constructor....");
	}
	
	//parameterized constructor
	
	public Product(int marks, String school)
	{
		System.out.println("Marks are: "+marks + " School name is: " +school);
	}
	
	public static void main(String[] args) {
		Product p = new Product();
		Product p1 = new Product(35, "RSPS");
	}
}
