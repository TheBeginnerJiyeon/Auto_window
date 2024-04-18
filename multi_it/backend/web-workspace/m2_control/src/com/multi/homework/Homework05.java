package com.multi.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Homework05 {
	
	public static void main(String[] args) throws ParseException {
		//1. date를 사용
		Date now = new Date();
		int hour = now.getHours();
		if (hour < 11) {
			System.out.println("굿모닝" + "\n");
		} else if (hour < 15) {
			System.out.println("굿애프터눈" + "\n");
		} else if (hour < 19) {
			System.out.println("굿이브닝" + "\n");
		} else {
			System.out.println("굿나잇" + "\n");
		}
		
		
		//2. date를 사용
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		String[] datas = new String[13];
		
		for (int i = -1; i <= 11; i++) {
			datas[i + 1] = sdf.format(new Date(2024 - 1900, i + 1, 1));
		}
		
		
		Date[] dates = new Date[13];
		
		for (int d = 0; d < 13; d++) {
			dates[d] = sdf.parse(datas[d]);
		}
		
		
		long[] days_diff = new long[12];
		
		for (int d = 0; d < 12; d++) {
			long d1 = dates[d].getTime() / 24 / 3600 / 1000;
			long d2 = dates[d + 1].getTime() / 24 / 3600 / 1000;
			days_diff[d] = d2 - d1;
		}
		
		for (int i = 0; i < 12; i++) {
			System.out.println(i + 1 + "월은 " + days_diff[i] + "일까지 있습니다." + "\n");
		}
		
		
	}
	
	
}
