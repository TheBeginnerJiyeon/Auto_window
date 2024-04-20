package com.multi.practice.exam09;

public class Annonymous {
	
	private int field;
	
	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
		/*arg1=20; // Cannot assign a value to final variable 'arg1'*/
		/*arg2 = 20; // Variable 'arg2' is accessed from within inner class, needs to be final or effectively final*/
		
		/*var1=30; // Cannot assign a value to final variable 'var1'*/
		/*var2 = 30; // Variable 'var2' is accessed from within inner class, needs to be final or effectively final*/
		
		Caculatable calc = new Caculatable() {
			@Override
			public int sum() {
				
				int result = field + arg1 + arg2 + var1 + var2;
				
				return result;
			}
		};
		
		
		System.out.println(calc.sum());
		
	}
	
	
}
