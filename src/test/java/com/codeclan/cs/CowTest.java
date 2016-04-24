package com.codeclan.cs;


import static org.junit.Assert.*;

import org.junit.Test;

public class CowTest {

	@Test
	public void testCowHasType(){
	Cows cowOne = new Cows();
	String type = "highland";
	assertEquals("highland", cowOne.getType());
	}
	
	@Test
	public void testCowHasPrice(){
		Cows cowOne = new Cows();
		int price = 50;
		assertEquals(50, cowOne.getPrice());
	}
	
	@Test
	public void testDisplayCow(){
		Cows cow = new Cows();
		System.out.println(cow);
	}
	
	@Test public void testCowCanEat(){
		Cows cowOne = new Cows();
		Corn cornOne = new Corn();
		cowOne.eat(cornOne);
		assertEquals(cornOne, cowOne.stomach.get(0));
	}
	
}
