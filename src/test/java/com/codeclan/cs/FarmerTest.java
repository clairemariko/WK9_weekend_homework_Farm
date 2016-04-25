package com.codeclan.cs;

import static org.junit.Assert.*;

import org.junit.*;

public class FarmerTest {
	
	//global var
	FarmAnimals animal;
	Farmer farmer;

	//set up the enviroment
	@Before
	public void setup(){
		FarmAnimals animal = new Cows();
		String type = "Highland";
		int price = 500;
		Farmer farmer = new Farmer();
		
	}
	
	@Test
	public void farmerBuyAnimal(){
		FarmAnimals animal1 = new Cows();
		Farmer farmer1 = new Farmer();
		farmer1.buy(animal1);
		assertEquals(animal1, farmer1.animalStock.get(0));	
	}
	
	@Test
	public void farmerSellAnimal(){
		FarmAnimals animal1 = new Cows();
		Farmer farmer1 = new Farmer();
		farmer1.buy(animal1);
		assertTrue(farmer1.getanimalStock().size()==1);
		boolean hasBought = false;
		
		try {
			hasBought = farmer1.buy(animal);
		} catch (AnimalNotFoundException e) {
			System.err.println(e.getMessage());
			fail("That animal is not in stock");
		} catch (AnimalWasNullException e) {
			
		} finally {
			
		}
		assertTrue(hasBought);
	}
	
	
	@Test(expected = AnimalNotFoundException.class)
	public void testhasBoughtUnsuccessful() throws AnimalNotFoundException {
		FarmAnimals animal2 = new Cows();
		Farmer farmer = new Farmer();
		
		
		try{
			farmer.buy(animal2);
			fail("Exception wasn't thrown");
		} catch(AnimalNotFoundException e){
			System.err.println(e.getMessage());
			throw new AnimalNotFoundException(animal);
		}
	}
	
	
}
