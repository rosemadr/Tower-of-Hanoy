package com.mypackage;

import java.util.ArrayList;
import java.util.List;

public class UserInterface {
	
		
	public String introduction() {
		System.out.println("Welcome to the Tower of Hannoy\nWould like to play the game?<yes/no>");
		Scanner input = new Scanner(System.in);
	
	
	
	
	
	List<List<Integer>> gameList = new ArrayList<Integer>(setup.generateColumns(setup.createRandomStartList()));

	System.out.println(gameList);
}
}