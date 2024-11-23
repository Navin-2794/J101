package com.javaconcepts;

import java.util.Scanner;

public class ScannerTest {
	Scanner sc = new Scanner(System.in);

	public void primitiveType() {

		int num = sc.nextInt();

		System.out.println(num * 2);
	}

	public void StringTest() {
		String str = sc.next();

		System.out.println(str);
	}

	public void StringTest1() {
		String str = sc.nextLine();

		System.out.println("Entered String is : " +str);
	}
	
	public void CharTest() {
		char c = sc.next().charAt(0);
		System.out.println("Char is : "+c);
	}

	public static void main(String[] args) {
		ScannerTest s = new ScannerTest();
		s.StringTest1();						//Java is a programming language
		s.primitiveType();						//25
		s.CharTest(); 							//a
		s.StringTest();							//Java program
								
	}

}
