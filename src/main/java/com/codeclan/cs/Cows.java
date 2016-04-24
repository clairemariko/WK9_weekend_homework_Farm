package com.codeclan.cs;

public class Cows extends FarmAnimals {
	
	
		private String type;
		private int price;
		
	public Cows(){
		type = "highland";
		price = 250;
		
	}
	
	public Cows(int price){
		this();
		this.price = price;
	}

	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString(){
		return "Cow: {Type: "+type+", Price: "+price+"}";
	}

}
