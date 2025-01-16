package com.arrays;

public class Demo {
	public static void main(String[] args) {
		int marks[] = new int[6];
		marks[0] =90;
		marks[1] =80;
		marks[2] =70;
		marks[3] =60;
		marks[4] =50;
		marks[5] =40;
		// marks[6] =30;
		
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		System.out.println(marks[5]);
		
		
		System.out.println("-----------------For Loop----------------------------");
		
		for(int i=0; i<6; i++) {
			System.out.println(marks[i]);
		}
		
		System.out.println("-----------------Literral way----------------------------");
		
		int marks1[] = {1,2,3,4,5,6};
		
		System.out.println(marks1);
	}
}
