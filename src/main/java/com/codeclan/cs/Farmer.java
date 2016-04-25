package com.codeclan.cs;


import java.util.ArrayList;

public class Farmer {
	

	
	protected ArrayList<FarmAnimals> animalStock;
	
	public Farmer(){
		animalStock = new ArrayList<FarmAnimals>();
		
	}
	
	 public boolean buy(FarmAnimals animal){
		 return animalStock.add(animal);
	 }
	 
	 public ArrayList<FarmAnimals> getanimalStock(){
		 return animalStock;
	 }
	 
	 public boolean sell(FarmAnimals animal){
		 return animalStock.remove(animal);
	 }
	 
	 public boolean bought(FarmAnimals animal) throws AnimalNotFoundException{
		return false;
		 
	 }
	 
}
	 
	 


