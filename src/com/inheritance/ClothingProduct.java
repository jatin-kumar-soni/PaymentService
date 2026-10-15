package com.inheritance;

public class ClothingProduct extends Product  {
	String typeOfCloth;
	String typeOfWash;
	String occasion;
	public ClothingProduct(String prodName, String prodDescription, String typeOfCloth, String typeOfWash,
			String occasion) {
		super(prodName, prodDescription);
		this.typeOfCloth = typeOfCloth;
		this.typeOfWash = typeOfWash;
		this.occasion = occasion;
	}
	
	void details()
	{
		System.out.println("\nCloth product details\n");
		super.details();
		System.out.println("Type of Cloth: "+ this.typeOfCloth);
		System.out.println("Type of Wash: "+ this.typeOfWash);
		System.out.println("Occasion: "+ this.occasion);
		System.out.println("\n-----------------------\n");
	}


}
