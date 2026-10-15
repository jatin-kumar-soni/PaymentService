package com.inheritance;

public class Product {
	String prodName;
	String prodDescription;
	public Product(String prodName, String prodDescription) {
		super();
		this.prodName = prodName;
		this.prodDescription = prodDescription;
	}
	void details()
	{
		System.out.println("Product Name: "+this.prodName);
		System.out.println("Product Description: "+this.prodDescription);
		
	}

}
