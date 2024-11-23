package com.javaconcepts;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	
	public void arrayListTest() {
		List<Integer> l = new ArrayList<>();
		
		l.add(23);
		l.add(null);
		l.add(45);
		l.add(34);l.add(34);l.add(34);l.add(34);
		
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.get(4));
		System.out.println(l.indexOf(34));
		
		System.out.println(l.remove(2));
		System.out.println(l.size());
		System.out.println(l.contains(45));
		l.set(1, 67);
		System.out.println(l);
		
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		System.out.println("****************");
		for(Integer i : l) {
			System.out.println(i);
		}
		
	}
	
	public static void main(String[] args) {
		ArrayListTest ar = new ArrayListTest();
		ar.arrayListTest();
	}

}
