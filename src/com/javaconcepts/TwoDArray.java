package com.javaconcepts;

public class TwoDArray {
	
	public void twoDArrayTest() {
		String[][] credentials = new String[10][2];

		credentials[0][0] = "Username";
		credentials[0][1] = "Password";
		credentials[1][0] = "User1";
		credentials[1][1] = "pass1";
		credentials[2][1] = "pass2";

		credentials[9][0] = "User9";
//		credentials[10][0] = "User10";
		
		for(int i=0;i<credentials.length;i++) {
			for(int j=0;j<credentials[i].length;j++) {
				System.out.print(credentials[i][j]+", ");
			}
			System.out.println();
		}
		System.out.println("**********************");
		for(String[] s : credentials) {			//credentials[][] -> String[] -> String
			for(String s1 : s) {
				System.out.print(s1+" ");
			}
			System.out.println();
		}
		
		
	}
	
	public static void main(String[] args) {
		TwoDArray t = new TwoDArray();
		t.twoDArrayTest();
	}

}
