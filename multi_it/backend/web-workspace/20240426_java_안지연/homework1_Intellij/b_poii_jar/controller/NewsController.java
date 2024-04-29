package com.multi.homework.b_poii_jar.controller;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;


public class NewsController {
	
	public void crawl(JLabel label, JLabel label2, JTextArea t1) {
		
		
		try {
			
			Document doc = Jsoup.connect("https://media.naver.com/press/014?sid=105#lnb").get();
			
			// 기사 제목, 시간 넣기
			String qNews = "li.press_edit_news_item";
			String qTitle = "span.press_edit_news_title";
			String qTime = "span.is_outdated";
			
			int newsSize = doc.select(qTitle).select(qTitle).size();
			
			int i = new Random().nextInt(newsSize);
			
			String title = doc.select(qNews).select(qTitle).get(i).text();
			String time = doc.select(qNews).select(qTime).get(i).text();
			t1.append("기사 제목 : " + title + "\n");
			t1.append("경과 시간 : " + time + "\n");
			t1.append("-----------------------------------\n");
			
			// 출력하고 단어 수 세기
			
			label.setText("Characters: " + title);
			
			String[] wordsList = title.split(" ");
			label2.setText("Words: " + wordsList.length + "개");
			
			
			// 파일로 저장 : NoClassDefFoundError로 인해 메이븐 빌드로 따로 제출했습니다.
			
			
			
			
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
		
	}
	
	public void addPic(JFrame f, JLabel label4) {
		// 사진 넣기
		label4 = new JLabel("");
		label4.setBounds(90, 630, 600, 400);
		
		String urlText;
		URL url;
		
		try {
			urlText = Jsoup.connect("https://media.naver.com/press/014?sid=105#lnb").get().select("img").attr("src");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
		try {
			url = new URL(urlText);
			
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		}
		
		Image image;
		try {
			image = ImageIO.read(url);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
		ImageIcon icon = new ImageIcon(image);
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(600, 400, Image.SCALE_SMOOTH);
		label4.setIcon(new ImageIcon(changeImg));
		
		f.add(label4);
		
	}
	
	
}
