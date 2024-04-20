package com.multi.practice.exam04;

public class Outter {
	
	public void method1(final int arg) {
		final int localVariable = 1;
		/*arg=10; // Cannot assign a value to final variable 'arg'*/
		/*localVariable = 100; // Cannot assign a value to final variable 'localVariable'*/
		
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	public void method2(int arg) {
		int localVariable = 1;
		/*arg=100; // Variable 'arg' is accessed from within inner class, needs to be final or effectively final
		localVariable = 100; // Variable 'localVariable' is accessed from within inner class, needs to be final or effectively final*/
		
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
			
		}
		
	}
	
}
