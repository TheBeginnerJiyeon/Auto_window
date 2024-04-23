package com.multi.a_classmake;

public class Tv {
	
	private int ch;
	private int vol;
	private boolean onOff;
	
	
	//on, off
	
	public void on() {
		System.out.println("켜지다");
		onOff=true;
	}
	
	public void off() {
		System.out.println("꺼지다");
		onOff=false;
	}
	
	
	public int getCh() {
		return ch;
	}
	
	public void setCh(int ch) {
		this.ch = ch;
	}
	
	public int getVol() {
		return vol;
	}
	
	public void setVol(int vol) {
		this.vol = vol;
	}
	
	public boolean isOnOff() {
		return onOff;
	}
	
	public void setOnOff(boolean onOff) {
		this.onOff = onOff;
	}
	
	@Override
	public String toString() {
		return "Tv{" +
				"ch=" + ch +
				", vol=" + vol +
				", onOff=" + onOff +
				'}';
	}
	
	
	
	
	
}
