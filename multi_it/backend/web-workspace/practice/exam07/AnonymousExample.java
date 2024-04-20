package com.multi.practice.exam07;

public class AnonymousExample {
	
	public static void main(String[] args) {
		
		Anonymous annony = new Anonymous();
		annony.field.wake();
		annony.method1();
		annony.method2(
				new Person() {
					void study() {
						System.out.println("공부합니다.");
					}
					
					@Override
					void wake() {
						System.out.println("8시에 일어납니다.");
						study();
					}
					
				}
		
		
		);
		
		
	}
	
	
}
