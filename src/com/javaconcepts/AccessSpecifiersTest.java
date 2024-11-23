package com.javaconcepts;

public class AccessSpecifiersTest {
	
	
	public int age = 34;
	
	
	public void getStudentId() {
		System.out.println("public method");
	}
	
	private void getStudentName() {
		System.out.println("private method");
	}
	
	public void getStudentAddress() {
		System.out.println("Protected method");
	}
	
	void getStudentContact() {
		System.out.println("Default method");
	}
	
	public static void main(String[] args) {
		AccessSpecifiersTest a = new AccessSpecifiersTest();
		a.getStudentId();
		a.getStudentName();
		a.getStudentAddress();
		a.getStudentContact();
	}

}
