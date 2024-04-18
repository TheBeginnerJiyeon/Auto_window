package com.multi.homework2;

public class Homework4 {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 2; i++) {
			for (int j = 1; j <= 8; j++) {
				if ((3 - i) <= (j % 5) && (j % 5) <= (1 + i)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		for (int i = 3; i <= 6; i++) {
			for (int j = 1; j <= 8; j++) {
				if ((i - 2) <= j && j <= 2 * (7 - i)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
	}
	
	
}
