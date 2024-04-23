package com.multi.practice.aa11;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class GetLineStringFromKeyboard {
	public static void main(String[] args) throws Exception{
		
		InputStream is=System.in;
		
		Reader reader=new InputStreamReader(is);
		
		BufferedReader br=new BufferedReader(reader);
		
		while (true){
			System.out.println("입력");
			String lineStr=br.readLine();
			if(lineStr.equals("exit")){
				break;
			}
			System.out.println(lineStr);
			System.out.println();
			
		}
		
		
		br.close();
		
		
		
		
		
	}
	
	
	
}
