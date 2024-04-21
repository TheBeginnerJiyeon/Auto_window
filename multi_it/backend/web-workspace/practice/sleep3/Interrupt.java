package com.multi.practice.sleep3;

public class Interrupt {
	public static void main(String[] args) {
		
		Thread thread = new Thread2();
		thread.start();
		
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e){}
		
		thread.interrupt();
		
	}
	
	
}
