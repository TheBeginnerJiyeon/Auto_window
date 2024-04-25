package com.multi.Thread1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Write {
	
	public void Method3(){
		BufferedReader bf= null;
		try {
			bf= new BufferedReader(new FileReader(""));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(bf!=null){
				try {
					bf.close();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}
		
	}
	
	
}
