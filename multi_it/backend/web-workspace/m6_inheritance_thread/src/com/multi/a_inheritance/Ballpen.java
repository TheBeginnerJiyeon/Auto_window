package com.multi.a_inheritance;

public class Ballpen extends Stationary {

	private int width;
	
	public Ballpen() {
	}
	
	public Ballpen(int width) {
		this.width = width;
	}
	
	public Ballpen(int price, String company, int width) {
		super(price, company);
		this.width = width;
	}
	
	
	public void write() {
		System.out.println("글을 쓰다");
	}
	
	@Override
	public void buy() {
		super.buy();
		System.out.println("그 중 볼펜을 삽니다.");
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	@Override
	public String toString() {
		
		
		return "Ballpen{" +
				"price=" + super.getPrice() +
				", company=" + super.getCompany() +
				", width=" + width +
				'}';
	}
}
