package com.multi.practice.stream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {
	public static void main(String[] args) throws Exception {
		
		OutputStream os = new FileOutputStream("C:/Temp/test1.db");
		
		byte a = 100;
		byte b = 120;
		byte c = 20;
		
		os.write(a);
		os.write(b);
		os.write(c);
		
		
		
		
		
		
		os.flush();
		os.close();
		
		
	}
	
	
}
