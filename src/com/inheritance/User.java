package com.inheritance;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SavingAccount user1 = new SavingAccount();
//		user1.openSavingBankAccount("Jatin", "BTM 1st stage blr", "Saving");
		
		Product product1 = new ElectronicProducts("Mac", "Fast and flexible", true, 3);
		product1.details();
		Product product2 = new ClothingProduct("Shirt", "well fitted and comfort", "cotton", "normal machine wash", "all except funera");
		
		product2.details();

	}

}
