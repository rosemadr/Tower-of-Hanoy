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

	public void convertInput(String input) {
		// add upper   String = input;
		switch ("A")
	}

	public void playMove() {
		String moveFrom = ui.selectCard().toUpperCase();
		String moveTo = ui.placeCard()

{
			case "A":
				
		}
		
	}

	public void play() {

		if (ui.introduction().toLowerCase().equals("yes")) {

			ui.printRules();

			List<Integer> setupList = setup.createRandomStartList();
			game.setGameBoard(setup.generateColumns(setupList));

			printBoard();

			// begin moves

		}

	}
}