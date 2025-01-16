package com.arrays;

public class JaggedArray {
	public static void main(String[] args) {
		int jag[][] = {{1,3,5},{3,7},{7,8,9}};
		
		for (int i=0; i<jag.length; i++) {
			for(int j=0; j<jag[i].length; j++) {
				System.out.print(jag[i][j] + " ");
			}
			System.out.println();
		}
	}	
}
