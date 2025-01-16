package Variables;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number: ");
	int number = sc.nextInt();
	
	if(Prime(number)) {
		System.out.println(number + "This is a Prime number");
	} else {
		System.out.println(number + "This is not a Prime number");
	}
	
	
	}
	
	 public static boolean Prime(int num) {
	        if (num <= 1) {
	            return false; // 0 and 1 are not prime numbers
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false; // Found a divisor, not prime
	            }
	        }
	        return true; // No divisors found, it is prime
	 }
}
