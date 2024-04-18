package com.multi.practice.abstract2;

public class Cat extends Animal{
	// Class 'Cat' must either be declared abstract or implement abstract method 'sound()' in 'Animal'
	
	public Cat(){
		this.kind="포유류";
	}
	
	@Override
	public void sound(){
		System.out.println("야옹");
	}
	
}
