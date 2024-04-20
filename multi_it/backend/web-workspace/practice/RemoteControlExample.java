package com.multi.practice;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		/*rc=new RemoteControl(); // 'RemoteControl' is abstract; cannot be instantiated*/
		rc = new Television();
		rc = new Audio();
		
		
	}
	
	
}
