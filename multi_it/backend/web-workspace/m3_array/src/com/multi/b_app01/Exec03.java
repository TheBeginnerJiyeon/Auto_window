package com.multi.b_app01;

import java.util.Random;

public class Exec03 {
	
	public static void main(String[] args) {
	    // 천개의 숫자 중에 100가지 숫자 중 랜덤한 값을 넣어 80보다 큰 수 출력
		int[] arr = new int[1000];
		Random random = new Random();
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			int num1 = random.nextInt(100) + 1;
			if (num1 > 80) {
				System.out.println(num1);
				count++;
			} else {
				continue;
			}
		}
		System.out.println("80보다 큰 값의 수는 총 " + count + "개");
	}
}
