package com.multi.practice.aa11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ObjectStreamExample {
	public static void main(String[] args) throws Exception {
		
		writeList();
		List<Board> list=readList();
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		for(Board board : list) {
			System.out.println(board.getBno()+"\t"+board.getTitle()+"\t"+board.getWriter()+"\t"+sdf.format(board.getDate()));
		}
	
	}
	
	
	public static void writeList() throws Exception {
		
		List<Board> list = new ArrayList<>();
		list.add(new com.multi.practice.aa11.Board(1, "제목", "내용", "글쓴이1", new Date()));
		list.add(new com.multi.practice.aa11.Board(2, "제목", "내용", "글쓴이2", new Date()));
		list.add(new com.multi.practice.aa11.Board(3, "제목", "내용", "글쓴이3", new Date()));
		
		FileOutputStream fos = new FileOutputStream("C:/Temp/board.db");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.flush();
		oos.close();
		
		
	}
	
	public static List<Board> readList() throws Exception {
		
		FileInputStream fis=new FileInputStream("C:/Temp/board.db");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Board> list = (List<Board>) ois.readObject();
		return list;
	
	
	}
}





