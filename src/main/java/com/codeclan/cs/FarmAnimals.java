package com.codeclan.cs;


import java.util.ArrayList;



public class FarmAnimals {

	protected AnimalSound sound;
	protected String type;
	protected int price;
	protected ArrayList<AnimalFood> stomach;
	
	
	public FarmAnimals(){
		stomach = new ArrayList<AnimalFood>(5);
	}
	
	protected FarmAnimals(AnimalSound sound){
		this.sound = sound;
	}
	
	public String animalCall(){
		return sound.makeSound();
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
