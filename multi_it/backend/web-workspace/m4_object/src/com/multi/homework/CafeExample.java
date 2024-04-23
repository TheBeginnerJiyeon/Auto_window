package com.multi.homework;

public class CafeExample {
	public static void main(String[] args) {
		
		int coffee_num=5;
		int coffee_price=2000;
		
		int milk_num=2;
		int milk_price=3000;
		
		MyCafe4 cafe=new MyCafe4();
		
		// 1
		int sum1=cafe.sum(coffee_num,coffee_price);
		System.out.println("커피 금액: "+ sum1);
		
		int sum2= cafe.sum(milk_num,milk_price);
		System.out.println("밀크티 금액: "+ sum2);
		
	   	//2
		
		
		int total=cafe.total(sum1,sum2);
		int person=coffee_num+milk_num;
		int perPrice= cafe.div(total,person);
		System.out.println("1인당 가격: "+ perPrice);
		
		
		
		
	}
}
