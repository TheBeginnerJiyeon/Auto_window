package com.multi.a_variable; //패키지는 소문자로

public class Exec01 { //클래스는 첫글자는 대문자, 나머지는 소문자. pascal case
	public static void main(String[] args) {//메소드는 함수다 소문자, 지역변수 args는 소문자고 케멀표기법으로 표시함(소문자로 시작)
		// src의 폴더에서 자바 파일을 컴파일해서 out폴더의 .class 로 저장된다
		
		int myAge = 100;
		String myTel = "011";
		String ssn = "880101";
		
		myAge = Integer.parseInt("100"); //ctrl 하고 누르면 설명 나옴
		
		System.out.println(myAge);
		
		// 상수, 변수는 무조건 대문자로 작성!! 앞에 final 써주기. 변경 불가~
		final String COMPANY = "멀티";
		/*COMPANY = "h"; Cannot assign a value to final variable 'COMPANY'*/
		
		
	}// CTRL SHIFT Z :실행 후로 다시 돌림.  CTRL Z : 되돌리기
	 // CTRL ALT L : 포맷 자동 정렬  CTRL SHIFT / : 주석처리
		
}

