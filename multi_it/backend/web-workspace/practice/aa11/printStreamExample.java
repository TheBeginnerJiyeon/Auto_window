package com.multi.practice.aa11;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class printStreamExample {
	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos=new FileOutputStream("C:/Temp/printstream.txt");
		
		PrintStream ps=new PrintStream(fos);
		
		ps.println("hello");
		ps.println("조ㅛ");
		
		ps.flush();
		ps.close();
		
		
		
		
	}
	
	
	
}
