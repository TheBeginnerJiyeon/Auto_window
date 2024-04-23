package com.multi.homework;

public class Calculator3 {
	
	
	public String sum(int count1, int count2) {
		int result=count1+count2;
		return "오늘 온 손님의 총 합은 "+result+"입니다.";
	}
	
	public int sum2(int count1, int count2) {
		int result=count1+count2;
		return result;
	}
	
	public String diff(int count1, int count2) {
		int result=count1-count2;
		return "손님 수 차이는 "+result+"입니다.";
	}
	
	public String total1(int count1, int price) {
		int result=count1*price;
		return "오전 결제금액은 "+result+"입니다.";
	}
	
	public String total2(int price,int count2) {
		int result=count2*price;
		return "오후 결제금액은 "+result+"입니다.";
	}
	
	public String total2(int price,int count2, int count1) {
		int result=count1*price+count2*price;
		return "오늘 하루 총 결제금액은 "+result+"입니다.";
	}
	
	public int total3(int price,int count2, int count1) {
		int result=count1*price+count2*price;
		return result;
	}
	
	public String avg(int total, int sum) {
		int result=total/sum;
		return "1인당 결제금액은 "+result+"입니다.";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
