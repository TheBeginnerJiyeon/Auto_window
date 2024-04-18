package com.multi.b_conditional;

public class Exec04 {
	/* [switch문 표현식]
	 * switch(비교할 변수--> int. 문자. 문자열 : 실수(0.11, long...)와 논리(boolean: true, false)는 불가!! {
	 *     case 비교값1 : 비교값1과 일치하는 경우 실행할 구문; break;
	 *     case 비교값2 : 비교값2와 일치하는 경우 실행할 구문; break;
	 * 	   대소비교는 안된다. 일치하는 경우만 찾을 수 있다.
	 *     default : case에 모두 해당하지 않는 경우(else같음) 실행할 구문; break;
	 * }
	 * */
	public static void main(String[] args) {
		String name = "java";
		switch (name) {
			case "java":
				System.out.println("자바");
				break;
			
			case "python":
				System.out.println("파이썬");
				break;
			
			case "linux":
				System.out.println("리눅스");
				break;
			
			default: //생략 가능
				System.out.println("카운터로 가세요");
				break;
			
			
		}
		
	}
	
	
}
