package com.multi.c_file;

import java.io.File;
import java.util.Arrays;

public class FileTest {
	
	public static void main(String[] args) throws Exception {
		
		
		File f=new File("test.txt");
		f.createNewFile();
		
		boolean result= f.exists();
		
		System.out.println(result);
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		System.out.println(f.getPath());
		System.out.println(f.getName());
		System.out.println(f.getParent());
		System.out.println(f.getAbsolutePath());
		
		
		System.out.println("------------");
		
		
		//folder
		File folder = new File("parent"); //folder == directory == package
		folder.mkdir();// 실제로 만들어준다.
		System.out.println(folder.isDirectory());
		String[] list = folder.list();
		System.out.println(Arrays.toString(list));
		System.out.println(folder.getParent());
		
	
	}




}
