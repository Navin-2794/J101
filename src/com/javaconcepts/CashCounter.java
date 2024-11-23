package com.javaconcepts;

public class CashCounter extends Reliance{

	@Override
	public void getSpeaker() {
		System.out.println("Pay by cash");
	}
	
//	@Override
//	public void purchaseDress() {
//		System.out.println("Pay by card");
//	}
	
	
	public static void main(String[] args) {
		CashCounter c = new CashCounter();
		c.getSpeaker();
		c.purchaseDress();
	}

}
