package com.multi.b_thread;

import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;

public class TimerTest extends TimerTask {
	
	private CountDownLatch latch;
	
	TimerTest(CountDownLatch latch) {
		this.latch = latch;
		
	}
	
	@Override
	public void run() {
		System.out.println("께임이 종료되었습니다.");
		latch.countDown();
	}
}
