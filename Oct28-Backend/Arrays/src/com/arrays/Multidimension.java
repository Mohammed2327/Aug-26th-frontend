package com.arrays;

public class Multidimension {
	public static void main(String[] args) {
		int marks[] []= {{12, 15,19}, {52, 57, 69}, {86, 76, 64}};
		
		for( int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(marks[i][j] +" ");
			}
			System.out.println();
		}
	}
}
