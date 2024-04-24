package com.multi.a_inheritance;

public class WonderWoman extends Woman{
	
	private boolean swim;
	
	public WonderWoman(String name, int age, String food, boolean swim) {
		super(name, age, food);
		this.swim = swim;
	}
	
	
	
	@Override
	public void eat() {
		System.out.println("많이 맛있게 먹습니다.");
	}
	
	@Override
	public void sleep() {
		super.sleep();
		System.out.println("아주 깊게 잘 잡니다");
	}
	
	public boolean isSwim() {
		return swim;
	}
	
	public void setSwim(boolean swim) {
		this.swim = swim;
	}
	
	
	@Override
	public String toString() {
		return "WonderWoman{" +
				"name=" + super.getAge() +
				", age=" + super.getAge() +
				", 좋아하는 음식=" + super.getFood() +
				", swim=" + swim +
				'}'  + super.toString();
	}
}
