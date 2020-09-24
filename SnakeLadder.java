package com.snakenladder;

public class SnakeLadder {
	//Constants Declaration
	public static final int NO_PLAY=0;
	public static final int LADDER=1;
	public static final int SNAKE=2;
	public static final int WINNING_POS=100;
	
	//Method which generates the new position of player based on random option, players previous position and number on dice 
	public static int randomOption(int option, int pos, int number_on_dice) {
		
		switch (option) {
			case NO_PLAY :
				pos+=0;
				System.out.println("No Play, stay on same postion: "+pos);
				break;
		
			case LADDER :
				if(pos+number_on_dice>WINNING_POS) {
					pos+=0;
					System.out.println("Number exceeds winning position, stay at position "+pos);
				}
				else {
					pos+=number_on_dice;
					System.out.println("Up on the ladder, new position: "+pos);
				}
				break;
				
			case SNAKE :
					pos-=number_on_dice;
					if(pos<0) {
						pos=0;
					}
					System.out.println("Snake Bite go down,  new position: "+pos);
				break;
				}
		
				return pos;
	}
	
	public static void main(String[] args) {
		
		//Printing the game name
		System.out.println("Snake and Ladder Game \n");
		
		//Variables
		int pos_player_1=0;
		int pos_player_2=0;
		int dice_rolls_p1=0;
		int dice_rolls_p2=0;
		int option_p1, option_p2;
		int number_on_dice_p1,number_on_dice_p2;
		
		while(pos_player_1!=WINNING_POS || pos_player_2!=WINNING_POS) {
			
		//Player 1 ----------------------------------
		//Generating random between 1 to 6 for player1	
		number_on_dice_p1= 1 + (int)(Math.random() * ((6 - 1) + 1));
		System.out.println("Number on Dice of Player 1 : "+number_on_dice_p1 );
		dice_rolls_p1++;
		
		//Generating random option for player 1
		option_p1 = (int) Math.floor(Math.random()*10)%3;
		System.out.println("Game Option : "+option_p1);
		pos_player_1= randomOption(option_p1,pos_player_1,number_on_dice_p1);
		
		//Condition to check if option is ladder and giving another chance to player 1
		if(option_p1==LADDER && pos_player_1!= WINNING_POS ) {
			
			number_on_dice_p1= 1 + (int)(Math.random() * ((6 - 1) + 1));
			System.out.println("Roll Dice Again Player 1 : "+number_on_dice_p1 );
			dice_rolls_p1++;
			option_p1 = (int) Math.floor(Math.random()*10)%3;
			System.out.println("Game Option : "+option_p1);
			pos_player_1= randomOption(option_p1,pos_player_1,number_on_dice_p1);
		}
		
		//Condition to check if Player 1 reaches first
		if(pos_player_1== WINNING_POS) {
			System.out.println(" Winner ---- Player1 : Number of dice rolls to win the game "+dice_rolls_p1);
			break;
		}
		
		//Player 2 -------------------------------------------
		//Generating random between 1 to 6 for player1	
		number_on_dice_p2= (int)(Math.random()*(6-1+1)+1);
		System.out.println("Number on Dice of Player 2 : "+number_on_dice_p2 );
		dice_rolls_p2++;
		
		//Generating random option for player 2
		option_p2 = (int) Math.floor(Math.random()*10)%3;
		System.out.println("Game Option : "+option_p2);
		pos_player_2= randomOption(option_p2,pos_player_2,number_on_dice_p2);
		
		//Condition to check if option is Ladder and giving another chance to player 2
		if(option_p2==LADDER && pos_player_2!= WINNING_POS) {
			
			number_on_dice_p2= 1 + (int)(Math.random() * ((6 - 1) + 1));
			System.out.println("Roll Dice Again player 2 : "+number_on_dice_p2 );
			dice_rolls_p2++;
			
			option_p2 = (int) Math.floor(Math.random()*10)%3;
			System.out.println(" Game Option : "+option_p2);
			pos_player_2= randomOption(option_p2,pos_player_2,number_on_dice_p2);
		}
		
		//Condition to check if Player 2 wins
		if(pos_player_2== WINNING_POS) {
			System.out.println(" Winner ---- Player2 : Number of dice rolls to win the game "+dice_rolls_p2);
			break;
		}
		
		}
		
	}

}


