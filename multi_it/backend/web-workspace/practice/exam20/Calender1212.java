package com.multi.practice.exam20;

import java.util.*;

public class Calender1212 {
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		String strWeek = null;
		
		switch (week) {
			case Calendar.MONDAY:
				strWeek = "월";
				break;
			
			case Calendar.TUESDAY:
				strWeek = "화";
				break;
			
		}
		
		int amPm=now.get(Calendar.AM_PM);
		
		String strAmPm = null;
		
		if(amPm== Calendar.AM) {
			strAmPm = "오전";
		}else {
			
			strAmPm="오후";
			
		}
		
		int hour=now.get(Calendar.HOUR);
		int minute=now.get(Calendar.MINUTE);
		int second=now.get(Calendar.SECOND);
		
		System.out.println(year + "년 " + month + "월 " + day + "일 " + strWeek + "요일" + hour + "시 " + minute + "분 " + second + "초 " + strAmPm);
		
		
		
		
		
		
	}
	

	
	
}



