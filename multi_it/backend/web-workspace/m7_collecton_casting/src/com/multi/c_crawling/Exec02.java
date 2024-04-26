package com.multi.c_crawling;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Exec02 {
	
	public static void main(String[] args) {
		
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930");
		Document doc1 = null;
		
		try {
			doc1 = con.get();
			// 트라이 안에 다 담기!!!
			Elements list1 = doc1.select(".blind");
		/*System.out.println(list1);
		System.out.println(list1.text());
		System.out.println(list1.size());*/
			
			//전일가
			Elements list = doc1.select("td.first").select(".blind");
			// 메소드 체이닝
		
		/*System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(0).text());*/
		
		
		/*for(int i=0;i<list1.size();i++) {
			Element tag= list1.get(i);
			System.out.println(tag);
		}*/
			
			Element tag1 = list.get(0);
			/*System.out.println(tag1);*/
			System.out.println("전월가:" + tag1.text());
			Element tag2 = list.get(1);
			/*System.out.println(tag2);*/
			System.out.println("시가: " + tag2.text());
			
			Elements list11 = doc1.select("div.today").select(".blind");
			/*System.out.println(list11);*/
			
			Element tag22 = list11.get(0);
			System.out.println("현재가: " + tag22.text());

			/*전월가:76,300
			시가: 77,800
			현재가: 76,900*/
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
		
	}
	
	
}
