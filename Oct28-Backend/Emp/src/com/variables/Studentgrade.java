package com.variables;
import java.util.Scanner;

public class Studentgrade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the student Name:");
		String name = sc.nextLine();
		
		System.out.println("Enter the student Age:");
		int age = sc.nextInt();
		
		System.out.println("Enter the student's Maths  Marks:");
		double math = sc.nextDouble();
		System.out.println("Enter the student's Science Marks:");
		double science = sc.nextDouble();
		System.out.println("Enter the student's Social Marks:");
		double social = sc.nextDouble();
		
	
		double avg =  (math + science + social) / 3;
		System.out.println("The student's average Marks is:" +avg);	
		
		if(avg >= 90) {
			System.out.println("First Class");
		}
		else if(avg >= 75) {
			System.out.println("Second Class");
		}
		else if(avg >= 60) {
			System.out.println("Third Class");
		}
		else if(avg >= 50) {
			System.out.println("Fourth Class");
		}
		else {
			System.out.println("Fail");
		}
	}
}
