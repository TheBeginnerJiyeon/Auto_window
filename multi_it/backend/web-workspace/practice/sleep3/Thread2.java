package com.multi.practice.sleep3;

public class Thread2 extends Thread {
	public void run() {
		/*try {
			while (true){
				System.out.println("실행 중");
				Thread.sleep(1); // 자는 없으면 캐치할 시간이 없나??
			}
		}catch (InterruptedException e){
		
		}*/
		
		while (true){
			System.out.println("실행 중");
			if(Thread.interrupted()){
				break;
			}
		}
		
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
		
		
	}
	
	
	
	
}
