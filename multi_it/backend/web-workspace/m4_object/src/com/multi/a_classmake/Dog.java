package com.multi.a_classmake;

public class Dog {

	
	//필드부(속성)
	// 색, 종류
	// 캡슐화를 위해 필드부를 프라이빗으로 지정!
	private String color;
	private String field;
	
	
	
	
	// 생성자부
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	//동작, 기능(메서드)
	
	/*public void setColor(String color){
		this.color = color;
	}
	
	public String getColor(){
		return this.color;
	}
	
	public void setField(String field){
		this.field=field;
	}
	
	public String getField(){
		return this.field;
	}*/
	
	public void wagTail(){
		System.out.println("꼬리 흔들기");
	}
	
	public void bark(){
		System.out.println("강아지 짖기");
	}
	
	
	// 제너레이트로 한번에 만들기!! alt + insert, ctrl로 다중지정
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getField() {
		return field;
	}
	
	public void setField(String field) {
		this.field = field;
	}
	
	/*@Override
	public String toString(){
		return "color: " + color + ", field: " + field;
	}*/
	
	/*@Override
	public String toString() {
		return "Dog{" +
				"color='" + color + '\'' +
				", field='" + field + '\'' +
				'}';
	}
	// 제너레이터에서도 toString 오버라이드 하는 것이 있다. 호출해서 정보 가져오기*/
	
	
	
	
}
