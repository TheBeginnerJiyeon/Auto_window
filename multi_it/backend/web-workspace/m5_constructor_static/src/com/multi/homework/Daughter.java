package com.multi.homework;

public class Daughter {
    private String name;
	private String gender;
	public static int wallet=10000;
	public static int count;
	
	public Daughter(String name, String gender) {
		this.name = name;
		this.gender = gender;
		count++;
		wallet-=1000;
	}
	
	public void watchTv(){
		System.out.println("tv를 보다");
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
	
	public static int getWallet() {
		return wallet;
	}
	
	public static void setWallet(int wallet) {
		Daughter.wallet = wallet;
	}
	
	public static int getCount() {
		return count;
	}
	
	public static void setCount(int count) {
		Daughter.count = count;
	}
	
	@Override
	public String toString() {
		return "Daughter{" +
				"name='" + name + '\'' +
				", gender='" + gender + '\'' +
				'}';
	}
}
