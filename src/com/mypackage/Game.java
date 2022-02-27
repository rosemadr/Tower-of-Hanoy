package com.mypackage;

import java.util.ArrayList;
import java.util.List;

public class Game {

	private List<List<Integer>> gameBoard = new ArrayList<>();
	private List<Integer> columnA = new ArrayList<>();
	private List<Integer> columnB = new ArrayList<>();
	private List<Integer> columnC = new ArrayList<>();

	public Game() {
		super();
	}

	public int topCard(String columnLetter) {
		List<Integer> column = null;
		switch (columnLetter.toUpperCase()) {
		case "A":
			column = columnA;
			break;

		case "B":
			column = columnB;
			break;

		case "C":
			column = columnC;
			break;

		default:
			break;
		}
		int cardNum = column.get(column.size() - 1);
		return cardNum;
	}

	public List<List<Integer>> packageColumns(List<Integer> columnA, List<Integer> columnB, List<Integer> columnC) {
		List<List<Integer>> listOfLists = new ArrayList<>();
		listOfLists.add(columnA);
		listOfLists.add(columnB);
		listOfLists.add(columnC);
		return listOfLists;
	}

	public List<Integer> unpackColumn(List<List<Integer>> allLists, int i) {
		List<Integer> column = new ArrayList<Integer>(allLists.get(i));
		return column;
	}

	@Override
	public String toString() {
		return "A: " + columnA + "\nB: " + columnB + "\nC: " + columnC;
	}

	public List<Integer> getColumnA() {
		return columnA;
	}

	public void setColumnA(List<Integer> columnA) {
		this.columnA = columnA;
	}

	public List<Integer> getColumnB() {
		return columnB;
	}

	public void setColumnB(List<Integer> columnB) {
		this.columnB = columnB;
	}

	public List<Integer> getColumnC() {
		return columnC;
	}

	public void setColumnC(List<Integer> columnC) {
		this.columnC = columnC;
	}

	public List<List<Integer>> getGameBoard() {
		return gameBoard;
	}

	public void setGameBoard(List<List<Integer>> gameBoard) {
		setColumnA(unpackColumn(gameBoard, 0));
		setColumnB(unpackColumn(gameBoard, 1));
		setColumnC(unpackColumn(gameBoard, 2));
		this.gameBoard = gameBoard;

	}

	public void setGameBoard(List<Integer> columnA, List<Integer> columnB, List<Integer> columnC) {
		this.gameBoard = packageColumns(columnA, columnB, columnC);

	}
}
