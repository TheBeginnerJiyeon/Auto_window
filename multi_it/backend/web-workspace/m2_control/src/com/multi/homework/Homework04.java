package com.multi.homework;

import java.util.Scanner;

public class Homework04 {
	//조건문 확인문제
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자1 입력>>");
		int num1 = scan.nextInt();
		
		System.out.print("숫자2 입력>>");
		int num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.println("앞 숫자가 더 크다.");
			System.out.println("n1: " + num1 + "\n" + "n2: " + num2);
		} else if (num1 < num2) {
			System.out.println("뒷 숫자가 더 크다.");
			System.out.println("n1: " + num1 + "\n" + "n2: " + num2);
		} else {
			System.out.println("숫자가 같다.");
			System.out.println("n1: " + num1 + "\n" + "n2: " + num2);
		}
		
		System.out.print("당신이 좋아하는 과목은>>");
		String subject = scan.next();
		scan.nextLine();
		if (subject.equals("java")) {
			System.out.println("JSP로 점프");
		} else if (subject.equals("python")) {
			System.out.println("장고로 점프");
		} else {
			System.out.println("무조건 열심히!!");
		}
		
		
	}
	
	
}
