package com.variables;

class Product{
	int pid;
	String pname;
	double pprice;
	String category;
	
	public Product (int pid, String pname, double pprice, String category) {
		this.category = category;
		this.pid= pid;
		this.pprice = pprice;
		this.pname = pname;
	}
	
	//display the info
	public void display()	{
		System.out.println("Product ID: " +pid);
		System.out.println("Product name: " +pname);
		System.out.println("Product price: " +pprice);
		System.out.println("Product category: " +category);
	}
}

// class 1
class Electronics extends Product{
	String warrenty;
	
	public Electronics(int pid, String pname, double pprice, String category, String warrenty) {
		super(pid, pname, pprice, category);
		this.warrenty = warrenty;
	}
	
	public void display() {
		System.out.println("Electronic warrenty is :" +this.warrenty);
		super.display();
	}
}

// child 2
class Clothing extends Product{
	
	String size;
	
	public Clothing(int pid, String pname, double pprice, String category, String size) {
		super(pid, pname, pprice, category);
		this.size = size;
	}
	public void display() {
		System.out.println("Cloth size is " +this.size);
		super.display();
	}
	
}

// child 3
public class Furniture extends Product {
	
	String material;
	
	public Furniture(int pid, String pname, double pprice, String category, String material) {
		super(pid, pname, pprice, category);
		this.material = material;
	}
	public void display() {
		System.out.println("Furniture type is " +this.material);
		super.display();
	}

	public static void main(String[] args) {
		Electronics ele = new Electronics(123, "Iphone", 160000.0, "electronics", "2 years");
		ele.display();
		
		System.out.println("**********************************");
		
		Clothing cloth = new Clothing(456, "Shirt", 800.0, "Clothing", "200 meters");
		cloth.display();
		
		System.out.println("**********************************");
		
		Furniture furniture = new Furniture(789, "chair", 1600.0, "Furniture", "tace");
		furniture.display();
	}
}
