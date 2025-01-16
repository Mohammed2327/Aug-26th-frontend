package com.variables;
import java.util.Scanner;

public class Product {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the product Name:");
		String pname = sc.next();
		
		System.out.println("Enter the number of Products: ");
		int num= sc.nextInt();
		
		System.out.println("The price of the product is: ");
		double price = sc.nextDouble();
		
		double result = num * price;
		
		System.out.println("The total price of the products is: " + result);
	}
}
