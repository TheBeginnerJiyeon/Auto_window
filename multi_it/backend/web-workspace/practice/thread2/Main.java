package com.multi.practice.thread2;

public class Main {
	public static void main(String[] args) {
		
		Caculator caculator=new Caculator();
		
		User1 user1=new User1();
		user1.setCaculator(caculator);
		user1.start();
		
		User2 user2=new User2();
		user2.setCaculator(caculator);
		user2.start();
		
		
		
		
		
	}
	
	
}
