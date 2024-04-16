package com.multi.practice.caculator17;

public class ComputerExample {
	public static void main(String[] args) {
		int r=10;
		
		Caculator caculator = new Caculator();
		System.out.println("cal" + caculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("com" + computer.areaCircle(r));
		System.out.println();
		
		
	}
	
}
