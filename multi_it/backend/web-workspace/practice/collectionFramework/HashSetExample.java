package com.multi.practice.collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		
		Set<String> set= new HashSet<String>();
		
		set.add("java");
		set.add("python");
		set.add("c++");
		set.add("c");
		set.add("java");
		
		int size= set.size();
		System.out.println(size);
		
		Iterator<String> iterator=set.iterator();
		
		while (iterator.hasNext()) {
			String element=iterator.next();
			System.out.println("\t"+element);
		}
		
		set.remove("c");
		
		System.out.println(set.size());
		
		iterator=set.iterator();
		
		for(String element:set) {
			System.out.println("\t"+element);
		}
		
		set.clear();
		
		if(set.isEmpty()) {
			System.out.println("비버있음");
		}
		
		
		
	}
	
	
	
}
