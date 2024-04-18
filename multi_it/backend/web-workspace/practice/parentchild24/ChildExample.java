package com.multi.practice.parentchild24;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.method1();
		parent.field1 = "value1";
		parent.method2();
		
		Child child=(Child) parent;
		child.field2="yyy";
		child.method3();// 부모의 타입으로ㅓ 변경도ㅔㅆ던 자식 타입 객체가 다시 자식의 메서드를 사용할 수 있게 된다.
		
		
		
		
		
		
		
		
	}
	
	
}
