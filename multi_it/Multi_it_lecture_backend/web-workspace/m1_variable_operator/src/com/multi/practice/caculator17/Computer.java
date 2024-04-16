package com.multi.practice.caculator17;

public class Computer extends Caculator{
	@Override
	double areaCircle(double r) {
		System.out.println("overriding");
		return Math.PI*Math.pow(r, 2);
		
	}
	
	
	
}
