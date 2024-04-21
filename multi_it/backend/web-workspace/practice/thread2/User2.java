package com.multi.practice.thread2;

public class User2 extends Thread {
	
	private Caculator caculator;
	
	public void setCaculator(Caculator caculator) {
		
		this.caculator = caculator;
		this.setName("User2");
	}
	
	public void run(){
		caculator.setMemory(50);
	}


}
