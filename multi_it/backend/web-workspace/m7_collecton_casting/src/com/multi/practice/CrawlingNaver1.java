package com.multi.practice;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class CrawlingNaver1 {
	public static void main(String[] args) {
		
		Connection conn= Jsoup.connect("https://www.naver.com");
		
		Document doc1= null;
		
		try {
			doc1=conn.get();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
		Elements list1= doc1.select("a");
		
		System.out.println(list1);
		System.out.println(list1.size());
		
		for(int i=0; i<list1.size(); i++) {
			Element e= list1.get(i);
			System.out.println(e);
			System.out.println(e.text());
			
		}
		
		
		
		
	}
}
