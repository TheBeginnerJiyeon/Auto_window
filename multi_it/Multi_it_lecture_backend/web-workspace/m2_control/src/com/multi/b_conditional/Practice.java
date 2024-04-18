package com.multi.b_conditional;

public class Practice {
	public static void main(String[] args) {
		String nameNum = "A1000EX";
		
		char first = nameNum.charAt(0);
		
		switch (first) {
			
			case 'A':
				System.out.println("기획부");
				break;
			
			case 'B':
				System.out.println("총무부");
				break;
			
			case 'C':
				System.out.println("개발부");
				break;
			
		}
		
		
		String ssn = "880115-1056512";
		
		char gender = ssn.charAt(7);
		String sub=ssn.substring(7,8);
		System.out.println(sub);
		
		switch (gender) {
			
			case '1', '3': //버전 따라 다르다
				System.out.println("남자");
				break;
			case '2', '4':
				System.out.println("여자");
				break;
		}
		
		
		
		
		
	}
	
}
