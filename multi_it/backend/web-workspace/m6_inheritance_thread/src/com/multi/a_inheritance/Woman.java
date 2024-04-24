package com.multi.a_inheritance;

public class Woman extends Human {
	
	private String food;
	
	public Woman(String name, int age, String food) {
		super(name, age);
		this.food = food;
	}
	
	@Override
	public void eat() {
		System.out.println("맛있는 것을 먹습니다.");
	}
	
	@Override
	public void sleep() {
		System.out.println("쿨쿨 잡니다.");
	}
	
	
	// 캡슐화를 위한 겟, 셋
	public String getFood() {
		return food;
	}
	
	public void setFood(String food) {
		this.food = food;
	}
	
	@Override
	public String toString() {
		return "Woman{" +
				"food='" + food + '\'' +
				"name='" + super.getName()+ '\'' +
				'}'; // 수퍼 것도 잘 나온다
		// WonderWoman{name=40, age=40, 좋아하는 음식=파전, swim=true}Woman{food='파전'name='제니'}
	}
}
