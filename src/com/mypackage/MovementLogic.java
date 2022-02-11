package com.mypackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MovementLogic {

	// one card to be moved at a time
	// only the bottom card from a column
	// card can only be moved if card it will be placed on is higher rank
	// when a column is empty a new column can be made
//	
//	private List<Integer> listOfLists = new ArrayList<>();
//	private List<Integer> columnA = new ArrayList<>();
//	private List<Integer> columnB = new ArrayList<>();
//	private List<Integer> columnC = new ArrayList<>();
//	
//	listOfLists.add(columnA);
//	listOfLists.add(columnB);
//	listOfLists.add(columnC);

	public List<Integer> unpackList(List<List<Integer>> allLists, int i) {
		List<Integer> column = new ArrayList<Integer>(allLists.get(i));
		return column;
	}

	public boolean isListEmpty(List<List<Integer>> allLists, int listNum) {
		return unpackList(allLists, listNum).isEmpty();
	}

	public List<List<Integer>> packageLists(List<Integer> columnA, List<Integer> columnB, List<Integer> columnC) {
		List<List<Integer>> listOfLists = new ArrayList<>();
		listOfLists.add(columnA);
		listOfLists.add(columnB);
		listOfLists.add(columnC);
		return listOfLists;
	}

	public List<List<Integer>> moveCard(List<List<Integer>> allLists, int moveFrom, int moveTo)
			throws InvalidMoveException {

		int cardOne = allLists.get(moveFrom).get(unpackList(allLists, moveFrom).size()-1);
		Optional<Integer> cardTwo = Optional.of(allLists.get(moveTo).get(unpackList(allLists, moveTo).size()-1));

		if (cardOne < cardTwo.orElse(10)) {
			// checks if value in first column is < one in second, if second is empty then
			// will equal true

			// now move the card
			allLists.get(moveTo).add(cardOne);

			// now delete the moved card from the original list
			allLists.get(moveFrom).remove(-1);

			return allLists;
		}
		else {
			throw new InvalidMoveException(
					"You can't move that card to that column, the card can only be placed on a card of a higher rank");
		}

	}

}
