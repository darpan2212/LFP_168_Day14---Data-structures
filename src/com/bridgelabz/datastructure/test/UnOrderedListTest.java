package com.bridgelabz.datastructure.test;

import static org.junit.Assert.assertEquals;
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

	@Test
	public void insertAtPos() {
		UnOrderedList<Integer> intList = new UnOrderedList<>();
		intList.append(56);
		intList.append(30);
		intList.append(70);
		
		intList.insert(40,2);

		assertEquals(2, intList.index(40));
		intList.print();
	}

	@Test
	public void delete() {
		UnOrderedList<Integer> intList = new UnOrderedList<>();
		intList.append(56);
		intList.append(30);
		intList.append(70);
		
		intList.insert(40,2);

		assertEquals(4, intList.size());
		if (intList.search(40)) {
			intList.remove(40);
		}
		assertEquals(3, intList.size());
		intList.print();
	}
	
}