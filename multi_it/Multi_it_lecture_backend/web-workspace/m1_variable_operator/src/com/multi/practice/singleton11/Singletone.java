package com.multi.practice.singleton11;

public class Singletone {
	private static Singletone singletone = new Singletone();
	
	private Singletone(){}
	
	static Singletone getInstance(){
		return  singletone;
	}
	
	
}
