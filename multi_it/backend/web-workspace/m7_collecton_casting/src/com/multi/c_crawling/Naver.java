package com.multi.c_crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Arrays;

public class Naver {
	
	
	public String[] crawl(String code) {
		String[] result = null;
		try {
			Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + code).get();
			
			Elements list = doc.select("h2>a");
			
			/*System.out.println(list);*/
			
			String name;
			if (!list.isEmpty()) {
				name = list.get(0).text();
				
				Elements list2 = doc.select("span.code");
				String code2 = list2.get(0).text();
				
				Elements list1 = doc.select("div.today").select(".blind");
				
				String now = list1.get(0).text();
				String dif = list1.get(1).text(); //차이
				String percent = list1.get(2).text(); //증감비율
				result = new String[]{name, code, now, dif, percent};
				
				
				System.out.println(Arrays.toString(result));
				System.out.println("회사이름 : " + name);
				System.out.println("회사코드: " + code2);
				System.out.println("현재가: " + now);
				System.out.println("어제와의 차이: " + dif);
				System.out.println("증감비율: " + percent);
				
				System.out.println("---------------------------------");
				
				
			}
			
			
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
		
		return result;
		
	}
	
	
}

