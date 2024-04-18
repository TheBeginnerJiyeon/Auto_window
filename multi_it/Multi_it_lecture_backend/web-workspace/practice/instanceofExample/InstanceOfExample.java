package com.multi.practice.instanceofExample;

public class InstanceOfExample {
	
	public static void method1(Parent parent){
		if(parent instanceof Child){
			Child child=(Child) parent;
			System.out.println("method1 - Child로 변환 성공");
			
		} else {
			System.out.println("method1 - Child로 변환 실패");
			
			
		}
	}
	
	public static void method2(Parent parent){
		Child child=(Child) parent;
		
		System.out.println("method2 - Child로 변환 성공");
		
	}
	
	public static void main(String[] args) {
		
		Parent parent=new Child();
		method1(parent);
		method2(parent);
		
		Parent parent2=new Parent();
		method1(parent2); // method1 - Child   로 변환 실패지만 이를 예상한 if식으로 인해 오류 발생 안하고 변환 안됐다고 출력
		method2(parent2); // cannot be cast to class
		
		
		
		
	}
	
	
}
