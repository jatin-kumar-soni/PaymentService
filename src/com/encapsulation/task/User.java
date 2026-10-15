package com.encapsulation.task;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment user1 = new Payment("Jatin","45679834",1200);
		Payment user2 = new Payment("Aman","123435",200);
		user1.doTransaction(user2);

	}

}
