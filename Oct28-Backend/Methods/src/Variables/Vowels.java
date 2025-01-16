package Variables;

import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {
		System.out.println("Enter a character:");
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0);
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u') {
			System.out.println("Enterted character is a vowel : "+ch);
		}
		else {
			System.out.println("Enterted character is not a vowel :"+ch);
		}
	}
}
