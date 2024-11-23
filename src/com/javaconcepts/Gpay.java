package com.javaconcepts;

public class Gpay extends SBI{
	
	public void billPayment(int amount) {
		super.billPayment(amount);
		System.out.println("Paid amount is : "+(amount*0.98));
	}
	
	public static void main(String[] args) {
		Gpay g = new Gpay();
		g.billPayment(1000);
	}

}
