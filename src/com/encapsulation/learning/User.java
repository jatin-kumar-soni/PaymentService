package com.encapsulation.learning;



public class User {

	public static void main(String[] args) {
		Payment user = new Payment(2000);
		user.doCredit(230);
		
		// failing encapsulation properties, other class cannot access data member directly
//		user.accountBalance=1000;
//		System.out.println(user.accountBalance);
		System.out.println("Current balance: "+user.getAccountBalance());
		user.doDebit(500);;
		System.out.println("Current balance: "+user.getAccountBalance());
		user.doCredit(-434);
		user.doDebit(1999);
	}

}
