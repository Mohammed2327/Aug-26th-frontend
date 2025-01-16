package com.abstraction;

interface Transaction{
	public abstract void ProcessPayment(double amount); // abstract method
}

class CreditCardTransaction implements Transaction{

	@Override
	public void ProcessPayment(double amount) {
		double perc = 1.5;
		System.out.println("Done with Credit card payment: " +(amount*perc));
		
	}
	
}

class PayPalTransaction implements Transaction{

	@Override
	public void ProcessPayment(double amount) {
		double pf = 3.0;
		System.out.println("Done with paypal transaction :" +(amount*pf));
	}
	
}


public class BankTransaction implements Transaction{

	@Override
	public void ProcessPayment(double amount) {
		System.out.println("Bank Transaction completed with amount: " +amount);
		
	}
	
	public static void main(String[] args) {
		CreditCardTransaction cct = new CreditCardTransaction();
		cct.ProcessPayment(25600.45);
		
		PayPalTransaction ppl = new PayPalTransaction();
		ppl.ProcessPayment(6245.63);
		
		BankTransaction bt = new BankTransaction();
		bt.ProcessPayment(89000.0);
	}

}
