package com.multi.a_variable; //패키지는 소문자로

public class Exec02 { //클래스는 첫글자는 대문자, 나머지는 소문자. pascal case
	public static void main(String[] args) {
		
		// 자바는 변수를 만들 때, 어떤 타입의 데이터를 넣을지 미리 결정
		//선언 :  타입 변수명 ==> 변수가 생성됨!
		//기본 데이터 4가지: 정수, 실수, 문자, 논리
		//기호 => 연산자
		
		int age = 100;
		double height = 122.2;
		char gender = '남';
		boolean food = true;
		
		System.out.println("내 나이는 " + age);
		
		int a; //일단저장공간을 먼저 확보해두고, 나중에값을넣는 경우
		
		a = 100;
		int a1 = 100;//저장공간을 만드는 처음부터 들어갈값이 정해진 경우 // 선언과 동시에 초기화
		
		
		/*------------------------------------------------------------------*/
		
		//자료형에 대한 개념
		
		/*//1. 논리형
		boolean isTrue;  // true, false , 0 , 1  // 1byte
		
		//2. 숫자형
		//2_1 정수형
		
		byte bNum;		// 1byte -128~127!! 128 못들어감
		short sNum;     // 2byte  -3만 ~3만
		int iNum;		// 4byte -> 정수형중에 가장 대표적인 자료형 (기본형 ) -21억 ~ 21억xxx 까지의 값이 담기는 자료형
		long lNum;		// 8byte 21억 이상 ~L
		
		//2_2 실수형
		float fNum;		// 4byte 7자리, ~f
		double dNum;	// 8byte -> 실수형중에 가장 대표적인 자료형(기본형 )
		
		//float은 소수점 아래 7짜리까지 표현이 가능하고
		//double은 소수점 아래 15자리까지 표현이 가능해서 double이 좀 더 정확하다  그래서 실수형중에서 기본형이 double이다.
	
		
		//3. 문자형
		char ch;		//2byte*/
		
		
		/*byte age = 100; Variable 'age' is already defined in the scope*/
		byte age1 = 100;
		short wallet = 2000;
		int money = 5000000;
		long space = 10000000; /* 21억 넘는데 L 안쓰면 오류남. 적으면 그냥 인트로 인식함. 인트는 21억 이하임. 더 큰수를 넣으면 인트의 범위를 벗어나므로 꼭  long을 뜻하는 Long으로 적어주자*/
		
		System.out.println(age1);
		
		double height2 = 185.23;
		/*float height3=185.23; Required type: float Provided: double*/
		float height3 = 185.23f;
		
		System.out.println("내 키는" + height2);
		
		char gender2 = '남';
		System.out.println("내 성별은 " + gender2);
		
		String name = "제니";
		// 참조자료형 //기본데이타X ==> 너무 많이 쓰기 때문에 기본형처럼 기본형데이터처럼 사용 가능!!
		System.out.println("내 이름은  " + name);
		
		/*사용할 변수를 만들고 사용 안 할 거면 만들지도 말자*/
		int age3 ;
		/*System.out.println(age3); Variable 'age3' might not have been initialized*/
		
		String day;
		/*System.out.println(day); Variable 'day' might not have been initialized*/
		
		
		/*
		 * int형 리터럴로 초기화가 가능한 자료형
		 * byte, short, char, int
		 * -> 1) 초기화 시 입력 값을 int형 리터럴로 인식하지 않고 그냥 정수로 인식
		 *    2) 컴파일러가 저장하려는 자료형의 값의 범위와 일치하는지 검사하여
		 *       일치하면 입력값을 저장하려는 자료형으로 변환하여 저장
		 *    3) 값의 범위가 일치하지 않으면 에러 발생
		 *
		 * -> 초기화 된 이후 위 자료형들의 연산 시 무조건 int형으로 처리
		 */
		
		// 자동형변환 : 작은 크기의 자료형이 자동으로 큰 크기의 자료형으로 바뀌는 거 (형변환 생략 가능)
		// 다른 자료형들 끼리의 연산 시 작은자료형 -> 큰 자료형으로 자동 형변환 후 연산처리됨.*/
		
		
	}// CTRL SHIFT Z :실행 후로 다시 돌림.  CTRL Z : 되돌리기
	// CTRL ALT L : 포맷 자동 정렬  CTRL SHIFT / : 주석처리
}

