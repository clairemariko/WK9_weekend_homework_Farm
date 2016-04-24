package com.codeclan.cs;


import java.util.ArrayList;



public class FarmAnimals {

	protected String type;
	protected int price;
	protected ArrayList<Food> stomach;
	
	
	public FarmAnimals(){
		stomach = new ArrayList<Food>();
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
	
public ArrayList<Food> getStomach() {
		
		return (ArrayList<Food>) stomach.clone();
	}
	
}
