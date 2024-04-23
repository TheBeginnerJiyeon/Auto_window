package com.multi.c_static;

public class Company {
	
	
	public static void main(String[] args) {
		
		
		Employee e1 = new Employee("지연", 25, "여");
		Employee e2 = new Employee("제니", 26, "남");
		Employee e3 = new Employee("상수", 27, "남");
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
		
		System.out.println("총 인원: " + Employee.count);
		
		System.out.println("나이 총 합: " + Employee.sum);
		
		System.out.println("평균 나이: " + Employee.sum / Employee.count);
		
		System.out.println(Employee.getAvg());
		
		
		
		
		
	}
	
	
}
