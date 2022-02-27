package com.mypackage;

public class Runner {

	public static void main(String[] args) throws InvalidMoveException {

		Game game = new Game();

		GameSetup setup = new GameSetup();

		MovementLogic move = new MovementLogic(game);

		UserInterface ui = new UserInterface();

		GameController play = new GameController(game, setup, move, ui);

//		List<Integer> startList = new ArrayList<Integer>(setup.createRandomStartList());

		play.play();

		// System.out.println(move.unpackList(newList, 0));

		// System.out.println(move.moveCard(gameList, 0, 0));

	}

}
