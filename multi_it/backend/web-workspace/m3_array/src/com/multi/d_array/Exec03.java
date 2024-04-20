package com.multi.d_array;

import javax.swing.*;

public class Exec03 {
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(500, 200);
		String[] header = {"a", "b", "c"}; // 테이블의 열 이름 설정
		String[][] contents = { // 테이블에 들어갈 데이터를 2차원 배열로 초기화 = {"a", "b", "c"};
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"}
		};
		
		contents[0][0] = "999"; //첫번째 행의 첫번째 열
		contents[3][1] = "123"; // 4번째 2번째....
		
		
		JTable table = new JTable(contents, header);
		
		JScrollPane scroll = new JScrollPane(table);
		
		f.getContentPane().add(scroll);
		f.setVisible(true);
		
		
		for (int i = 0; i < contents.length; i++) {
			for (int j=0; j < contents[i].length; j++) {
				System.out.print(contents[i][j] + " ");
			}
			System.out.println();
		}
		
	/*	999 2 3
		1 2 3
		1 2 3
		1 123 3
		1 2 3
		1 2 3
		1 2 3
		1 2 3
		1 2 3
		1 2 3
		1 2 3*/
		
		
		
	}
	
}
