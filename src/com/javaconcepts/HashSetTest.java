package com.javaconcepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTest {

	public void hashsetTest() {
		Set<Integer> set = new HashSet<>();
		set.add(34);
		set.add(35);
		set.add(24);
		set.add(64);
//		set.add(null);
//		set.add(null);
		set.add(54);
		set.add(33);
		set.add(34);
		set.add(24);

		System.out.println("Set before merge: "+set);

		List<Integer> list = new ArrayList<>();

		list.add(24);
		list.add(null);
		list.add(45);
		list.add(34);
		list.add(34);
		list.add(34);
		list.add(34);
		
		System.out.println("List before merge : "+list);
		
//		list.addAll(set);	
//		System.out.println("List after merge : "+list);
		
//		set.addAll(list);	
//		System.out.println("Set after merge: "+set);
		
//		list.retainAll(set);
//		System.out.println("List after retain : "+list);
		
//		list.removeAll(set);
//		System.out.println("List after remove : "+list);
		
		
//		Iterator<Integer> itr = set.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		ListIterator<Integer> itr1 = list.listIterator();
		while(itr1.hasPrevious()) {
			System.out.println(itr1.previous());
		}
		
		System.out.println("********************");
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		

		
		

	}

	public static void main(String[] args) {
		HashSetTest h = new HashSetTest();
		h.hashsetTest();
	}

}
