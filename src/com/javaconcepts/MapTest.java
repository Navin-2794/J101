package com.javaconcepts;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {
	
	public void hashMapTest() {
		Map<String, Integer> stu_details = new HashMap<>();
		
		stu_details.put("cs001", 34);
		stu_details.put("cs002", 23);
		stu_details.put("cs014", 67);
		stu_details.put("cs006", 34);
		stu_details.put("cs002", 78);
		stu_details.put("cs003", 33);
		stu_details.put("cs007", 34);
		
		System.out.println(stu_details.size());
		System.out.println(stu_details);
		
		System.out.println(stu_details.get("cs006"));
		
		System.out.println(stu_details.containsKey("cs006"));
		
		System.out.println(stu_details.containsValue(23));
		
		Set<String> keySet = stu_details.keySet();
		System.out.println(keySet);
		
		Collection<Integer> values = stu_details.values();
		System.out.println(values);
		
		System.out.println(stu_details.entrySet());
		
		for(Entry<String, Integer> e : stu_details.entrySet()) {
			System.out.println(e);
		}
		
		
		
	}
	
	public static void main(String[] args) {
		MapTest m = new MapTest();
		m.hashMapTest();
	}

}
