package com.codeclan.cs;

public class AnimalNotFoundException extends Exception{
	
	public AnimalNotFoundException(FarmAnimals animal){
		super("Sorry the animal you are trying to buy is not in stock"+ animal);
	}

}
