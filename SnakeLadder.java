package com.snakenladder;

public class SnakeLadder {
	public static void main(String[] args) {
		
		//Printing the game name
		System.out.println("Snake and Ladder Game \n");
		
		//Initialising position
		int pos=0;
		
		//Generating random between 1 to 6
		int number_on_dice= 1 + (int)(Math.random() * ((6 - 1) + 1));
		System.out.println("random number is "+number_on_dice );

	}
	
}
		
