package com.bridgelabz.datastructure.test;

import com.bridgelabz.datastructure.MyLinkedList;
import com.bridgelabz.datastructure.node.MyNode;

public class TestImpl {

	public static void main(String[] args) {

		MyLinkedList<Integer> intList = new MyLinkedList<>();

		MyNode<Integer> firstNode = new MyNode<>(56);
		intList.append(firstNode);

		MyNode<Integer> secondNode = new MyNode<>(70);
		intList.append(secondNode);

		MyNode<Integer> thirdNode = new MyNode<>(30);
		intList.append(thirdNode);

		MyNode<Integer> fourthNode = new MyNode<>(60);
		intList.append(fourthNode);

		MyNode<Integer> fifthNode = new MyNode<>(90);
		intList.append(fifthNode);

		MyNode<Integer> sixthNode = new MyNode<>(190);
		intList.add(sixthNode, 6);

		intList.print();
	}

}