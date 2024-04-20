package com.multi.practice.exam08;

public class AnnonymousExample {
	public static void main(String[] args) {
		Annonymous annony=new Annonymous();
		
		annony.field.turnOn();;
		
		annony.method1();
		
		annony.method2(
				new RemoteControl() {
					@Override
					public void turnOn() {
						System.out.println("smarttv를 켭니다.");
					}
					@Override
					public void turnOff() {
						System.out.println("smarttv를  끕니다.");
						
						
					}
					
					
					
				}
		);
		
		
		
		
		
	}
	
	
	
}
