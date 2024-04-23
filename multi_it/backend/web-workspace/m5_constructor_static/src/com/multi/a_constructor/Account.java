package com.multi.a_constructor;

public class Account {
	
	private String name; // 이름
	private String field; // 계좌종류
	private int money; // 금액
	
	public Account() {
	
	}
	
	public Account(String name, String field) {
		this.name = name;
		this.field = field;
	}
	
	public Account(String name, String field, int money) {
		/*this.name = name;
		this.field = field;*/
		// super()... 부모의 생성자 호출
		this(name, field); // 나의 생성자도 호출 가능하다. 사용할 기존 생성자를 가장 먼저 호출
		this.money = money;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getField() {
		return field;
	}
	
	public void setField(String field) {
		this.field = field;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	@Override
	public String toString() {
		return "Account{" +
				"name='" + name + '\'' +
				", field='" + field + '\'' +
				", money=" + money +
				'}';
	}
}
