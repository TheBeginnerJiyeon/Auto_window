package com.multi.a_inheritance;

public class Man extends Human{
	
	private int power;
	
	
	/*public Man(){
		super("",0);
	}*/ // 부모의 기본 생정자가 없어서 값대입 필요
	
	public Man(String name, int age, int power){
		super(name,age);
		this.power=power;
	}
	
	public void run(){
		super.eat(); // 명시적으로 수퍼를 적지 않아도 자동으로 가져와서 쓴다
		System.out.println("빨리 달린다.");
	}
	
	public int getPower() {
		return power;
	}
	
	public void setPower(int power) {
		this.power = power;
	}
	
	@Override
	public String toString() {
		return "Man{" +
				"power=" + power +
				", name=" + getName() + ", age=" + super.getAge() +
				'}';
	} // 부모의 필드는 프라이빗이라 바로 ((super.)field로)가져오기 힘들다
	// (수퍼.)get 메서드로 가져오자. 겟셋의 목적이 필드를 보호하며 가져오는 방법을 만든 것이다!!
}
