package com.javaconcepts1;

import com.javaconcepts.AccessSpecifiersTest;

public class MultilevelInheritance extends AccessSpecifiersTest{
	
	public void getStudentDetails() {
		int a = 100;
		byte b = (byte)a;
		
		System.out.println("multi level");
	}
	public void getStudentAddress() {
		System.out.println("Override method");
	}
	
	
	public static void main(String[] args) {
		//This object can access both parent and child method
		MultilevelInheritance m = new MultilevelInheritance();
		
		//This object can access only parent method
		AccessSpecifiersTest a = new AccessSpecifiersTest();
		a.getStudentAddress();
		
		//This object can access only the Parent method
		//Upcasting
		AccessSpecifiersTest a1 = new MultilevelInheritance();
		a1.getStudentAddress();
		a1.getStudentId();
		
		//Downcasting
		MultilevelInheritance m1 = (MultilevelInheritance)new AccessSpecifiersTest();
		m1.getStudentAddress();
		
	}
	
	

}
