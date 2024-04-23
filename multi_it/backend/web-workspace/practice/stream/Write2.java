package com.multi.practice.stream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Write2 {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test2.db");
		byte[] arr = {10, 20, 30, 40, 50};
		os.write(arr);
		
		os.flush();
		os.close();
		
	}
	
	
}
