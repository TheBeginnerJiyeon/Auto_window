package com.multi.practice.stream;

import java.io.FileWriter;
import java.io.Writer;

public class WriteText {
	public static void main(String[] args) throws Exception {
		Writer writer=new FileWriter("C:/Temp/test7.txt");
		char a='A';
		char b='B';
		char c='C';
		char d='D';
		
		writer.write(a);
		writer.write(b);
		writer.write(c);
		writer.write(d);
		
		writer.flush();
		writer.close();
		
		
		
	}
	
	
	
}
