package com.bridgelabz.datastructure.test;

import com.bridgelabz.datastructure.stack.Stack;

public class StackTest {

	public static void main(String[] args) {

		Stack<Integer> intStack = new Stack<>();

		if (intStack.isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			System.out.println("Stack is not empty");
		}
		System.out.println("Size of the stack : " + intStack.size());
		intStack.push(70);
		intStack.push(30);
		intStack.push(56);

		if (intStack.isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			System.out.println("Stack is not empty");
		}
		System.out.println("Size of the stack : " + intStack.size());

		intStack.print();

		System.out.println("Peeked value : " + intStack.peek());
		intStack.print();
		
		System.out.println("------------------------------------");
		Integer poppedValue;
		while ((poppedValue = intStack.pop()) != null) {
			System.out.println("pop value : " + poppedValue);
			System.out.println("Size of the stack : " + intStack.size());
		}
	}

}