package com.multi.b_app01;

import java.util.Random;

public class Exec02 {
	public static void main(String[] args) {
		
		// 공간 6개 만들기,Random(), 출력
		//1
		int[] lotto = new int[6];
		
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
			System.out.println(lotto[i]);
		}
		
		//2
		
		System.out.println();
		int[] lotto2 = new int[6];
		
		Random random = new Random();
		
		for (int i = 0; i < lotto2.length; i++) {
			lotto2[i] = random.nextInt(45) + 1;
			System.out.println(lotto2[i]);
		}
		

		
		
		
		
		
		
	}
	
	
}
