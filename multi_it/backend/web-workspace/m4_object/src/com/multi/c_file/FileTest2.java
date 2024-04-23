package com.multi.c_file;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest2 {
	public static void main(String[] args) {
		
		String s1 = JOptionPane.showInputDialog("날짜입력");
		String s2 = JOptionPane.showInputDialog("제목입력");
		String s3 = JOptionPane.showInputDialog("내용입력");
		
		FileWriter file = null;
		
		//컴파일 에러, 개발자가 exception 처리를 해야한다.
		// alt enter: 자동 고침 또는 throw exception을 위에
		try {
			file = new FileWriter(s1 + ".txt");
			
			file.write(s1 + "\n"); //\n이면 엔터를 넣어준다.
			file.write(s2 + "\n");
			file.write(s3 + "\n");
			
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일 저장 중 에러 발생");
		} finally {
			if (file != null) {
				try {
					file.close();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			
			
		}
		
		
	}
	
	
}
