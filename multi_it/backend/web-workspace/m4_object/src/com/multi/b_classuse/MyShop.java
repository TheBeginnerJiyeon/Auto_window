package com.multi.b_classuse;

import com.multi.a_classmake.Calculator2;

public class MyShop {
	public static void main(String[] args) {
		
		Calculator2 cal = new Calculator2();
		
		System.out.println(cal.add(100, 200));
		System.out.println(cal.mul(20, 3));
		
		int result1 = cal.minus(10, 3);
		System.out.println(result1);
		
		int result2 = cal.minus(4, 2);
		System.out.println(result2);
		
		cal.div(10, 2);
		
		double result3=cal.add2(100,100.5);
		System.out.println(result3);
		
		int result4=cal.add2(100,200);
		System.out.println(result4);
		
		String result5=cal.add2("하이",123.9);
		System.out.println(result5);
		
		
		
		
		
	}
}
