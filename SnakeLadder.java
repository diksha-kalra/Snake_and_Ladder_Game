package com.snakenladder;

public class SnakeLadder {
	//Constants Declaration
	public static final int NO_PLAY=0;
	public static final int LADDER=1;
	public static final int SNAKE=2;
	public static final int WINNING_POS=100;

	public static void main(String[] args) {

		//Printing the game name
		System.out.println("Snake and Ladder Game \n");
		
		//Initialising the postion 
		int pos=0;
		int dice_rolls=0;

		//Continue to play until final position reached
		while(pos!=WINNING_POS) {
		//Generating random between 1 to 6
		int number_on_dice= 1 + (int)(Math.random() * ((6 - 1) + 1));
		System.out.println("random number is "+number_on_dice );
		dice_rolls++;
		
		//Generating options
		int option = (int) Math.floor(Math.random()*10)%3;
		System.out.println("game option "+option);
		
		switch (option) {
			case NO_PLAY :
				pos+=0;
				System.out.println("No Play, my postion "+pos);
				break;
		
			case LADDER :
				pos+=number_on_dice;
				if(pos>WINNING_POS) {
					pos-=number_on_dice;
				}
				System.out.println("Up on the ladder, new position is "+pos);
				break;
				
			case SNAKE :
				pos-=number_on_dice;
				if(pos<0) {
					pos=0;
				}
				System.out.println("Snake Bite, new position is "+pos);
				break;
		}
		}
		System.out.println("Number of dice rolls to win the game "+dice_rolls);
	}
}
		
