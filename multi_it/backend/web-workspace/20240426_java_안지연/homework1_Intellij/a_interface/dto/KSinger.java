package com.multi.homework.a_interface.dto;

public abstract class KSinger implements KSingerInterface {
	
	protected String gName;
	protected String gGender="남자";
	private int gAge=19;
	private boolean gBigEnter=true;
	
	
	@Override
	public void sing() {
		System.out.println("노래를 합니다.");
	}
	
	@Override
	public void dance() {
		System.out.println("춤도 춥니다.");
	}
	
	@Override
	public abstract void act();
	
	@Override
	public abstract void spicy();
	
	@Override
	public void sleep() {
		System.out.println("잠을 잡니다.");
	}
	
	@Override
	public void work() {
		System.out.println("일을 열심히 합니다.");
	}
	
	public String getgName() {
		return gName;
	}
	
	public void setgName(String gName) {
		this.gName = gName;
	}
	
	public String getgGender() {
		return gGender;
	}
	
	public void setgGender(String gGender) {
		this.gGender = gGender;
	}
	
	public int getgAge() {
		return gAge;
	}
	
	public void setgAge(int gAge) {
		this.gAge = gAge;
	}
	
	public boolean isgBigEnter() {
		return gBigEnter;
	}
	
	public void setgBigEnter(boolean gBigEnter) {
		this.gBigEnter = gBigEnter;
	}
	
}
