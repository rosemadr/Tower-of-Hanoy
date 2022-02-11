package com.mypackage;

import java.util.Scanner;

public class UserInterface {

	private Game game = new Game();

	public UserInterface(Game game) {
		super();
		this.game = game;
	}

	public String introduction() {
		System.out.println("Welcome to the Tower of Hannoy\nWould like to play the game?<yes/no>");
		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}

	public void printGameBoard() {
		System.out.println(game.getGameBoard());
	}

	public String selectCard() {
		System.out.println("Select the column from which you would like to move a card: <A/B/C>");
		Scanner input = new Scanner(System.in);
		return input.nextLine();

	}

	public String placeCard(int cardNum) {
		System.out.println("Select the column where you would like to place that " + cardNum + ": <A/B/C>");
		Scanner input = new Scanner(System.in);
		return input.nextLine();

	}

	public String rulesOption() {
		System.out.println("Type <R> to see the rules again.");
		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}

	public void printRules() {
		System.out.println(
				"The object of the game is to arrange the cards in one coloumn with 9 at the top in downward sequence with 1"
						+ " (Ace) at the bottom.\nThere are four rules:\n1. ");
	}

}

//		
//		List<List<Integer>> gameList = new ArrayList<Integer>(setup.generateColumns(setup.createRandomStartList()));
//
//		System.out.println(gameList);
//	}}