package com.multi.lambda.a_basic;

import com.multi.lambda.a_basic.functional.A_FuncInterface;
import com.multi.lambda.a_basic.functional.B_FuncInterface;
import com.multi.lambda.a_basic.functional.C_FuncInterface;

public class B_Functional {
	/*
     * 타겟타입(Target Type)
     *  - 람다식은 대립될 인터페이스의 종류에 따라서 작성 방법이 달라지기 때문에 람다식이 대입될 인터페이스를 타겟 타입 이라고 한다.
     *  - 람다식은 매개 변수를 가진 코드 블록이기 때문에 자바의 메소드 선언처럼 보여지지만
     *    자바는 메소드를 단독으로 선언할 수 없고 항상 클래스의 구성 멤버로 선언하기 때문에 람다식은 단순히 메소드를
     *    선언하는 것이 아니라 이 메소드를 가지고 있는 객체를 생성한다.
     *  - 람다식은 인터페이스 변수에 대입되고 람다식은 인터페이스의 익명 구현 객체를 생성한다.
     *  - 람다 표현식을 사용할 때는 람다 표현식을 저장하기 위한 참조 변수의 타입을 결정하는데 이때 참조변수형 타입을 함수형 인터페이스 라고 함.
          함수형인터페이스 변수 = 람다식
	*
	*
	* 함수적 인터페이스(Functional Interface)
	*  - 모든 인터페이스가 타겟 타입(람다식이 대입될 인터페이스)으로 사용할 수 없다.
	*  - 람다식은 하나의 메소드를 정의하기 때문에 두 개 이상의 추상 메소드가 선언된 인터페이스는 람다식을 이용해서 구현 객체를 생성할 수 없다.
	*  - 즉, 하나의 추상 메소드가 선언된 인터페이스만 람다식의 타겟이 될 수 있는데 이러한 인터페이스 함수적 인터페이스라고 한다.
	*  - 함수적 인터페이스를 선언할 때 @FunctionalInterface 어노테이션을 붙이면 두 개 이상의 추상메소드가 선언되지 않도록 컴파일러가
	*    체크해준다. (두 개 이상의 추상메소드가 선언되면 컴파일 에러가 발생한다.)
	*  - 물론 @FunctionalInterface 어노테이션이 없다고해서 함수적 인터페이스가 아니란 뜻은 아니고, 실수로 두 개 이상의 추상 메소드를
	*    선언하는 것을 방지하고 싶다면 붙여준다.
	*  - 디폴트메소드, 정적메소드가 포함되고 추상메소드가 하나이거나 Object 클래스의 메소드를 오버라이드 한 경우
	*    compare메소드와 같이 추상메서드가 하나인경우는 가능하다.
	*/
	
	
	
	
	/**
	 * 매개변수와 반환값이 없는 CASE
	 */
	public void method() {
		
		/*A_FuncInterface f1 = new A_FuncInterface() {
			@Override
			public void method1() {
				System.out.println("익명 구현 객체를 사용한 인터페이스 구현");
			}
		};*/
		
		A_FuncInterface f1;
		
		f1 = () -> System.out.println("매개변수와 반환값이 없는 람다식");
		// 2줄 이상이면 중괄호 생략 불가능
		
		f1 = () -> {
			System.out.println("매개변수와 반환값이 없는 람다식4");
			System.out.println("매개변수와 반환값이 없는 람다식4");
		};
		
		f1.method1();
		
		
	}
	
	
	/**
	 * 매개변수있고 반환값이 없는 CASE
	 */
	public void method22() {
		
		B_FuncInterface f1 = new B_FuncInterface() {
			@Override
			public void method1(int a) {
				System.out.println(a * 100);
			}
		};
		
		
		f1 = (int num) -> System.out.println(num * 100);
		// 메서드의 파라미터의 타입추론도 가능
		
		f1 = num -> System.out.println(num * 100);
		
		f1.method1(500);
		
		
	}
	
	/**
	 * 매개변수 있고  반환값이 있는 CASE
	 */
	
	public void method3() {
		
		C_FuncInterface f1;
		
		// 매개변수의 자료형, return 구분과 중괄호({})를 생략 가능
		f1 = (int a, int b) -> a + b;
		// 타입 안적어도 추론 가능함
		
		f1 = (a, b) -> sum(a, b);
		
		System.out.println(f1.method(10, 20));
		
	}
	
	
	private int sum(int a, int b) {
		return a + b;
	}
	
	
}
