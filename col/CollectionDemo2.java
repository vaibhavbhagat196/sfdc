package com.capgemini.sfdc.col;

import java.util.ArrayList;

public class CollectionDemo2 {

	public static void main(String[] args) {

		ArrayList<Integer> marksList = new ArrayList<>();

		marksList.add(98);
		marksList.add(96);
//		marksList.add(98.5); // CE
//		marksList.add("abcd"); // CE

		System.out.println(marksList);
		marksList.add(89);
		marksList.add(90);
		System.out.println(marksList);
		
		

	}

}