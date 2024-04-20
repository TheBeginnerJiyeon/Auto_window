package com.multi.practice.exam10;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
			// java.lang.ClassNotFoundException: java.lang.String2
		}
		
		
	}
	
	
}
