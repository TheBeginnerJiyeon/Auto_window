package com.multi.practice.stream;

import java.io.FileWriter;
import java.io.Writer;

public class Writet2 {
	public static void main(String[] args) throws Exception {
		Writer writer=new FileWriter("C:/Temp/test8.txt");
		char[] arr={'a','b','c','d','e'};
		writer.write(arr);
		
		writer.flush();
		writer.close();
		
		
	}
}
