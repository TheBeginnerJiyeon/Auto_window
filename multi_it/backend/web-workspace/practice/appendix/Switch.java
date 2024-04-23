package com.multi.practice.appendix;

public class Switch {
	public static void main(String[] args) {
		
		
		method2();
		method3();.
		
	}
	
	
	public static void method2() {
		char grade='B';
		
		switch (grade){
			case 'A','a'->{
				System.out.println("에이");
			}
			
			case 'B','b'->{
				System.out.println("비");
			}
			default -> System.out.println("손님");
		}
		
		
		
	}
	
	
	public static void method3() {
		
		String grade="B";
		
		int score=switch (grade){
			case "A"->100;
			case "B"->{
				int result=100-20;
				yield result;
			}
			default->60;
			
			
			
		};
		System.out.println("\t"+score);
		
		
		
		
		
	}
	
	
}
