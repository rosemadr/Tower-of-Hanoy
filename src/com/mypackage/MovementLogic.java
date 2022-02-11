package com.mypackage;

import java.util.ArrayList;
import java.util.List;

public class MovementLogic {
	
	// one card to be moved at a time
	// only the bottom card from a column
	// card can only be moved if card it will be placed on is higher rank
	// when a column is empty a new column can be made
	
	private List<Integer> listOfLists = new ArrayList<>();
	private List<Integer> columnA = new ArrayList<>();
	private List<Integer> columnB = new ArrayList<>();
	private List<Integer> columnC = new ArrayList<>();
	
//	listOfLists.add(columnA);
//	listOfLists.add(columnB);
//	listOfLists.add(columnC);
	
	public List<Integer> unpackLists(List<List<Integer>> allLists, int i) {
		List<Integer >column =  new ArrayList<Integer>(allLists.get(i));
		return column;
	}
	
	
	
	
	
	public List<List<Integer>> moveCard(List<List<Integer>> allLists, int moveFrom, int moveTo) {\
		
		int cardOne = allLists.get(moveFrom).get(-1);
		int cardTwo = allLists.get(moveTo).get(-1);
		
		if (cardTwo == )
	
		if (cardOne < cardTwo || )
		
		
		
	}

}
