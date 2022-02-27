package com.mypackage;

import java.util.List;

public class GameController {

	private Game game = new Game();
	private GameSetup setup = new GameSetup();
	private MovementLogic move = new MovementLogic();
	private UserInterface ui = new UserInterface();

	public GameController() {
		super();
		this.game = game;
		this.setup = setup;
		this.move = move;
		this.ui = ui;
	}

	public void printBoard() {
		System.out.println(game.toString() + "\n");
	}

	public int convertInput(String input) {
		String inputUpper = input.toUpperCase();
		int columnNum;
		switch (inputUpper) {

		case "A":
			columnNum = 1;
			break;

		case "B":
			columnNum = 2;
			break;

		case "C":
			columnNum = 3;
			break;

		default:
			break;
		}
		return columnNum;

	}

	public void playMove() {
		String moveFrom = ui.selectCard().toUpperCase();
		int cardToMove = game.topCard(moveFrom);
		String moveTo = ui.placeCard(cardToMove);
		
		
		move.moveCard(game.getGameBoard(), , )
				
		}

	}

	public void play() {

		if (ui.introduction().toLowerCase().equals("y")) {

			ui.printRules();

			List<Integer> setupList = setup.createRandomStartList();
			game.setGameBoard(setup.generateColumns(setupList));

			printBoard();

			// begin moves

		}

	}
}