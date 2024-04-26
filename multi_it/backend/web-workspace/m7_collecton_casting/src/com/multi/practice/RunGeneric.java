package com.multi.practice;

public class RunGeneric {
	public static void main(String[] args) {
		
		GenericTest gt = new GenericTest();
		
		gt.setValue1("하이");
		gt.setValue2(123);
		
		System.out.println(gt);
		
		GenericTest<String, Integer> gt2= new GenericTest<>();
		gt2.setValue1("sdsd");
		/*gt2.setValue2("gkdl"); 타입 다르므로 컴파일 에러*/
		gt2.setValue2(1234455);
		System.out.println(gt2);
		
		
		
		
		
		
	}
}
