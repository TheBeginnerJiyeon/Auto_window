package com.multi.a_inheritance;

public class Manager extends Employee {
	
	private int bonus;
	
	
	
	
	
	
	
	public void test() { // 가독성을 위해 super을 명시적으로 적어주는 것이 좋다!!
		System.out.println("이름은 " + super.name + "입니다.");
		System.out.println("주소는 "+super.addeewss);
		System.out.println("월급은 "+super.salary);
		/*System.out.println(super.rnn); // 프라이빗이라서 접근을 못 해서 못 가져옴*/
	}
	
	
	
	
	
	
	/*@Override
	public String toString() {
		return super.toString();
	}*/
	
	@Override
	public String toString() {
		return "Manager{" +
				"bonus=" + this.bonus +
				", name='" + super.name + '\'' +
				", addeewss='" + super.addeewss + '\'' +
				", salary=" + super.salary +
				'}';
	} // this, super 생략 가능!!
	
	
	
	
	
}
