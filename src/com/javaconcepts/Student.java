package com.javaconcepts;

public class Student {

	// Default Constructor
//	public Student() {
//
//	}

	// Non-Parameterized Constructor
	public Student() {
//		this("nvn");
		System.out.println("Non - Parameterized cons");
	}

	// Parameterized Constructor
	public Student(String name) {
		this("nvn",12);
		System.out.println("Parameterized cons");	
	}

	public Student(String name, int id) {
		System.out.println("Overloaded cons");
	}

	public void getStudentDetails() {
		System.out.println("Student details");
	}

	public void getStudentDetails(String id) {
		
		System.out.println("Student details : " + id);
		this.getStudentDetails(id, 24);
		this.getStudentDetails();
	}

	public void getStudentDetails(String name, int id) {
		System.out.println("Student details : " + id + " " + name);
	}

	public void getStudentDetails(int id, String address) {
		System.out.println("Student details : " + address + "    " + id);
	}

	public static void main(String[] args) {
		Student s = new Student();	//Calling Non-parameterized cons
//		Student s1 = new Student("nvn");  //Calling Parameterized cons
		
	}

}
