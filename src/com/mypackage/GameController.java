package com.mypackage;

import java.util.ArrayList;
import java.util.List;

public class GameController {

	private Game game = new Game();
	private GameSetup setup = new GameSetup();
	private MovementLogic move = new MovementLogic(game);
	private UserInterface ui = new UserInterface();

	public GameController(Game game, GameSetup setup, MovementLogic move, UserInterface ui) {
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
		int columnNum = 0;
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

	public void playMove() throws InvalidMoveException {
		String[] turn = ui.getMove();

		String moveFrom = turn[0].toUpperCase();

		String moveTo = turn[1].toUpperCase();

		int firstColumn = convertInput(moveFrom);
		int secondColumn = convertInput(moveTo);

		move.moveCard(game.getGameBoard(), firstColumn, secondColumn);

	}

	public void play() throws InvalidMoveException {

		if (ui.introduction().toLowerCase().equals("y")) {

			ui.printRules();

			List<Integer> setupList = setup.createRandomStartList();
			game.setGameBoard(setup.generateColumns(setupList));

			printBoard();

			do {

				playMove();

				System.out.println(game.getGameBoard());

				ui.rulesOption();

			} while (stillPlaying() == true);

			ui.printWin();

			// begin moves

		}

	}

//	public boolean isListEmpty(List<Integer> column) {
//		return column.isEmpty();
//	}

	public boolean stillPlaying() {
		List<List<Integer>> gameBoard = game.getGameBoard();

		List<Integer> winningList = new ArrayList<Integer>();

		for (int i = 9; i > 0; i--) {
			winningList.add(i);
		}

		for (List<Integer> c : gameBoard) {

			if (c.equals(winningList)) {
				return false;
			}
		}
		return true;
	}

}