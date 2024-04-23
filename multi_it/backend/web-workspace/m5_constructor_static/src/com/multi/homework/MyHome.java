package com.multi.homework;

public class MyHome {
	
	public static void main(String[] args) {
		
		Daughter d1=new Daughter("홍길순","여");
		Daughter d2=new Daughter("홍길진","여");
		
		// a
		System.out.println(d1);
		System.out.println(d2);
		
		//b
		System.out.println(Daughter.count);
		
		//c
		System.out.println(Daughter.wallet);
		
		
		
		
	}
	
	
	
}
