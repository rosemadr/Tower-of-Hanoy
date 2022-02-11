package com.mypackage;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {

		GameSetup setup = new GameSetup();
		
		MovementLogic move = new MovementLogic();

		List<Integer> startList = new ArrayList<Integer>(setup.createRandomStartList());
		
	
		List<List<Integer>> newList = new ArrayList<>(setup.generateColumns(startList));
		
		System.out.println(newList);

		
		System.out.println(move.unpackLists(newList, 0));
		
		

	}

}
