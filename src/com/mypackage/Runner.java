package com.mypackage;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) throws InvalidMoveException {

		GameSetup setup = new GameSetup();

		MovementLogic move = new MovementLogic();

		List<Integer> startList = new ArrayList<Integer>(setup.createRandomStartList());

		List<List<Integer>> newList = new ArrayList<>(setup.generateColumns(startList));

		List<List<Integer>> gameList = newList;

		System.out.println(gameList);

		// System.out.println(move.unpackList(newList, 0));

		// System.out.println(move.moveCard(gameList, 0, 0));

	}

}
