package com.inheritance;

public class ElectronicProducts extends Product{
	boolean isWarranty;
	int warrantyInYears;
	public ElectronicProducts(String prodName, String prodDescription, boolean isWarranty, int warrantyInYears) {
		super(prodName, prodDescription);
		this.isWarranty = isWarranty;
		this.warrantyInYears = warrantyInYears;
	}
	void details()
	{
		System.out.println("\nElectronic product details\n");
		super.details();
		System.out.println("Warranty yes: "+this.isWarranty);
		System.out.println("Warranty years: "+this.warrantyInYears);
		System.out.println("\n-----------------------\n");
		
	}

}
