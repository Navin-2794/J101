package com.javaconcepts1;

public class ConditionalStmnt {
	static int code = 475;
	public static void main(String[] args) {
		
		
		switch(code) {
		case 400:
			System.out.println("Bad request");
			break;
			
		case 401:
			System.out.println("Unautorized");
			break;
			
		case 404:
			System.out.println("NOt found");
			
		default:
			System.out.println("Not a valid request");
		
			
		}
		
		
	}

}
