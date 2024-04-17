package com.multi.practice.parentchild16;

public class Student extends People {
	
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); //There is no parameterless constructor available in 'com.multi.practice.parentchild16.People' 부모에 기본생성자 없어용
		this.studentNo = studentNo;
	}
	
}