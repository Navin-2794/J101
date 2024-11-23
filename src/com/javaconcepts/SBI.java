package com.javaconcepts;

public class SBI {
	
	public void billPayment(int amount) {
		System.out.println("Paid amount : "+amount);
	}
	
	public static void main(String[] args) {
		SBI s = new SBI();
		s.billPayment(1000);
	}

}
