package com.bridgelabz.datastructure;

import com.bridgelabz.datastructure.node.Node;

public class MyLinkedList<K> {

	Node<K> head;
	Node<K> tail;

	public void add(Node<K> node) {
		if (head == null) {
			head = node;
		}
		if (tail == null) {
			tail = node;
		} else {
			tail.setNext(node);
			tail = node;
		}
	}

	public void print() {
		Node<K> tempNode = head;
		while (tempNode != null) {
			System.out.print(tempNode);
			tempNode = tempNode.getNext();
		}
	}

}