package com.multi.practice.exam03;

public class A {
	int field1;
	void  method1(){}
	
	static int field2;
	static void method2(){}
	
	
	
	class B {
		void method(){
			field1=10;
			method1();
			
			field2=10;
			method2();			
		}		
	} // inner lass
	
	static class C{
		void method(){
			/*field1=10; // Non-static field 'field1' cannot be referenced from a static context*/
			
			/*method1(); // Non-static method 'method1()' cannot be referenced from a static context*/
			
			field2=10;
			method2(); //static은 잘 가져옴
			
		}
		
	}
}
