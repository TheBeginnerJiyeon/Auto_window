package com.multi.practice.collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		
		list.add("Java");
		list.add("Python");
		list.add("C++");
		list.add("C");
		list.add("Ruby");
		list.add("Java");
		
		int size=list.size();
		System.out.println("List size is "+size);
		
		
		
		String skill=list.get(2);
		System.out.println(skill);
		
		
		for(int i=0;i<list.size();i++) {
			String str=list.get(i);
			System.out.println(i+":"+str);
		}
		
		list.remove(2);
		list.remove(2);
		list.remove("Ruby");
		
		for(int i=0;i<list.size();i++) {
			String str=list.get(i);
			System.out.println(i+":"+str);
		}
		
		
		
		
		
		
	}
	
	
	
}
