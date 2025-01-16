package com.variables;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int fnum = sc.nextInt();
		System.out.println("Enter second number: ");
		int snum = sc.nextInt();
		
		int result = fnum + snum;
		
		System.out.println("The addition of 2 numbers is: " +result);
	}
	}