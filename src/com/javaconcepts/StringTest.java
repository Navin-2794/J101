package com.javaconcepts;

public class StringTest {
	
	static String ss;
	static String ss1 = "";
	
	public static void main(String[] args) {
		
		String s = "I am a Java Programmer ";
		String s1 = "  Java  ";
		String s2 = "java";
		int length = s.length();
		System.out.println(length);
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		boolean equals = s1.equals(s2);
		System.out.println(equals);
		
		boolean equalsIgnoreCase = s1.equalsIgnoreCase(s2);
		System.out.println(equalsIgnoreCase);
		
		boolean startsWith = s.startsWith("I am a");
		System.out.println(startsWith);
		
		boolean contains = s.contains("er");
		System.out.println(contains);
		
		char charAt = s.charAt(22);
		System.out.println(charAt);
		
		int indexOf = s.lastIndexOf('a');
		System.out.println(indexOf);
		
		System.out.println(s1);
		
		String trim = s1.trim();
		System.out.println(trim);
		
		boolean empty = ss1.isEmpty();
		System.out.println(empty);
		
		String replace = s2.replace("a", "ee");
		System.out.println(replace);
		
		String concat = s1.concat(s2);
		System.out.println(concat);
		
		String[] split = s.split(" ");
		for(String word : split) {
			System.out.println(word);
		}
		
		String substring = s.substring(7, 11);	//int i=1; i<5;i++
		System.out.println(substring);
		
		String substring2 = s.substring(12);
		System.out.println(substring2);
		
	}

}
