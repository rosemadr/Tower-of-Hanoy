package com.mypackage;

import java.util.ArrayList;
import java.util.List;

public class Game {

	private List<List<Integer>> gameBoard = new ArrayList<>();
	private List<Integer> columnA = new ArrayList<>();
	private List<Integer> columnB = new ArrayList<>();
	private List<Integer> columnC = new ArrayList<>();

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
		this.gameBoard = gameBoard;
	}

}
