package com.multi.practice.collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapExamplw2 {
	public static void main(String[] args) {
		Map<Student, Integer> map=new HashMap<Student, Integer>();
		
		map.put(new Student(1,"홍길동"),95);
		map.put(new Student(1,"홍길동"),95);
		
		System.out.println(map.size());
		
		
		
		
		
		
	}
}
