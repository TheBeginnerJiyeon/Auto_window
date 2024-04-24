package com.multi.a_inheritance;

public class Stationary {
    // 그림에 반환형도 적기, 오버라이드도 하기
	private int price;
	private String company;
	
	public Stationary() {
	}
	
	public Stationary(int price, String company) {
		this.price = price;
		this.company = company;
	}
	
	public void buy(){
		System.out.println("학용품을 사다");
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "Stationary{" +
				"price=" + price +
				", company='" + company + '\'' +
				'}';
	}
}
