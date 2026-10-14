package com.encapsulation.learning;

public class Payment {

	// public double accountBalance;  failing encapsulation properties, 
	//other class cannot access data member directly, it should not be public , should be private
	
	private double accountBalance;

	public Payment(double accountBalance) {
		super();
		this.accountBalance = accountBalance;
	}
	public void doCredit(double bal)
	{
		if(bal<0)
		{
			System.err.println("Invalid amount.. \n plesase try again");
			return;
		}
		this.accountBalance+=bal;
		System.out.println(bal+" credited successfully");
		
	}
	public void doDebit(double bal)
	{
		if(bal>this.accountBalance)
		{
			System.err.println("insufficent amount");
			return ;
			
		}
		
		this.accountBalance-=bal;
		System.out.println(bal+" debited successfully");
	}
	double getAccountBalance()
	{
		return this.accountBalance;
	}
	
	
}
