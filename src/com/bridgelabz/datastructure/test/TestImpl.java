package com.bridgelabz.datastructure.test;

import com.bridgelabz.datastructure.MyLinkedList;
import com.bridgelabz.datastructure.node.MyNode;

public class TestImpl {

	public static void main(String[] args) {

		MyLinkedList<Integer> intList = new MyLinkedList<>();

		MyNode<Integer> firstNode = new MyNode<>(56);
		intList.append(firstNode);

		MyNode<Integer> secondNode = new MyNode<>(30);
		intList.append(secondNode);

		MyNode<Integer> thirdNode = new MyNode<>(70);
		intList.append(thirdNode);

		MyNode<Integer> fourthNode = new MyNode<>(40);
		intList.append(fourthNode);

		System.out.println("Initial Linked list : ");
		intList.print();

		intList.popLast();

		System.out.println("After performing popLast :");
		intList.print();

	}

}