package com.javaconcepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandling {

	public void multiException() throws InterruptedException, FileNotFoundException {
		System.out.println("wait for 10 sec");
		Thread.sleep(10000);

		FileInputStream fis = new FileInputStream(new File("C:\\Users\\User\\Desktop\\Docs\\0209.txt"));
		System.out.println("Hi");
	}

	public static void main(String[] args) throws Exception {

		ExceptionHandling e = new ExceptionHandling();
		e.multiException();

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			System.out.println(a / b);
		} catch (Exception e1) {
			e1.printStackTrace();
			System.out.println("catch block");
		} finally {
			System.out.println("Finally block executed");
		}
		System.out.println("Hello");
	}

}
