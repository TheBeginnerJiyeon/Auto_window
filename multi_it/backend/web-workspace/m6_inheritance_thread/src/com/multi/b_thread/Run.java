package com.multi.b_thread;

import java.util.Timer;
import java.util.concurrent.CountDownLatch;

public class Run {
	
	public static void main(String[] args) {
		
		/*// 스레드 테스트 1
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		Thread th=new Thread(t2);
		
		t1.run();
		//t2.run();
		
		t1.start();
		th.start();
		// 둘의 실행 순서를 그냥은 정할 수 없다. 아래의 방법으로 줄 수 있다.??
		th.setPriority(1);
		
		System.out.println("main이 종료되었습니다.");
		*/
		
		// 스레드 테스트 2
		
		Timer timer = new Timer(); // 유틸 타이머
		
		CountDownLatch latch = new CountDownLatch(1); // 카운트다운
		
		
		TimerTest timerTest = new TimerTest(latch); //alt enter로 만들기
		
		System.out.println("십초동안 게임을 할 수 있습니다.");
		timer.schedule(timerTest, 10000); // 함수 설명 읽는 거 연습하기
		// 주어진 지연 시간 후에 한 번 태스크(task) 실행을 예약
		
		System.out.println("10초가 카운트 되는 중입니다.");
		
		System.out.println("main 코드는 종료되었습니다?? 아닙니다."); // 아직 타이머 안 꺼짐.. 빨간 네모
		
		
		try {
			latch.await(); // 카운트가 0 될 때까지 대기
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		
		System.out.println();
		
		System.out.println("main 코드는 종료되었습니다.");
		timer.cancel();
	}
	
	
}
