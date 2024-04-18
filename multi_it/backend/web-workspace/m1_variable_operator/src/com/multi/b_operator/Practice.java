package com.multi.b_operator;

public class Practice {
	
	public static void main(String[] args) {
		int cof_num = 5;
		int cof_cost = 5000;
		int result = cof_num * cof_cost;
		if (result > 20000) {
			System.out.println("할인해드릴게요");
		} else {
			System.out.println("총 커피값을 내세요");
		}
		
		int age = 30;
		int age_2 = age + 1;
		
		if (age_2 > 100) {
			System.out.println("이제부터 시작");
		} else {
			System.out.println("아직 젊어요");
		}
		
		int water_cost = 1000;
		int water_num = 2;
		int mask_cost = 2000;
		int mask_num = 3;
		
		int total_water = water_cost * water_num;
		int total_mask = mask_cost * mask_num;
		int total = total_water + total_mask;
		
		System.out.println(total);
		
		for (int i = 0; i < 100; i++) {
			System.out.println("나는 짱");
		}
		
		int korean = 75;
		int math = 50;
		
		int total2 = korean + math;
		int avg = total2 / 2;
		
		System.out.println(total2);
		System.out.println(avg);
		
		
	}
	
	
}
