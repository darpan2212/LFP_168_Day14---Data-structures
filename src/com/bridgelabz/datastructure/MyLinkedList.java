package com.bridgelabz.datastructure;

import com.bridgelabz.datastructure.node.INode;

public class MyLinkedList<K> {

	INode<K> head;
	INode<K> tail;

	public void append(INode<K> node) {
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

	public void add(INode<K> node) {
		if (head == null) {
			head = node;
		} else {
			node.setNext(head);
			head = node;
		}
		if (tail == null) {
			tail = node;
		}
	}

	public void print() {
		System.out.println(head);
		/*
		 * INode<K> tempNode = head; while (tempNode != null) {
		 * System.out.print(tempNode); tempNode = tempNode.getNext(); }
		 */
	}

	public void add(INode<K> node, int index) {
		INode<K> tempNode = head;
		for (int i = 0; i < index - 1; i++) {
			tempNode = tempNode.getNext();
		}
		if (tempNode != null) {
			node.setNext(tempNode.getNext());
			tempNode.setNext(node);
		} else {
			System.out.println(
					"List index is out of bound, you can not add new element at index "
							+ index);
		}
	}

	public void deleteFirst() {
		INode<K> tempNode = head;
		head = tempNode.getNext();
		tempNode.setNext(null);
	}

}