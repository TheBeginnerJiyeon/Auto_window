package com.multi.b_thread;

// runnable interface 구현하기
// 바로 오류 뜨므로 more action으로 구현!!
public class Thread2 implements Runnable{
	
	
	@Override
	public void run() {
		
		for (int i = 1000; i > 0; i--) {
			
			System.out.println("감소 : " + i);
		}
		
		
	}
}
