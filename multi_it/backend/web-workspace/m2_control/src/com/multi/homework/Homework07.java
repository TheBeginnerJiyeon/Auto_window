package com.multi.homework;

import java.util.Scanner;

public class Homework07 {
	// 순차문 확인문제
	
	public static void main(String[] args) {
		
		//1 bmi지수
		Scanner scan = new Scanner(System.in);
		
		System.out.print("몸무게 입력(kg): ");
		float weigth = scan.nextFloat();
		
		System.out.print("신장 입력(m): ");
		float heigth = scan.nextFloat();
		
		float bmi = Math.round(weigth / Math.pow(heigth, 2));
		System.out.println("BMI: " + bmi + "\n");
		
		
		//2 포인트 문제
		float point = 3000;
		
		while (true) {
			System.out.println("현재까지의 누적 포인트: " + point);
			System.out.print("추가 포인트: ");
			float plus = scan.nextFloat();
			point += plus;
			System.out.println();
			System.out.println("최종 포인트는 " + point + "\n");
			
			
		}
		
		
	}
}
