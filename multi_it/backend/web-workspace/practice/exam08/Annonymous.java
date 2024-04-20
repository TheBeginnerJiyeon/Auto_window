package com.multi.practice.exam08;

public class Annonymous {
	
	RemoteControl field=new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다");
		}
		
		@Override
		public void turnOff() {
			System.out.println("tv를 끕니다.");
		}
	};
	
	void method1(){
		RemoteControl localVar=new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("audio를 켭니다");
			}
			
			@Override
			public void turnOff() {
				System.out.println("audio를 끕니다.");
				
			}
			
		};
		
		localVar.turnOn();
		
		
	}
	
	void method2(RemoteControl rc){
		rc.turnOn();
	}
	
	
	
}
