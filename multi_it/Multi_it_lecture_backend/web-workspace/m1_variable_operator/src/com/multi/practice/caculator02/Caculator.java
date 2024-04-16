package com.multi.practice.caculator02;

public class Caculator {
	void powerOn(){
		System.out.println("전원을 켭니다");
	}
	
	int Plus(int x, int y){
		int result= x+y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double) x / (double) y; //이레도 int 되는 거 아닌가?? 더블 나오네?? 아!! 더블은 인트보다 메모리가 더 커서 당연히 본인으로 계산된다.
		return result;
	}
	
	void powerOff(){
		System.out.println("전원을 끕니다.");
	}
	
	
}



