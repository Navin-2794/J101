package com.javaconcepts;

public class ConditionalStatements {
	
	int age = 5;
	
//	public void verifyMajor() {
//		if(age >= 18) {
//			System.out.println("Major");
//		}else {
//			System.out.println("Minor");
//		}
//	}
	
	public void verifyMajor1() {
		if(age >= 18 && age <= 100) {
			System.out.println("Major");
		}else if(age >= 1 && age < 18){
			System.out.println("Minor");
		}else {
			System.out.println("Invalid age");
		}
	}
	
	int errorCode = 500;
	public void verifyErrorCodes() {
		
		switch(errorCode) {
		case 400:
			System.out.println("Bad request");
			break;
		case 401:
			System.out.println("Unauthorized");
			break;
		case 403:
			System.out.println("Forbidden");
			break;
		case 404:
			System.out.println("Not found");
			break;
		case 500:
			System.out.println("Internal Server error");
			break;
			default:
				System.out.println("Invalid error code");
		}
		
		
	}
	
	public static void main(String[] args) {
		ConditionalStatements c = new ConditionalStatements();
//		c.verifyMajor1();
		c.verifyErrorCodes();
	}

}

// 1 to 5  --> Child
// 6 to 17 --> Minor
//18 to 59 --> Major
//60 to 100 --> Senior Citizen
//Others --> Invalid age




