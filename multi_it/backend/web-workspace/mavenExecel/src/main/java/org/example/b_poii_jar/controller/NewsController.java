package org.example.b_poii_jar.controller;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;


public class NewsController {
	
	private static int count = 0;
	
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
			
			String str1 = "기사 제목";
			String str2 = "경과 시간";
			String str3 = "단어 길이";
			ArrayList strs= new ArrayList();
			strs.add(str1);
			strs.add(str2);
			strs.add(str3);
			
			
			t1.append(str1 + " : " + title + "\n");
			t1.append(str2 + " : " + time + "\n");
			t1.append("-----------------------------------\n");
			
			// 출력하고 단어 수 세기
			
			label.setText("Characters: " + title);
			
			String[] wordsList = title.split(" ");
			label2.setText(str3 + ": " + wordsList.length + "개");
			
			
			// 파일로 저장
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet("sheet11");
			count += 1;
			
			int rows = 1;
			int cols = 3;
			ArrayList data = new ArrayList();
			data.add(title);
			data.add(time);
			data.add(wordsList.length);
			System.out.println(data.get(0));
			System.out.println(data.get(1));
			System.out.println(data.get(2));
			
			
			XSSFRow row1 = sheet.createRow(0);
			for (int j = 0; j < 3; j++) {
				XSSFCell cell1 = row1.createCell(j);
				cell1.setCellValue(strs.get(j).toString());
			}
			
			XSSFRow row = sheet.createRow(1);
			for (int j = 0; j < 3; j++) {
				XSSFCell cell = row.createCell(j);
				cell.setCellValue(data.get(j).toString());
			}
			
			
			String path = "src/main/java/org/example/b_poii_jar/excelFile" + count + ".xlsx";
			FileOutputStream fOut = new FileOutputStream(path);
			workbook.write(fOut);
			fOut.close();
			workbook.close();
			
			
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
