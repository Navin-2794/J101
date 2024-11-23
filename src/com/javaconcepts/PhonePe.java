package com.javaconcepts;

public class PhonePe implements HDFC,ICICI{

	@Override
	public void billPayment() {
		System.out.println("Pay from HDFC");
	}

	@Override
	public void moneyTransfer() {
		System.out.println("Transfer from HDFC");
	}

	@Override
	public void getLoan() {
		System.out.println("Get loan from ICICI");
	}
	
	public static void main(String[] args) {
		PhonePe p = new PhonePe();
		p.
		
		p.billPayment();
		p.moneyTransfer();
		p.getLoan();
	}

}
