package com.codeclan.cs;

public class AnimalWasNullException extends Exception {
	
	public AnimalWasNullException(FarmAnimals animal){
		super("This animal is invalid" + animal);
	}
	

}
