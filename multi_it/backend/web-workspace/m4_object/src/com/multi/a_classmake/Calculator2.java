package com.multi.a_classmake;

public class Calculator2 {
	
	//각 부품의 기능을 정의할 때는 메서드를 쓴다.
	//메소드의 입력값 잠깐 저장할 용도로 선언된 변수, 메소드의
	//사용과 처리의 중간 다리역할을 변수: 매개변수(parameter,파라메터)
	
	public String add(int x, int y) {
		// System.out.println("합은 " + (x + y));
		/*int result=x+y;
		return result;*/
		return "합은 " + (x + y);
		//x, y변수는 add메서드 지역에서만 쓸 수 있는 지역변수
		//local 변수, 로컬변수
		//지역변수는 자동초기화 되지 않음.
	}
	
	// 오버로딩은 받는 타입, 갯수에 의해 정해진다. 같은 메서드 이름으로 여러개 있다
	public int add2(int x, int y) {
		return x + y;
	}
	
	public double add2(int x, double y) {
		double result = (double) x + y;
		return result;
	}
	
	/*public int add2(int x, double y) {
		double result = (int)x + (int)y;
		return result; // 리턴 타입 달라도 매개변수의 갯수, 순서, 종류 같으면 안 됨!!!
	}*/
	
	public double add2(double y, int x) {
		return x + y; // 얘도 double 1개, int 1개이지만 순서가 달라서 가능함
	}
	
	/* 생성자 작성 시 동일한 이름의 생성자를 한 클래스 내에서 작성하는게 불가능하다는 것을 확인했다.
	 * 또한, 매개변수 부분의 타입, 갯수, 순서를 다르게 작성하면 서로 다른 메소드나 생성자로 인식하기 때문에
	 * 동일한 이름의 생성자나 메소드를 여러 개 작성할 수 있게 하기도 했다.
	 * 그러한 것을 오버로딩(Overloading) 이라고 한다.
	 *
	 * 오버로딩의 사용 이유
	 * 매개변수의 종류별로 메소드 내용을 다르게 작성해야 하는 경우들이 종종 있다.
	 * 이 때, 동일한 기능의 메소드를 매개변수에 따라 다르게 이름을 정의하면 복잡하고 관리하기가 매우 어려울 것이다.
	 * 규모가 작은 프로그램의 경우는 정도가 덜 하지만, 규모가 거대해지면 메소드 또한 관리하기가 매우 어려워진다.
	 * 따라서 동일한 이름으로 다양한 종류의 매개변수에 따라 처리해야 하는 여러 메소드를 동일한 이름으로 관리하기 위해
	 * 사용하는 기술을 오버로딩이라고 한다.
	 *
	 * 오버로딩의 조건
	 * 동일한 이름을 가진 메소드의 파라미터 선언부에 매개변수의 타입, 갯수, 순서를 다르게 작성하여
	 * 한 클래스 내에 동일한 이름의 메소드를 여러 개 작성할 수 있도록 한다.
	 * 메소드의 시그니쳐(Signature)가 다르면 다른 메소드로 인식하기 때문이다.
	 * 즉, 시그니쳐 중 메소드 이름은 동일해야 하기 때문에 파라미터 선언부가 다르게 작성되어야 오버로딩이 성립된다.
	 *
	 * 메소드의 시그니쳐?
	 * public void method(int num) {} 이라는 메소드의 메소드명과 파라미터 선언부 부분을 시그니쳐라고 부른다.
	 * method(int num) 이 부분이 시그니처이다.
	 *
	 * 메소드의 시그니처가 달라야 하기 때문에 접근제한자나 반환형은 오버로딩 성립요건에 해당하지 않는다.
	 * */
	
	
	public String add2(String x, double y) {
		return x + y;
	}
	
	
	public int mul(int x, int y) {
		return x * y;
	}
	
	public int minus(int x, int y) {
		return x - y;
	}
	
	/*public int div(int x, int y) {
		return x / y;
	}*/
	
	
	// 반환형이 없음
	public void div(int x, int y) {
		System.out.println("한 사람당 " + (x / y));
	}
	
	
}
