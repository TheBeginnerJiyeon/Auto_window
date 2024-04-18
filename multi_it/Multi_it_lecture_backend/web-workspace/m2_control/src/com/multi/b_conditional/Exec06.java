package com.multi.b_conditional;

import java.util.Date;

public class Exec06 {
	public static void main(String[] args) {
		// 12 1 2 / 3 4 5 / 6 7 8 / 9 10 11
		
		int month = new Date().getMonth() + 1;//0-11
		System.out.println(month);
		switch (month) {
			
			case 12,1,2: // 케이스 묶기 가능
				System.out.println("겨울");
				break;
			
			case 3:
			case 4:
			case 5:
				System.out.println("봄");
				break;
			
			case 6:
			case 7:
			case 8:
				System.out.println("여름");
				break;
			
			case 9:
			case 10:
			case 11: // 또는 디폴트
				System.out.println("가을");
				break;
			
		}
		
	}
}
