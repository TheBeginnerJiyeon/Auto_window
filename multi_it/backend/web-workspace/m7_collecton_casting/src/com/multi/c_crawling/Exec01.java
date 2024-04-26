package com.multi.c_crawling;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Exec01 {
	
	public static void main(String[] args) {
		
		
		
		
		//크롤링 순서
		//1. 사이트 연결
		//2. 해당 페이지 다운로드(html)
		//3. 원하는 위치의 정보를 추출해냄
		
		/*Connection con = Jsoup.connect("https://www.naver.com");
		System.out.println("1. 사이트 연결 성공!!");
		
		Document doc = null;
		try {
			doc = con.get();
			System.out.println("2. 해당 페이지 다운로드 성공!!"); //index.html
			System.out.println("-----------------------");
			*//*System.out.println(doc);*//*
			System.out.println("3. 원하는 위치의 정보를 추출 성공!!!");
			
			Elements list= doc.select("a"); // Arraylist 타입으로 넘어온다
			System.out.println(list.size());
			
			for(int i=0; i<list.size(); i++) {
				Element tag= list.get(i);
				System.out.println(tag); // Element는 태그를 나타냄
				System.out.println(tag.text());
				
			}
			
			
			
		} catch (IOException e) {
			throw new RuntimeException(e);
		}*/
		
		Connection con1 = Jsoup.connect("https://naver.com/");
		Document doc = null;
		try {
			doc = con1.get();
			Elements list1 = doc.select("div");
			System.out.println(list1);
			System.out.println(list1.size());
			for (int i = 0; i < list1.size(); i++) {
				System.out.println(list1.get(i));
				System.out.println(list1.get(i).text());
			}
		
		
		
		
		
		
		
		/*Document doc1=null;
		try {
			Connection con2= Jsoup.connect("https://news.naver.com/");
			doc1 = con2.get();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
		
		
		System.out.println(doc1);
		
		Elements list2= doc1.select("span");
		System.out.println(list2);
		System.out.println(list2.size());
		
		for(int i=0; i<list2.size(); i++) {
			System.out.println(list2.get(i));
			System.out.println(list2.get(i).text());
		}
		*/
		
		
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
		
	}
	
	
}
