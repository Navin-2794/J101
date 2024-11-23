package com.javaconcepts;

public class Access1 extends AccessSpecifiersTest{
	
	public void getStudentMarks() {
		System.out.println("Child method");
	}
	
	public static void main(String[] args) {
		Access1 a = new Access1();
		//Child object can use parent method
		a.getStudentAddress();
		a.getStudentContact();
		a.getStudentId();
		a.getStudentMarks();
		
		//Parent object cannot be able to access child methods
		AccessSpecifiersTest a1 = new AccessSpecifiersTest();
		a1.getStudentAddress();
		a1.getStudentContact();
		a1.getStudentId();
	}

}
