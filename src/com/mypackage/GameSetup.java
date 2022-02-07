package com.mypackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameSetup {
	private List<Integer> startList = new ArrayList<>();
	private List<Integer> columnA = new ArrayList<>();
	private List<Integer> columnB = new ArrayList<>();
	private List<Integer> columnC = new ArrayList<>();

	public List<Integer> createRandomStartList() {

		Random rand = new Random();

		while (startList.size() < 9) {
			int newNum = rand.nextInt(10);
			if (startList.contains(newNum) || newNum == 0) {
				continue;
			} else {
				startList.add(newNum);

			}
		}
		return startList;
	}

	public List<List> generateColumns(List list) {

		List<List> listOfLists = new ArrayList<>();

		columnA = list.subList(0, 3);
		columnB = list.subList(3, 6);
		columnC = list.subList(6, 9);

		listOfLists.add(columnA);
		listOfLists.add(columnB);
		listOfLists.add(columnC);

		return listOfLists;

	}

}
