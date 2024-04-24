package com.multi.a_inheritance;

public class SuperMan extends Man{
	
	private boolean isFly;
	
	public SuperMan(String name, int age, int power, boolean isFly) {
		super(name, age, power);
		this.isFly = isFly;
	}
	
	public void space(){
		System.out.println("우주를 날다");
		
		super.toString(); //부모메서드 호출 시 super. , 나 자신의 메서드는 생략 또는 this.
	}
	
	@Override
	public void run() {
		System.out.println("안보일 정도입니다.");
		
	}
	
	@Override
	public void sleep() {
		super.sleep();
		System.out.println("사실 잠도 안 잡니다");
	}
	
	@Override
	public String toString() {
		return "수퍼맨 [fly=" + isFly + ", power=" + getPower() + ", name=" + getName() + ", age=" + getAge() + "]";
	}
	
	
	
	
	
}
