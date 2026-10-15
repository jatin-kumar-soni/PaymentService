package com.inheritance;

public class SavingAccount extends Account {
	
	public void openSavingBankAccount(String name,String address,String type)
	{
		openBankAccount(name, address, type);
		System.out.println("\nNow you are the part of Bank");
	}
}
