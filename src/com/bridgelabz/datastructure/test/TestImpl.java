package com.bridgelabz.datastructure.test;

import com.bridgelabz.datastructure.MyLinkedList;
import com.bridgelabz.datastructure.node.MyNode;

public class TestImpl {

	public static void main(String[] args) {

		MyLinkedList<Integer> intList = new MyLinkedList<>();

		MyNode<Integer> firstNode = new MyNode<>(56);
		intList.add(firstNode);

		MyNode<Integer> secondNode = new MyNode<>(30);
		intList.add(secondNode);

		MyNode<Integer> thirdNode = new MyNode<>(70);
		intList.add(thirdNode);

		intList.print();
	}

}