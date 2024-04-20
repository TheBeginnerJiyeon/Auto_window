package com.multi.practice.exam20;

import java.text.SimpleDateFormat;
import java.util.Date;

public class formatdate {
	public static void main(String[] args) {
		
		Date now=new Date();
		String strNow1=now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 mm월 dd일 hh시 mm분 ss초");
		
		System.out.println(sdf.format(now));
		
		
		
		
		
		
	}
	
	
	
}
