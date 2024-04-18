package com.multi.homework;

import java.util.Scanner;

public class Homework03 {
	//숫자 비교반복
	
	boolean more = true;
	
	
	void smaller() {
		System.out.println("뒷 숫자가 더 큽니다.");
	}
	
	void bigger() {
		System.out.println("앞 숫자가 더 큽니다.");
	}
	
	void same() {
		System.out.println("숫자가 동일함");
	}
	
	void gameOn() {
		more = true;
	}
	
	void gameOff() {
		System.out.println("게임을 종료합니다!!");
		more = false;
	}
	
	
	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 0;
		
		Scanner scan = new Scanner(System.in);
		Homework03 home = new Homework03();
		
		while (home.more) {
			System.out.print("숫자입력1>>");
			num1 = scan.nextInt();
			System.out.print("숫자입력2>>");
			num2 = scan.nextInt();
			
			if (num1 > num2) {
				home.bigger();
			} else if (num1 < num2) {
				home.smaller();
			} else if (num1 == num2) {
				home.same();
			}
			
			System.out.print("더 하시겠습니까? o/x");
			char game = scan.next().charAt(0);
			
			if (game == 'o') {
				home.gameOn();
			} else if (game == 'x') {
				home.gameOff();
			}
			
			
		}
		
		
	}
}
