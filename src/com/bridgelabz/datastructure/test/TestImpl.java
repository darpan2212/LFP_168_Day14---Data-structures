package com.bridgelabz.datastructure.test;

import com.bridgelabz.datastructure.UnOrderedList;

public class TestImpl {

	public static void main(String[] args) {

		UnOrderedList<Integer> intList = new UnOrderedList<>();

		if (intList.isEmpty()) {
			System.out.println("Int linked list is empty");
		} else {
			System.out.println("Int linked list is not empty");
		}
		System.out.println("----------------------------------");
		intList.add(56);
		intList.add(30);
		intList.add(70);
		intList.add(40);
		intList.add(60);

		System.out.println("Initital unordered list : ");
		intList.print();
		System.out.println("Size of the list : " + intList.size());

		intList.remove(56);
		System.out.println("---------------------------------");
		System.out.println("After removing 56 unordered list : ");
		intList.print();
		System.out.println("Size of the list : " + intList.size());
		System.out.println("---------------------------------");
		if (intList.search(56)) {
			System.out.println("value 56 is available with list");
		} else {
			System.out.println("value 56 is not available with list");
		}

		System.out.println("------------------------------------");
		if (intList.isEmpty()) {
			System.out.println("Int linked list is empty");
		} else {
			System.out.println("Int linked list is not empty");
		}
		
		System.out.println("----------------------------------");
		
		System.out.println("Index of 54 : "+intList.index(54));
		if(intList.index(54) == -1) {
			intList.insert(54, 5);
		}
		intList.print();
		
		System.out.println("Popped out values : "+intList.pop());
		intList.print();
	}

}