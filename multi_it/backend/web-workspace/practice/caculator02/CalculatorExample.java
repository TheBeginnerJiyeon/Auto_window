package com.multi.practice.caculator02;

public class CalculatorExample {
	public static void main(String[] args) {
		Caculator myCalc = new Caculator();
		myCalc.powerOn();
		
		int result1=myCalc.Plus(5,6);
		System.out.println("result1 : " + result1);
		
		byte x=10;
		byte y=4;
		
		double result2 = myCalc.divide(x, y); // double 나오네??? 더블은 인트보다 메모리가 더 커서 당연히 본인으로 계산된다.
		System.out.println("result2 : " + result2);
		
		myCalc.powerOff();
		
		
		
	}
}
