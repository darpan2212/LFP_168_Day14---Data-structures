package com.bridgelabz.datastructure.test;

import com.bridgelabz.datastructure.OrderedList;

public class TestImpl {

	public static void main(String[] args) {
		OrderedList<Integer> intList = new OrderedList<>();
		
		intList.add(56);
		intList.add(30);
		intList.add(40);
		intList.add(45);
		intList.add(70);
		
		intList.print();
		
	}

}