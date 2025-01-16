package com.variables;
import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		
		System.out.println("Enter the number: ");
		
		Scanner sc = new Scanner(System.in);
		
		int value = sc.nextInt();
		
		if (value > 0) {
			System.out.println("The entered number is positive");
		}
		else {
			System.out.println("The entered number is negative");
		}
		
	}
}
