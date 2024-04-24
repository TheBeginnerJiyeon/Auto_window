package com.multi.a_inheritance;

public class Employee extends Object{
	
	public String name; // + : 패키지 상관 없이 접근 가능
	String addeewss; //  같은 패키지 접근 가능 디폴트
	protected int salary; // 같은 패키지, (다른 패키지의) 상속한 경우만 사용 가능!!
	private int rrn; // 같은 클래스 안에서만 사용 가능
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int getRrn() {
		return rrn;
	}
	
	public void setRrn(int rrn) {
		this.rrn = rrn;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getAddeewss() {
		return addeewss;
	}
	
	public void setAddeewss(String addeewss) {
		this.addeewss = addeewss;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee{" +
				"name='" + name + '\'' +
				", addeewss='" + addeewss + '\'' +
				", salary=" + salary +
				", rrn=" + rrn +
				'}';
	}
	
	
}
