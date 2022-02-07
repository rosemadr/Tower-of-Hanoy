package com.mypackage;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {

		GameSetup setup = new GameSetup();

		List<Integer> startList = new ArrayList(setup.createRandomStartList());

		System.out.println(setup.generateColumns(startList));

	}

}
