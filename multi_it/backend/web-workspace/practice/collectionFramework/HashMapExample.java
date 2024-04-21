package com.multi.practice.collectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("신용권", 85);
		map.put("최민정", 90);
		map.put("박민작", 95);
		map.put("홍길종", 85);
		
		System.out.println(map.size());
		
		System.out.println(map.get("홍길동"));
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			
			System.out.println("\t" + key + ":" + value);
		}
		
		
		map.remove("신용권");
		System.out.println(map.size());
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + ":" + value);
			
			
		}
		
		map.clear();
		
		System.out.println(map.size());
		
		
	}
	
	
}
