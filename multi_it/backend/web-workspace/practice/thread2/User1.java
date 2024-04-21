package com.multi.practice.thread2;

public class User1 extends Thread {
	private Caculator caculator;
	
	public void setCaculator(Caculator caculator){
		this.setName("User1");
		this.caculator=caculator;
	}
	
	public void run(){
		caculator.setMemory(100);
	}
	
	
	
}
