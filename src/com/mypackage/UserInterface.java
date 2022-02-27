package com.mypackage;

import java.util.Scanner;

public class UserInterface {

	public UserInterface() {
		super();

	}

	public String introduction() {
		System.out.println("Welcome to the Tower of Hannoy\nWould like to play the game?<yes/no>\n"); // TODO change to
																										// y/n
		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}

//	public void printGameBoard() {
//		System.out.println(game.getGameBoard());
//	}

	public String selectCard() {
		System.out.println("Select the column from which you would like to move a card: <A/B/C>\n");
		Scanner input = new Scanner(System.in);
		return input.nextLine();

	}

	public String placeCard(int cardNum) {
		System.out.println("Select the column where you would like to place that " + cardNum + ": <A/B/C>\n");
		Scanner input = new Scanner(System.in);
		return input.nextLine();

	}

	public String rulesOption() {
		System.out.println("Type <R> to see the rules again.\n");
		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}

	public void printRules() {
		System.out.println(
				"The object of the game is to arrange the cards in one row with 9 at the top in downward sequence with 1"
						+ " (Ace) at the bottom.\nThere are four rules:\n"
						+ "1. You can only move one card at a time.\n"
						+ "2. You can only move the last card in a row.\n"
						+ "3. A card can only move to the end of another row and only if the card at the end of that row is of a higher rank than the card being moved.\n"
						+ "4. When a row is empty a new row can be started from that space using the last card from another row.\n");
	}

	public void printWin() {
		System.out.println("***YOU'VE WON!***\nYou sucessfully arranged the cards in decending order in one row.");
	}

}

//		
//		List<List<Integer>> gameList = new ArrayList<Integer>(setup.generateColumns(setup.createRandomStartList()));
//
//		System.out.println(gameList);
//	}}