package com.multi.d_practice;

import javax.swing.*;
import java.awt.*;

public class Exec01 {
	public static void main(String[] args) {
		
		JFrame j = new JFrame();
		j.getContentPane().setLayout(new BorderLayout(0,0));
		
		
		
		JButton btn1=new JButton("중앙");
		j.getContentPane().add(btn1,BorderLayout.CENTER);
		
		JButton btn2=new JButton("서");
		j.getContentPane().add(btn2,BorderLayout.WEST);
		
		JButton btn3=new JButton("남");
		j.getContentPane().add(btn3,BorderLayout.SOUTH);
		
		JButton btn4=new JButton("북");
		j.getContentPane().add(btn4,BorderLayout.NORTH);
		
		JButton btn5=new JButton("동");
		j.getContentPane().add(btn5,BorderLayout.EAST);
		
		
		
		
		j.setSize(700,500);
		
		j.setVisible(true); // 반드시 잊지 말 것!!!
		
		
		
		
	}
	
}
