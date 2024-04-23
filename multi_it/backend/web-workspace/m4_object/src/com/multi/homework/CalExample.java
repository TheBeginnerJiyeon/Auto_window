package com.multi.homework;

public class CalExample {
	
	
	public static void main(String[] args) {
		Calculator3 cal3 = new Calculator3();
		
		int price = 7000;
		int count1 = 5;
		int count2 = 4;
		
		System.out.println(cal3.sum(count1, count2));
		System.out.println(cal3.diff(count1, count2));
		System.out.println(cal3.total1(count1, price));
		System.out.println(cal3.total2(price, count2));
		
		System.out.println(cal3.total2(price, count2, count1));
		
		int sum1=cal3.sum2(count1, count2);
		int total3=cal3.total3(price, count2, count1);
		
		System.out.println(cal3.avg(total3, sum1));
		
		
		
	}
	
	
}
