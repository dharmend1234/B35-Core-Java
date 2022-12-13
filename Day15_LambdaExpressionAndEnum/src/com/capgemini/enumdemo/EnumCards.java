package com.capgemini.enumdemo;

//we can implement interface using enum
public enum EnumCards implements CardsDemo{
	//Enum constants
	HEART,CLUB,DIAMOND,SPADES;

	@Override
	public void accept() {
		System.out.println("Selected shape in the cards are: "+this);
		
	}

}