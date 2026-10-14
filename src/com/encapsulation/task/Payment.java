package com.encapsulation.task;

import java.util.Scanner;

public class Payment {
	String accountHolderName;
	String accountNumber;
	private double balance;
	public Payment(String accountHolderName, String accountNumber, double balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
	public void doTransfer(double amount,Payment user2)
	{
		if(amount>=0)
		{
			this.balance-=amount;
			System.out.println(amount+ " Amount transferred successfully to user");
			user2.balance+=amount;
			System.out.println(amount+ " Amount credited successfully to "+user2.accountHolderName);
			
		}
		else {
			System.err.println("Amount is invalid \n please try again..");
			return;
		}

		
	}
	public void doWithdraw(double amount)
	{
		if(amount>this.balance)
		{
			System.err.println("Insuffiecent Account Balance");
			
		}
		this.balance-=amount;
		System.out.println(amount+" is withdraw successfully");
		
	}
	public void doCredit(double amount)
	{
		if(amount>=0)
		{
			this.balance+=amount;
			System.out.println(amount+" is Credited successfully");
			
		}
		else {
			System.err.println("Invalid Balance");
		
		}
		
		
	}
	public void doTransaction()
	{
		
		while(true)
		{
			System.out.println("1.Fund Transfer\n2.Withdrawl\n3.Credit\n4.Check Balance\n5.exit");
			System.out.print("Enter your choice: ");
			Scanner sc= new Scanner(System.in);
			int n=sc.nextInt();
			
			if(n==1)
			{
				System.out.print("Enter amount : ");
				double amt=sc.nextDouble();
				this.doTransfer(amt,null);
			}
			else if(n==2)
			{
				System.out.print("Enter amount : ");
				double amt=sc.nextDouble();
				this.doWithdraw(amt);
			}
			else if(n==3)
			{
				System.out.print("Enter amount : ");
				double amt=sc.nextDouble();
				this.doCredit(amt);
			}
			else if(n==4)
			{
				System.out.println("Current Balance: "+this.getBalance());
				
			}
			else if(n==5)
			{
				System.out.println("Thankyou for banking with us");
				System.exit(0);
				
			}
		}
	}
	
	
}
