package com.multi.a_inheritance;

public class BallpenMain {
	public static void main(String[] args) {
		Ballpen b1 = new Ballpen(1000, "모나미 회사", 5);
		b1.write();
		b1.buy();
		System.out.println(b1.toString());
		
		
	}
	
}
