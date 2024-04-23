package com.multi.practice.stream;

import java.io.FileReader;
import java.io.Reader;

public class Read6 {
	public static void main(String[] args) throws Exception {
		
		Reader reader=new FileReader("C:/Temp/test0.txt");
		
		char[] buffer=new char[5];
		
		int readCharNum=reader.read(buffer,0,3);
		
		if(readCharNum!=-1) {
			for(int i=0;i<readCharNum;i++) {
				
				System.out.println(buffer[i]);
				
			}
		}
		
		reader.close();
		
	}
}
