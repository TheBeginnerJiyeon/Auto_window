package com.multi.homework;

import javax.swing.*;
import java.awt.*;

public class Food {
	
	private static String field = "음식";
	private static int total_count = 0;
	private static int total_price = 0;
	
	public Food() {
	
	}
	
	public void happy() {
		System.out.println("음식을 고르는 것은 행복합니다.");
	}
	
	public void button_click(Food j, String now, JTextField t1, JTextField t2, JLabel l2) {
		
		j.happy();
		Food f1 = new Food();
		t1.setText(f1.getTotal_count() + "개");
		t2.setText("결제금액 :      " + f1.getTotal_price() + "원");
		ImageIcon icon = new ImageIcon("src/com/multi/homework/img/" + now + ".jpg");
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(800, 600, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		l2.setIcon(changeIcon);
		
		System.out.println(f1.toString());
		System.out.println(j.toString());
		System.out.println();
		
	}
	
	public String getField() {
		return field;
	}
	
	public void setField(String field) {
		this.field = field;
	}
	
	public int getTotal_count() {
		return total_count;
	}
	
	public void setTotal_count(int total_count) {
		this.total_count = total_count;
	}
	
	public int getTotal_price() {
		return total_price;
	}
	
	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}
	
	
	@Override
	public String toString() {
		return "음식{" +
				"총 갯수=" + total_count +
				", 총 가격=" + total_price +
				'}';
	}
}
