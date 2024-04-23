package com.multi.a_constructor;

public class BoardMain {
	public static void main(String[] args) {
		
		//객체 3개 생성
		Board board1 = new Board(1, "제목1",
				"건의1", "안지연");
		
		Board board2 = new Board(2, "제목2",
				"건의2", "제니");
		
		Board board3 = new Board(3, "제목3",
				"건의3", "이순신");
		
		
		System.out.println(board1.toString());
		System.out.println(board2.toString());
		System.out.println(board3.toString());
		
		
		
		
		
		
	}
	
	
}
