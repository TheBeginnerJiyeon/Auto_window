package com.multi.b_operator;

public class Exec01 {
	
	public static void main(String[] args) { //main 또는 psvm자동완성
		
		System.out.println(100 + 200);
		
		int n1 = 200;
		int n2 = 100;
		int n3 = n1 + n2;
		System.out.println(n3);
		
		byte n4 = 127;
		byte n5=100;
		byte n7=(byte) 128;
		System.out.println(n7);//-128 숫자 잘림
		
		
		byte n6 = (byte) (n4 + n5);
		// 바이트여도 연산하면 인트로 바껴서 (byte)안 쓰면 오류가 나는 것!!
		
		
	}
}
