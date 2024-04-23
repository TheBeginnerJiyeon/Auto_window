package com.multi.practice.stream;

import java.io.FileWriter;
import java.io.Writer;

public class Writer3 {
	public static void main(String[] args) throws Exception {
		Writer writer=new FileWriter("C:/Temp/test0.txt");
		char[] arr={'j','a','v','a','s'};
		
		writer.write(arr, 1, 3);

		writer.flush();
		writer.close();
		
		
	}
	
	
	
}
