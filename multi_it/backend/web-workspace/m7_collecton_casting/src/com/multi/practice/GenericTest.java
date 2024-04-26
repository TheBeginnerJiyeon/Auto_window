package com.multi.practice;

public class GenericTest<T, K> {
	
	private T value1;
	private K value2;
	
	public GenericTest() {
	}
	
	public GenericTest(T value1, K value2) {
		this.value1 = value1;
		this.value2 = value2;
	}
	
	public T getValue1() {
		return value1;
	}
	
	public void setValue1(T value1) {
		this.value1 = value1;
	}
	
	public K getValue2() {
		return value2;
	}
	
	public void setValue2(K value2) {
		this.value2 = value2;
	}
	
	
	@Override
	public String toString() {
		return "GenericTest{" +
				"value1=" + value1 +
				", value2=" + value2 +
				'}';
	}
}
