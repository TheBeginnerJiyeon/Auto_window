package com.multi.practice;

public class Television implements RemoteControl {
	//Class 'Television' must either be declared abstract or implement abstract method 'turnOn()' in 'RemoteControl'
	private int volume;
	
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("TV을 OFF합니다.");
	}
	
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VALUE) {
			this.volume = RemoteControl.MAX_VALUE;
			
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
			
		}else {
			this.volume=volume;
		}
		
		System.out.println("현재 TV 볼륨: "+this.volume);
		
		
	}
	
	
}
