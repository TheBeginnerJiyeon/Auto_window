package com.multi.practice.collectionFramework;

import java.util.List;

public class Vector {
	
	public static void main(String[] args) {
		
		List<Board> list=new java.util.Vector<Board>();
		
		list.add(new Board("제목1","내용1","글쓴이1"));
		list.add(new Board("제목2","내용2","글쓴이2"));
		list.add(new Board("제목3","내용3","글쓴이3"));
		list.add(new Board("제목4","내용4","글쓴이4"));
		list.add(new Board("제목5","내용5","글쓴이5"));
		list.add(new Board("제목6","내용6","글쓴이6"));
		list.add(new Board("제목7","내용7","글쓴이7"));
		list.add(new Board("제목8","내용8","글쓴이8"));
		list.add(new Board("제목9","내용9","글쓴이9"));
		list.add(new Board("제목10","내용10","글쓴이10"));
		list.add(new Board("제목11","내용11","글쓴이11"));
		list.add(new Board("제목12","내용12","글쓴이12"));
		list.add(new Board("제목13","내용13","글쓴이13"));
		
		list.remove(2);
		list.remove(3);
		
		for(int i=0;i<list.size();i++) {
			Board board=list.get(i);
			System.out.println(board.subject+"\t"+board.content+"\t"+board.writer);
		}
		
		
		
		
		
	}
	
	
	
}
