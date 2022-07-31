package com.bridgelabz.datastructure.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.bridgelabz.datastructure.UnOrderedList;

public class UnOrderedListTest {

	@Test
	public void searchTest() {
		UnOrderedList<Integer> intList = new UnOrderedList<>();
		intList.add(56);
		intList.add(30);
		intList.add(70);
		intList.add(40);
		
		assertTrue(intList.search(30));
	}
	
}