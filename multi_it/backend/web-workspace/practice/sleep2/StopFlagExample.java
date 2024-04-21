package com.multi.practice.sleep2;

public class StopFlagExample {
	public static void main(String[] args) {
		
		PrintThread1 printThread1 = new PrintThread1();
		printThread1.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
		}
		
		printThread1.setStop(true);
		
		
		
		
	}
	
	
}
