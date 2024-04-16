package com.multi.b_operator;

public class Exec03 {
	
	public static void main(String[] args) {
		
		
		int x = 200;
		int y = 100;
		int sum = x + y;
		//자바에서는 int끼리의 계산은 무조건 int!
		System.out.println("두 수의 합은 " + sum);
		
		//자바에서는 하나라도 double이면 무조건 double! -> 더 큰 자료형이면 괜찮음
		//하나만 정수를 실수로 강제로 변환해서 계산시 사용할 수 있다.
		//강제로 타입을 바꾸는 것: 타입변환(형변환)
		double div = (double) y / x;
		System.out.println("y/x은 " + div);
		
		System.out.println("두 수의 나눗셈은 " + div);
		
		double div1 = (double) (y / x); /*인트형끼리 먼저 연산을 해버림!!*/
		System.out.println("y/x은 " + div1);
	}
}