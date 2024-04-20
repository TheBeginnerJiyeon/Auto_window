package com.multi.practice;

public class Audio implements RemoteControl {
	private int volume;
	
	public void turnOn() {
		System.out.println("audio를 켭니다.");
	}
	
	
	public void turnOff() {
		System.out.println("audio를 끕니다.");
	}
	
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VALUE) {
			this.volume = RemoteControl.MAX_VALUE;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		
		System.out.println("현재 Audio 볼륨: "+this.volume);
		
	}
	
	
}
