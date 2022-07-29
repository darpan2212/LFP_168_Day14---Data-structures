package com.bridgelabz.datastructure.test;

import com.bridgelabz.datastructure.UnOrderedList;

public class TestImpl {

	public static void main(String[] args) {

		UnOrderedList<Integer> intList = new UnOrderedList<>();

		intList.add(56);
		intList.add(30);
		intList.add(70);
		intList.add(40);
		intList.add(60);

		System.out.println("Initital unordered list : ");
		intList.print();
		
		intList.remove(60);

		System.out.println("After removing 30 unordered list : ");
		intList.print();
		
	}

}