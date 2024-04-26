package com.multi.homework.a_interface.dto;

import java.util.ArrayList;

public class Twice extends KSinger {
	private int gAge;
	private boolean gBigEnter;
	private String name;
	private String gender;
	private int age;
	private static ArrayList<Twice> memList = new ArrayList();
	
	
	public Twice(String name, String gender, int age) {
		this.gName = "트와이스";
		this.gGender = "여자";
		this.gAge = super.getgAge() + 4;
		this.gBigEnter = super.isgBigEnter();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public static ArrayList getMemList() {
		return memList;
	}
	
	public void setMemList(ArrayList memList) {
		Twice.memList = memList;
	}
	
	@Override
	public void act() {
		System.out.println(this.name + "가 " + "JYP에서 연기 연습을 합니다.");
	}
	
	@Override
	public void spicy() {
		System.out.println("트와이스 " + name + "은(는) 매운 음식을 좋아합니다.");
	}
	
	@Override
	public String toString() {
		return "Twice{" +
				"그룹이름 : '" + gName + '\'' +
				", 그룹 평균 나이 : " + gAge +
				", 그룹 성별 : '" + gGender + '\'' +
				", 대형회사 여부 : " + gBigEnter +
				", 멤버 이름 : '" + name + '\'' +
				", 멤버 성별 : '" + gender + '\'' +
				", 멤버 나이 : " + age +
				'}';
	}
}
