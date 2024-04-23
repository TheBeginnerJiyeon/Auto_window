package com.multi.a_constructor;

public class Bank {
	
	public static void main(String[] args) {
		
		Account acc0=new Account();
		System.out.println(acc0.toString());
		//Account{name='null', field='null', money=0}. 객체는 초기화 디폴트 시 null(참조하는 주소 없음). 기본은 0이나 false 등등..
		
		
		Account acc1 = new Account("제니1","정기적금1",10000);
		
		Account acc2 = new Account("제니2","정기적금2",20000);
		
		Account acc3 = new Account("제니3","정기적금3");
		
		System.out.println(acc1);
		System.out.println(acc1.toString());
		
		System.out.println(acc3.toString());
		acc3.setMoney(30000);
		System.out.println(acc3.toString());
		
		
		
		
		
		
	}
	
	
}
