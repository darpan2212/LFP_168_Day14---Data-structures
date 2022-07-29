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

		intList.print();

		intList.deleteFirst();
		System.out.println();
		intList.print();

		System.out.println();
		System.out.println(firstNode);
	}

}