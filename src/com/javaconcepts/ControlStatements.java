package com.javaconcepts;

public class ControlStatements {
	int j = 7;
	public void forLoop() {
		for(int i=1;i<=10;i++) {		//10>=1  10 9>=1 9
			if(i==5  || i==7) {
				continue;
			}
			System.out.print(i);
		}
		System.out.println();
		System.out.println("After loop");
	}
	
	public void nestedForLoop() {
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
	public void whileLoop() {
		int i=100;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
	}
	
	public void doWhileLoop() {
		int i=100;
		do {
			System.out.println(i);
			i++;
		}while(i<=10);
	}
	
	public static void main(String[] args) {
		ControlStatements c = new ControlStatements();
//		c.forLoop();
		c.nestedForLoop();
		//		c.whileLoop();
//		c.doWhileLoop();
	}

}




//Print all the values from 1 to 100 except 25,50,75 and 100
//1Navin,2Navin,3Navin,4Navin,5Navin







