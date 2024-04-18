package com.multi.practice.person12;

public class PersonExample {
	
	public static void main(String[] args) {
		Person p1=new Person("123456-1234567", "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.name);
		System.out.println(p1.ssn);
		
		
		p1.name="sdsd";
		/*p1.nation="sd"; Cannot assign a value to final variable 'nation'
		p1.ssn="1234345"; Cannot assign a value to final variable 'ssn'*/
	}
	
	
}
