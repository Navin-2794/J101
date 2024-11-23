package com.javaconcepts;

public class Variabletest {
	
	//Class Variable with initialization
	String name = "kumar" ;
	
	//Class Variable without initialization
	int age;
	
	static String city ;
	//Final variable should be assigned
	final String code = "Not found";
	
	public void getData() {
		//Final variable value cannot be reassigned
		code = "Unauthorized";
		
		//Local Variable 
		int salary = 20000;
		//Value Assigning for class Variable
		age = 30;
		String place;
		//Local Variable cannot be used without Initialization
		//System.out.println(place);
		city = "Salem";
		name = "Navin";
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
		
	}
	
	public void getData1() {
		//Local Variable cannot be accessed in other methods
		//System.out.println(salary);
		final int num = 100;
		
		System.out.println(city);
		System.out.println(name);
	}

	public static void main(String[] args) {
		
		System.out.println(city);
		
		Variabletest v = new Variabletest();
		
		System.out.println(v.name);
		
		
		
		
	}

	
	
}
