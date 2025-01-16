package com.variables;
import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		
		double initialBal = 0;
		
		System.out.println("Your current Balance is: " +initialBal);
	System.out.println("Enter the amount to deposit :");
	double Depositmoney = sc.nextDouble();
	
	double TotalValue = initialBal + Depositmoney;
	
	System.out.println("The Balance is :" +TotalValue);

	
	System.out.println("Enter the Amount you want to withdraw :");
	double Withdrawl = sc.nextDouble();
	
	double RestValue = TotalValue - Withdrawl;
	
	System.out.println("The Balance in the Account is :"+RestValue);
}
}
